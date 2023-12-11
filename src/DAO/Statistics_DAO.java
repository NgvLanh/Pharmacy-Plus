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

    // Sum revence invoice
    public double getSumRevence(String month) {
        String SQL = "SELECT SUM(TOTAL) FROM ORDERS WHERE MONTH(DATE) = ?";
        double total = 0;
        try {
            ResultSet resultSet = ConnectSQL.executeQuery(SQL, month);
            if (resultSet.next()) {
                total = resultSet.getDouble(1);
            }
            return total;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    // Sum revence invoice
    public double getSumProductPrice(String month) {
        String SQL = "SELECT SUM(Product_price) FROM PRODUCTS WHERE MONTH(PRODUCT_INPUTDATE) = ?";
        double total = 0;
        try {
            ResultSet resultSet = ConnectSQL.executeQuery(SQL, month);
            if (resultSet.next()) {
                total = resultSet.getDouble(1);
            }
            return total;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public List<Object[]> getProductPriceByMonth(Integer month) {
        String sql = "{CALL sp_Product_price_input_by_month (?)}";
        String[] columns = {"Product_Id", "Product_name", "Product_price", "Product_inputDate", "Supplier_id", "Employee_id"};
        return this.getListOfArray(sql, columns, month);
    }
}
