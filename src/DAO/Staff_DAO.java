
package DAO;

import Classes.Staff;
import java.util.List;
import ConnectSQL.ConnectSQL;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**

 @author Asus
 */
public class Staff_DAO extends System_DAO<Staff, String> {

    final String INSERT_SQL = "INSERT INTO STAFF VALUES (?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE STAFF SET EMPLOYEE_NAME = ?, EMPLOYEE_YEARBIRTH = ?, EMPLOYEE_PHONENUMBER = ?, EMPLOYEE_ADDRESS = ?, EMPLOYEE_ROLE =?, PASSWORDS=? WHERE EMPLOYEE_ID = ?";
    final String DELETE_SQL = "DELETE FROM STAFF WHERE EMPLOYEE_ID = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM STAFF";
    final String SELECT_BY_ID_SQL = "SELECT * FROM STAFF WHERE EMPLOYEE_ID LIKE ?";

    @Override
    public void insert(Staff entity) {
        ConnectSQL.update(INSERT_SQL,
                entity.getIDEmpl(),
                entity.getNameEmpl(),
                entity.getDate(),
                entity.getPhoneEmpl(),
                entity.getAddressEmpl(),
                entity.isRole(),
                entity.getPassword());
    }

    @Override
    public void update(Staff entity) {
        ConnectSQL.update(UPDATE_SQL,
                entity.getNameEmpl(),
                entity.getDate(),
                entity.getPhoneEmpl(),
                entity.getAddressEmpl(),
                entity.isRole(),
                entity.getPassword(),
                entity.getIDEmpl());
    }

    @Override
    public void delete(String id) {
        ConnectSQL.update(DELETE_SQL, id);
    }

    @Override
    public List<Staff> selectAll() {
        return this.selectbySql(SELECT_ALL_SQL);
    }

    @Override
    public Staff selectbyID(String id) {
        List<Staff> list = selectbySql(SELECT_BY_ID_SQL, "%" + id + "%");
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    protected List<Staff> selectbySql(String sql, Object... args) {
        List<Staff> list = new ArrayList<>();
        try {
            ResultSet rs = ConnectSQL.executeQuery(sql, args);
            while (rs.next()) {
                Staff entity = new Staff();
                entity.setIDEmpl(rs.getString("Employee_Id"));
                entity.setNameEmpl(rs.getString("Employee_name"));
                entity.setDate(rs.getDate("Employee_yearBirth"));
                entity.setPhoneEmpl(rs.getString("Employee_phoneNumber"));
                entity.setAddressEmpl(rs.getString("Employee_address"));
                entity.setRole(rs.getBoolean("Employee_role"));
                entity.setPassword(rs.getString("Passwords"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public List<Staff> searchEmployee(String id) {
        List<Staff> list = selectbySql(SELECT_BY_ID_SQL, "%" + id + "%");
        if (list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }
}
