/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectSQL.ConnectSQL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**

 @author Asus
 */
public class Statistics_DAO {

    private List<Object[]> getListOfArray(String sql, String[] columns, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet resultSet = ConnectSQL.executeQuery(sql, args);
            while (resultSet.next()) {
                Object[] vals = new Object[columns.length];
                for (int i = 0; i < columns.length; i++) {
                    vals[i] = resultSet.getObject(columns[i]);
                }
                list.add(vals);
            }
            resultSet.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    // 1 thống kê doanh thu 
    public List<Object[]> getRevenue() {
        String sql = "{CALL sp_Revenue}";
        String[] columns = {"id", "Product_name", "Total_price", "Quantity", "Product_id", "Employee_id", "Customer_id"};
        return this.getListOfArray(sql, columns);
    }
    // 2 Thống kê doanh thu theo tháng chỉ định
    public List<Object[]> getRevenueByMonth(Integer month) {
        String sql = "{CALL sp_Revenue_by_month (?)}";
        String[] columns = {"id", "Product_name", "Total_price", "Quantity", "Product_id", "Employee_id", "Customer_id"};
        return this.getListOfArray(sql, columns, month);
    }
    
    // 2 Thống kê doanh thu theo tháng chỉ định
    public List<Object[]> getRevenueChart() {
        String sql = "{CALL sp_Revenue_Chart}";
        String[] columns = {"OrderYear", "OrderMonth", "MonthlyRevenue"};
        return this.getListOfArray(sql, columns);
    }
    
}
