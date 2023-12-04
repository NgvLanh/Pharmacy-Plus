/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Orders;
import ConnectSQL.ConnectSQL;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**

 @author Lành
 */
public class Orders_DAO extends System_DAO<Orders, String> {

    final String INSERT_SQL = "INSERT INTO ORDERS VALUES (?,?,?,?)";
//    final String UPDATE_SQL = "UPDATE ORDERS SET CUSTOMER_NAME = ?,CUSTOMER_YEARBIRTH = ?,EMPLOYEE_ID =? WHERE CUSTOMER_PHONENUMBER = ?";
    final String DELETE_SQL = "DELETE FROM ORDERS WHERE PRODUCT_ID = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM ORDERS ORDER BY ID DESC";
    final String SELECT_BY_ID_SQL = "SELECT * FROM ORDERS WHERE CUSTOMER_ID LIKE ?";

    @Override
    public void insert(Orders entity) {
        ConnectSQL.update(INSERT_SQL,
                entity.getDate(),
                entity.getTotal(),
                entity.getIDCus(),
                entity.getIDEmpl());
    }

    @Override
    public void update(Orders entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(String id) {
        ConnectSQL.update(DELETE_SQL, id);
    }

    @Override
    public List<Orders> selectAll() {
        return this.selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public Orders selectbyID(String id) {
        return this.selectbySql("SELECT * FROM ORDERS WHERE ID = ?", id).get(0);
    }

    @Override
    protected List<Orders> selectbySql(String sql, Object... args) {
        List<Orders> list = new ArrayList<>();
        try {
            ResultSet resultSet = ConnectSQL.executeQuery(sql, args);
            while (resultSet.next()) {
                Orders orders = new Orders(resultSet.getInt("ID"),
                        resultSet.getInt("Customer_Id"),
                        resultSet.getString("Employee_Id"),
                        resultSet.getDate("Date"),
                        resultSet.getFloat("Total"));
                list.add(orders);
            }
            resultSet.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            return null;
        }
    }

    // Extra
    public List<Orders> selectbyCusId(int id) {
        String SQL = "SELECT * FROM ORDERS WHERE CUSTOMER_ID = ? ORDER BY CUSTOMER_ID DESC";
        return this.selectbySql(SQL, id);
    }

    public List<Integer> selectMonth() {
        String sql = "SELECT DISTINCT MONTH(DATE) FROM ORDERS ORDER BY MONTH(DATE) DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet resultSet = ConnectSQL.executeQuery(sql);
            while (resultSet.next()) {
                list.add(resultSet.getInt(1));
            }
            resultSet.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public List<Orders> selectbyIdOrderCustomer(String id) {
        List<Orders> list = selectbySql(SELECT_BY_ID_SQL, "%" + id + "%");
        if (!list.isEmpty()) {
            return list;
        } else {
            return null;
        }
    }
}
