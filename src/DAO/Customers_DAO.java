package DAO;

import Classes.Customers;
import ConnectSQL.ConnectSQL;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**

 @author Asus
 */
public class Customers_DAO extends System_DAO<Customers, String> {

    final String INSERT_SQL = "INSERT INTO CUSTOMERS VALUES (?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE CUSTOMERS SET CUSTOMER_NAME = ?, CUSTOMER_YEARBIRTH = ?, CUSTOMER_PHONENUMBER = ? WHERE CUSTOMER_ID = ?";
    final String DELETE_SQL = "DELETE FROM CUSTOMERS WHERE CUSTOMER_ID = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM CUSTOMERS";
    final String SELECT_BY_ID_SQL = "SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID = ?";
    final String SELECT_BY_PHONENUMBER_OR_NAME_SQL = "SELECT * FROM CUSTOMERS WHERE CUSTOMER_PHONENUMBER = ? OR CUSTOMER_NAME LIKE ?";
    final String SELECT_BY_PHONENUMBER_SQL = "SELECT * FROM CUSTOMERS WHERE CUSTOMER_PHONENUMBER = ?";

    @Override
    public void insert(Customers entity) {
        ConnectSQL.update(INSERT_SQL,
                entity.getNameCus(),
                entity.getDateBirth(),
                entity.getPhoneCus(),
                entity.getIDEmpl());
    }

    @Override
    public void update(Customers entity) {
        ConnectSQL.update(UPDATE_SQL,
                entity.getNameCus(),
                entity.getDateBirth(),
                entity.getPhoneCus(),
                entity.getIDCus());
    }

    @Override
    public void delete(String id) {
        ConnectSQL.update(DELETE_SQL, id);
    }

    @Override
    public List<Customers> selectAll() {
        return selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public Customers selectbyID(String id) {
        List<Customers> list = this.selectbySql(SELECT_BY_PHONENUMBER_SQL, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<Customers> selectbySql(String sql, Object... args) {
        List<Customers> list = new ArrayList<>();
        try {
            ResultSet resultSet = ConnectSQL.executeQuery(sql, args);
            while (resultSet.next()) {
                Customers customers = new Customers(resultSet.getInt("Customer_id"),
                        resultSet.getString("Employee_id"),
                        resultSet.getString("Customer_name"),
                        resultSet.getString("Customer_phoneNumber"),
                        resultSet.getDate("Customer_yearBirth"));
                list.add(customers);
            }
            resultSet.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Customers> selectbyPhonenumber(String id) {
        List<Customers> list = this.selectbySql(SELECT_BY_PHONENUMBER_OR_NAME_SQL, id, "%" + id + "%");
        if (list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }

    public Customers selectbyIDCus(String id) {
        List<Customers> list = this.selectbySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }
    public Customers selectbyPhonenumberForInvoice(String id) {
        List<Customers> list = this.selectbySql(SELECT_BY_PHONENUMBER_SQL, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }
}
