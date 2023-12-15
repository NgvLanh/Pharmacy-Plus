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

    final String INSERT_SQL = "INSERT INTO PRODUCTS VALUES (?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE PRODUCTS SET PRODUCT_NAME = ? ,PRODUCT_PRICE = ?,PRODUCT_TYPE = ?,  SUPPLIER_ID = ?, EMPLOYEE_ID = ? ,PRODUCT_IMAGE = ? WHERE PRODUCT_ID = ?";
    final String DELETE_SQL = "DELETE FROM PRODUCTS WHERE PRODUCT_ID = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM PRODUCTS "
                + "WHERE PRODUCT_ID NOT IN ( "
                + "	SELECT PRODUCT_ID "
                + "	FROM CART "
                + ")";
    final String SELECT_BY_ID_SQL = "SELECT * FROM PRODUCTS WHERE PRODUCT_ID = ?";

    @Override
    public void insert(Products entity) {
        ConnectSQL.update(INSERT_SQL,
                entity.getNamePro(),
                entity.getPrice(),
                entity.getImage(),
                entity.getType(),
                entity.getDate(),
                entity.getIDEmpl(),
                entity.getSupplier()
        );
    }

    @Override
    public void update(Products entity) {
        ConnectSQL.update(UPDATE_SQL,
                entity.getNamePro(),
                entity.getPrice(),
                entity.getType(),
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
                entity.setType(rs.getString("Product_type"));
                entity.setDate(rs.getDate("Product_inputDate"));
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
        String SQL = "INSERT INTO CART VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        ConnectSQL.update(SQL,
                entity.getIDPro(),
                entity.getNamePro(),
                entity.getPrice(),
                entity.getImage(),
                entity.getType(),
                entity.getDate(),
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

    // new 12/7
    public List<String> selectAllTypes() {
        String SQL = "SELECT distinct product_type FROM Pharmacy.dbo.Products;";
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = ConnectSQL.executeQuery(SQL);
            while (rs.next()) {
                list.add(rs.getString(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    // 12/7
    public List<Integer> selectMonth() {
        String sql = "SELECT DISTINCT MONTH(Product_inputDate) FROM Products ORDER BY MONTH(Product_inputDate) DESC";
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

    public List<Products> selectCart(String name) {
        String SQL = "SELECT * FROM CART WHERE PRODUCT_NAME LIKE ? ";
        return this.selectbySql(SQL, name);
    }
}
