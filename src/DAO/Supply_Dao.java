/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Supplier;
import ConnectSQL.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**

 @author ADMIN
 */
public class Supply_Dao extends System_DAO<Supplier, String> {

    final String INSERT_SQL = "INSERT INTO Suppliers VALUES (?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE Suppliers SET Supplier_name = ?, Supplier_phoneNumber = ?,  Supplier_address = ? WHERE Supplier_Id = ?";
    final String DELETE_SQL = "DELETE FROM Suppliers WHERE Supplier_Id = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM Suppliers";
    final String SELECT_BY_ID_SQL = "SELECT * FROM Suppliers WHERE Supplier_Id LIKE ?";

    @Override
    public void insert(Supplier entity) {
        ConnectSQL.update(INSERT_SQL,
                entity.getIDSupplier(),
                entity.getNameSupplierString(),
                entity.getAddress(),
                entity.getPhone());
    }

    @Override
    public void update(Supplier entity) {
        ConnectSQL.update(UPDATE_SQL,
                entity.getNameSupplierString(),
                entity.getPhone(),
                entity.getAddress(),
                entity.getIDSupplier());
    }

    @Override
    public void delete(String id) {
        ConnectSQL.update(DELETE_SQL, id);
    }

    @Override
    public List<Supplier> selectAll() {
        List<Supplier> list = selectbySql(SELECT_ALL_SQL);
        if (list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }

    @Override
    public Supplier selectbyID(String id) {
        List<Supplier> list = selectbySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    protected List<Supplier> selectbySql(String sql, Object... args) {
        List<Supplier> list = new ArrayList<>();
        try {
            ResultSet rs = ConnectSQL.executeQuery(sql, args);
            while (rs.next()) {
                Supplier entity = new Supplier();
                entity.setIDSupplier(rs.getString("Supplier_Id"));
                entity.setNameSupplierString(rs.getString("Supplier_name"));
                entity.setAddress(rs.getString("Supplier_address"));
                entity.setPhone(rs.getString("Supplier_phoneNumber"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public Supplier selectbyIDSupplier(String id) {
        List<Supplier> list = this.selectbySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public List<String> selectAllSuppliers() {
        String SQL = "SELECT distinct Supplier_id FROM Pharmacy.dbo.Suppliers;";
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
}
