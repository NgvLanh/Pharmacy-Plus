package Components;

import Classes.Customers;
import Classes.Details_Order;
import Classes.Orders;
import Classes.Products;
import DAO.Customers_DAO;
import DAO.Details_Order_DAO;
import DAO.Orders_DAO;
import DAO.Products_DAO;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**

 @author Lành
 */
public class Sales_Panel extends javax.swing.JPanel {

    Customers_DAO customers_DAO = new Customers_DAO();
    Orders_DAO orders_DAO = new Orders_DAO();
    Products_DAO products_DAO = new Products_DAO();
    Details_Order_DAO details_Order_DAO = new Details_Order_DAO();

    private ActionListener actionListener;
    public int panelNumber = 0;

    public Sales_Panel() {
        initComponents();
        upLoadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        lblIdInvoice = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetailsInvoice = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOrđer = new javax.swing.JTable();
        btnCreateInvoice = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnExport = new javax.swing.JButton();
        txtCustomer_PhoneNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Hoá đơn chi tết");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Mã hoá đơn");

        lblIdInvoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Tổng tiền");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("In hoá đơn");

        tblDetailsInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Số lượng", "Giá"
            }
        ));
        jScrollPane1.setViewportView(tblDetailsInvoice);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Quản lý bán sản phẩm __________________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblOrđer.setAutoCreateRowSorter(true);
        tblOrđer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblOrđer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrđer.setRowHeight(25);
        tblOrđer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrđerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblOrđer);
        if (tblOrđer.getColumnModel().getColumnCount() > 0) {
            tblOrđer.getColumnModel().getColumn(0).setResizable(false);
            tblOrđer.getColumnModel().getColumn(1).setResizable(false);
            tblOrđer.getColumnModel().getColumn(2).setResizable(false);
        }
        tblOrđer.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Adding 1

        btnCreateInvoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCreateInvoice.setText("Tạo hoá đơn");
        btnCreateInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateInvoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd))
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreateInvoice)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateInvoice)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Bán sản phẩm", jPanel3);

        tblDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hoá đơn", "Tên sản phẩm", "Số lượng", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetails.setRowHeight(25);
        jScrollPane2.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDetails.getColumnModel().getColumn(2).setResizable(false);
            tblDetails.getColumnModel().getColumn(3).setResizable(false);
        }
        tblDetails.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Adding 1

        btnExport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExport.setText("Xem chi tiết");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        txtCustomer_PhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("SDT KH");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCustomer_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExport)
                    .addComponent(txtCustomer_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hoá dơn", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblOrđerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrđerMouseClicked

    }//GEN-LAST:event_tblOrđerMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        upLoadData();

    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addToInvoice();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCreateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateInvoiceActionPerformed
        createInvoice();
    }//GEN-LAST:event_btnCreateInvoiceActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        showDetaiisInvoice();

    }//GEN-LAST:event_btnExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreateInvoice;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblIdInvoice;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTable tblDetailsInvoice;
    private javax.swing.JTable tblOrđer;
    private javax.swing.JTextField txtCustomer_PhoneNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    // Lanh -- Add event
    public void addActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    // Lanh -- Run event
    public void runActionListener() {
        if (actionListener != null) {
            actionListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        }
    }
    
    // 11/40
    private void fillDataToTable(List<Products> list) {
        DefaultTableModel tableOrderModel = (DefaultTableModel) tblOrđer.getModel();
        tableOrderModel.setRowCount(0);
        for (Products product : list) {
            Object[] row = {product.getIDPro(), product.getNamePro(),
                product.getPrice()};
            tableOrderModel.addRow(row);
        }
    }

    private void upLoadData() {
        String productName = txtSearch.getText().trim();
        List<Products> list = products_DAO.selectByKeyword(productName);
        fillDataToTable(list);
    }

    private boolean phoneNumberExists() {
        String number = txtCustomer_PhoneNumber.getText().trim();
        if (number.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại khách hàng!");
            jTabbedPane1.setSelectedIndex(1);
            return false;
        } else if (!number.matches("\\d{10,11}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại này không hợp lệ!");
            jTabbedPane1.setSelectedIndex(1);
            return false;
        } else {
            Customers customer = customers_DAO.selectbyID(number);
            if (customer != null) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Số điện thoại này chưa đăng ký!");
                return false;
            }
        }
    }
    
//    Here
    // Create a empty invoice
    private void createInvoice() {
        btnAdd.setEnabled(true);
        List<Customers> phone = customers_DAO.selectAll();
        boolean check = true;
        for (Customers customer : phone) {
            if (customer.getPhoneCus().equals(number)) {
                check = false;
            }
        }
        if (check) {
            JOptionPane.showMessageDialog(this, "Số điện thoại này chưa đăng ký!");
            jTabbedPane1.setSelectedIndex(1);
            return;
        }

        Customers customer = customers_DAO.selectbyID(number);
        Orders order = new Orders();
        // Id customer
        order.setIDCus(customer.getIDCus());
        // Id employee
        order.setIDEmpl("NV001"); //
        // Date
        order.setDate(new Date());
        // Price
//        float price = (float) tblOrđer.getValueAt(tblOrđer.getSelectedRow(), 2);
        float price = 0;
        order.setTotal(price);
        // Insert to table ORDER
        orders_DAO.insert(order);
        JOptionPane.showMessageDialog(this, "Tạo hoá đơn thành công!");
    }

    private void addToInvoice() {
        // Set values
        List<Orders> order = orders_DAO.selectAll();
        Products product = products_DAO.selectbyID(String.valueOf(idPro));
        Details_Order details_Order = new Details_Order();
        details_Order.setIDProduct(product.getIDPro());
        details_Order.setNameDetails(product.getNamePro());
        details_Order.setIDOders(order.get(0).getIDBill());
        details_Order.setPriceDetails(product.getPrice());
        details_Order.setQuality(1); // *
        details_Order_DAO.insert(details_Order);
        fillTableInvoice();
    }

    private void fillTableInvoice() {
        DefaultTableModel tableOrderModel = (DefaultTableModel) tblDetails.getModel();
        tableOrderModel.setRowCount(0);
        Orders_DAO orders_DAO = new Orders_DAO();
        Customers_DAO customers_DAO = new Customers_DAO();
        String number = txtCustomer_PhoneNumber.getText().trim();
        Customers customer = customers_DAO.selectbyPhonenumber(number).get(customers_DAO.selectbyPhonenumber(number).size() - 1);
        Orders orders = orders_DAO.selectbyCusId(customer.getIDCus());
        List<Details_Order> details_Orders = details_Order_DAO.selectByIdBill(orders.getIDBill());
        for (Details_Order details_Order : details_Orders) {
            Object[] row = {orders.getIDBill(), details_Order.getNameDetails(), details_Order.getQuality(),
                details_Order.getPriceDetails()};
            tableOrderModel.addRow(row);
        }
        fillDataToTableSold();
    }

    private void showDetaiisInvoice() {
        String number = txtCustomer_PhoneNumber.getText().trim();
        if (number.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại khách hàng!");
            jTabbedPane1.setSelectedIndex(1);
            return;
        } else if (!number.isEmpty() && !number.matches("\\d{10,11}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại này chưa đúng!");
            jTabbedPane1.setSelectedIndex(1);
            return;
        } else {
            btnAdd.setEnabled(true);
            List<Customers> phone = customers_DAO.selectAll();
            boolean check = true;
            for (Customers customer : phone) {
                if (customer.getPhoneCus().equals(number)) {
                    check = false;
                }
            }
            if (check) {
                JOptionPane.showMessageDialog(this, "Số điện thoại này chưa đăng ký!");
                jTabbedPane1.setSelectedIndex(1);
                return;
            }
        }

        jDialog1.setSize(450, 400);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setVisible(true);
        DefaultTableModel tableOrderModel = (DefaultTableModel) tblDetailsInvoice.getModel();
        tableOrderModel.setRowCount(0);
        Orders_DAO orders_DAO = new Orders_DAO();
        Customers_DAO customers_DAO = new Customers_DAO();
        Customers customer = customers_DAO.selectbyPhonenumber(number).get(customers_DAO.selectbyPhonenumber(number).size() - 1);
        Orders orders = orders_DAO.selectbyCusId(customer.getIDCus());
        List<Details_Order> details_Orders = details_Order_DAO.selectByIdBill(orders.getIDBill());
        float total = 0;
        for (Details_Order details_Order : details_Orders) {
            Object[] row = {details_Order.getNameDetails(), details_Order.getQuality(),
                details_Order.getPriceDetails()};
            total += details_Order.getPriceDetails();
            tableOrderModel.addRow(row);
        }
        lblIdInvoice.setText(String.valueOf(orders.getIDBill()));
        lblTotal.setText(String.valueOf(total));
    }
}
