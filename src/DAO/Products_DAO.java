package DAO;

import Classes.Products;
import ConnectSQL.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**

 @author Asus
 */
public class Products_DAO extends System_DAO<Products, String> {

    final String INSERT_SQL = "INSERT INTO PRODUCTS VALUES (?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE PRODUCTS SET PRODUCT_NAME = ? ,PRODUCT_PRICE = ?,PRODUCT_DETAILS = ?,  SUPPLIER_ID = ?, EMPLOYEE_ID = ? ,PRODUCT_IMAGE = ? WHERE PRODUCT_ID = ?";
    final String DELETE_SQL = "DELETE FROM PRODUCTS WHERE PRODUCT_ID = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM PRODUCTS";
    final String SELECT_BY_ID_SQL = "SELECT * FROM PRODUCTS WHERE PRODUCT_ID = ?";

    @Override
    public void insert(Products entity) {
        ConnectSQL.update(INSERT_SQL,
                entity.getNamePro(),
                entity.getPrice(),
                entity.getImage(),
                entity.getDetails(),
                entity.getSupplier(),
                entity.getIDEmpl()
        );
    }

    @Override
    public void update(Products entity) {
        ConnectSQL.update(UPDATE_SQL,
                entity.getNamePro(),
                entity.getPrice(),
                entity.getDetails(),
                entity.getSupplier(),
                entity.getIDEmpl(),
                entity.getImage(),
                entity.getIDPro()
        );
    }

    @Override
    public void delete(String id) {
        ConnectSQL.update(DELETE_SQL, id);
    }

    @Override
    public List<Products> selectAll() {
        List<Products> list = selectbySql(SELECT_ALL_SQL);
        if (list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }

    @Override
    public Products selectbyID(String id) {
        return this.selectbySql(SELECT_BY_ID_SQL, id).get(0);
    }

    @Override
    protected List<Products> selectbySql(String sql, Object... args) {
        List<Products> list = new ArrayList<>();
        try {
            ResultSet rs = ConnectSQL.executeQuery(sql, args);
            while (rs.next()) {
                Products entity = new Products();
                entity.setIDPro(rs.getInt("Product_Id"));
                entity.setNamePro(rs.getString("Product_name"));
                entity.setPrice(rs.getFloat("Product_price"));
                entity.setImage(rs.getString("Product_image"));
                entity.setDetails(rs.getString("Product_details"));
                entity.setSupplier(rs.getString("Supplier_id"));
                entity.setIDEmpl(rs.getString("Employee_id"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public List<Products> selectByKeyword(String keyword) {
        String SQL = "SELECT * FROM PRODUCTS WHERE PRODUCT_NAME LIKE ? "
                + "     AND Product_Id not in ( "
                + "	select Product_Id "
                + "	from Cart "
                + ") ";
        return this.selectbySql(SQL, "%" + keyword + "%");
    }

    public void insertTempTable(Products entity) {
        String SQL = "INSERT INTO CART VALUES (?, ?, ?, ?, ?, ?, ?)";
        ConnectSQL.update(SQL,
                entity.getIDPro(),
                entity.getNamePro(),
                entity.getPrice(),
                entity.getImage(),
                entity.getDetails(),
                entity.getSupplier(),
                entity.getIDEmpl()
        );
    }

    public List<Products> selectTheOtherProduct() {
            String SQL = "select * from Products "
                    + "where Product_Id not in ( "
                    + "	select Product_Id "
                    + "	from Cart "
                    + ")";
        return selectbySql(SQL);
    }
}
