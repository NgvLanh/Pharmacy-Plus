/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Details_Order;
import ConnectSQL.ConnectSQL;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**

 @author Lành
 */
public class Details_Order_DAO extends System_DAO<Details_Order, String> {

    final String INSERT_SQL = "INSERT INTO Details_Order VALUES (?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE Details_Order SET QUANTITY = ? WHERE PRODUCT_NAME LIKE ? AND ORDER_ID = ?";
    final String DELETE_SQL = "DELETE FROM Details_Order WHERE ID = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM Details_Order";
    final String SELECT_BY_ID_SQL = "SELECT * FROM Details_Order WHERE ID = ?";
    final String SELECT_BY_PRODUCTNAME_SQL = "SELECT * FROM Details_Order WHERE PRODUCT_NAME LIKE ? AND ORDER_ID = ?";

    @Override
    public void insert(Details_Order entity) {
        ConnectSQL.update(INSERT_SQL,
                entity.getNameDetails(),
                entity.getPriceDetails(),
                entity.getQuality(),
                entity.getIDProduct(),
                entity.getIDOders());
    }

    @Override
    public void update(Details_Order entity) {
        ConnectSQL.update(UPDATE_SQL,
                entity.getQuality(),
                entity.getNameDetails(),
                entity.getIDOders());
    }

    @Override
    public void delete(String id) {
        ConnectSQL.update(DELETE_SQL, id);
    }

    @Override
    public List<Details_Order> selectAll() {
        return this.selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public Details_Order selectbyID(String id) {
        return this.selectbySql(SELECT_BY_ID_SQL, id).get(0);
    }

    @Override
    protected List<Details_Order> selectbySql(String sql, Object... args) {
        List<Details_Order> list = new ArrayList<>();
        try {
            ResultSet resultSet = ConnectSQL.executeQuery(sql, args);
            while (resultSet.next()) {
                Details_Order orders = new Details_Order(resultSet.getInt("ID"),
                        resultSet.getInt("Order_Id"),
                        resultSet.getInt("Product_Id"),
                        resultSet.getInt("Quantity"),
                        resultSet.getString("Product_name"),
                        resultSet.getFloat("Product_price"));
                list.add(orders);
            }
            resultSet.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            return null;
        }
    }

    public List<Details_Order> selectByIdBill(int id) {
        return this.selectbySql("SELECT * FROM DETAILS_ORDER WHERE ORDER_ID = ?", id);
    }

    public Details_Order selectByProductName(String name, int id) {
        return this.selectbySql(SELECT_BY_PRODUCTNAME_SQL, name, id).get(0);
    }

    public void updateTotalMoneyForInvoice(float total, int id) {
        String SQL = "UPDATE ORDERS SET TOTAL = ? WHERE ID = ?";
        ConnectSQL.update(SQL, total, id);
    }
    
    public void removeProductFromCart(int productId, int orderId, String name) {
        String SQL = "DELETE FROM CART WHERE PRODUCT_ID = ? "
                + "DELETE FROM DETAILS_ORDER WHERE ORDER_ID = ? AND PRODUCT_NAME LIKE ?";
        ConnectSQL.update(SQL, productId, orderId, name);
    }
    
}
