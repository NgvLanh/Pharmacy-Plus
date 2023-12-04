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
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import support.Role;

/**

 @author Lành
 */
public class Sales_Panel extends javax.swing.JPanel {

    Customers_DAO customers_DAO = new Customers_DAO();
    Orders_DAO orders_DAO = new Orders_DAO();
    Products_DAO products_DAO = new Products_DAO();
    Details_Order_DAO details_Order_DAO = new Details_Order_DAO();
    float cusMoney;
    float total = 0;
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
        btnPrintInvoice = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetailsInvoice = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblCusName = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblCusMoney = new javax.swing.JLabel();
        lblMoneyBack = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        miRemoveProductFromInvoice = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        miShowDetailsHistoryInvoice = new javax.swing.JMenuItem();
        jDialog2 = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        lblIdInvoice1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDetailsInvoice1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblCusName1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblEmpId1 = new javax.swing.JLabel();
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
        txtCustomer_PhoneNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnExport = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHistoryInvoice = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txtCustomer_PhoneNumber_SearchHistoryInvoice = new javax.swing.JTextField();
        btnFindInvoice = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Hoá đơn chi tết");
        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(450, 550));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Mã hoá đơn: ");

        lblIdInvoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Tổng tiền: ");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnPrintInvoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPrintInvoice.setText("In hoá đơn");
        btnPrintInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintInvoiceActionPerformed(evt);
            }
        });

        tblDetailsInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Số lượng", "Giá", "Tổng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDetailsInvoice);
        if (tblDetailsInvoice.getColumnModel().getColumnCount() > 0) {
            tblDetailsInvoice.getColumnModel().getColumn(0).setResizable(false);
            tblDetailsInvoice.getColumnModel().getColumn(1).setResizable(false);
            tblDetailsInvoice.getColumnModel().getColumn(2).setResizable(false);
            tblDetailsInvoice.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHIẾU HOÁ ĐƠN THANH TOÁN PHARMACY PLUS");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Tên khác hàng: ");

        lblCusName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Mã nhân viên:");

        lblEmpId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Tiền khách đưa:");

        lblCusMoney.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblMoneyBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Tiền thối lại:");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCusMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMoneyBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIdInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCusName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPrintInvoice)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCusMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMoneyBack, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPrintInvoice)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        miRemoveProductFromInvoice.setText("Xoá");
        miRemoveProductFromInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoveProductFromInvoiceActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miRemoveProductFromInvoice);

        miShowDetailsHistoryInvoice.setText("Xem chi tiết");
        miShowDetailsHistoryInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miShowDetailsHistoryInvoiceActionPerformed(evt);
            }
        });
        jPopupMenu2.add(miShowDetailsHistoryInvoice);

        jDialog2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog2.setTitle("Hoá đơn chi tết");
        jDialog2.setResizable(false);
        jDialog2.setSize(new java.awt.Dimension(486, 450));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Mã hoá đơn: ");

        lblIdInvoice1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Tổng tiền: ");

        lblTotal1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tblDetailsInvoice1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Số lượng", "Giá", "Tổng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblDetailsInvoice1);
        if (tblDetailsInvoice1.getColumnModel().getColumnCount() > 0) {
            tblDetailsInvoice1.getColumnModel().getColumn(0).setResizable(false);
            tblDetailsInvoice1.getColumnModel().getColumn(1).setResizable(false);
            tblDetailsInvoice1.getColumnModel().getColumn(2).setResizable(false);
            tblDetailsInvoice1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PHIẾU HOÁ ĐƠN THANH TOÁN PHARMACY PLUS");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Tên khác hàng: ");

        lblCusName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Mã nhân viên:");

        lblEmpId1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(15, 15, 15)
                        .addComponent(lblTotal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIdInvoice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCusName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdInvoice1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCusName1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpId1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
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

        txtCustomer_PhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("SDT Khách hàng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCustomer_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateInvoice)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateInvoice)
                    .addComponent(txtCustomer_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Bán sản phẩm", jPanel3);

        tblDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hoá đơn", "Mã sản phẩm", "Tên sản phẩm", "Giá", "Số lượng", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetails.setComponentPopupMenu(jPopupMenu1);
        tblDetails.setRowHeight(25);
        jScrollPane2.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDetails.getColumnModel().getColumn(2).setResizable(false);
            tblDetails.getColumnModel().getColumn(3).setResizable(false);
            tblDetails.getColumnModel().getColumn(4).setResizable(false);
            tblDetails.getColumnModel().getColumn(5).setResizable(false);
        }
        tblDetails.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Adding 1

        btnExport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExport.setText("Xem chi tiết");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExport)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Hoá dơn", jPanel4);

        tblHistoryInvoice.setAutoCreateRowSorter(true);
        tblHistoryInvoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblHistoryInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hoá đơn", "Mã nhân viên", "Ngày mua", "Tên khách hàng", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHistoryInvoice.setComponentPopupMenu(jPopupMenu2);
        tblHistoryInvoice.setRowHeight(25);
        jScrollPane4.setViewportView(tblHistoryInvoice);
        if (tblHistoryInvoice.getColumnModel().getColumnCount() > 0) {
            tblHistoryInvoice.getColumnModel().getColumn(0).setResizable(false);
            tblHistoryInvoice.getColumnModel().getColumn(1).setResizable(false);
            tblHistoryInvoice.getColumnModel().getColumn(2).setResizable(false);
            tblHistoryInvoice.getColumnModel().getColumn(3).setResizable(false);
            tblHistoryInvoice.getColumnModel().getColumn(4).setResizable(false);
        }
        tblOrđer.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Adding 1

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("SDT Khách hàng");

        txtCustomer_PhoneNumber_SearchHistoryInvoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnFindInvoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFindInvoice.setText("Tìm");
        btnFindInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindInvoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomer_PhoneNumber_SearchHistoryInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFindInvoice)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindInvoice)
                    .addComponent(txtCustomer_PhoneNumber_SearchHistoryInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lịch sử", jPanel5);

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

    private void btnPrintInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintInvoiceActionPerformed
        printInvoice();
    }//GEN-LAST:event_btnPrintInvoiceActionPerformed

    private void miRemoveProductFromInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoveProductFromInvoiceActionPerformed
        removeProductFromInvoice();
    }//GEN-LAST:event_miRemoveProductFromInvoiceActionPerformed

    private void btnFindInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindInvoiceActionPerformed
        upLoadDataInvoiceHistory();
    }//GEN-LAST:event_btnFindInvoiceActionPerformed

    private void miShowDetailsHistoryInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miShowDetailsHistoryInvoiceActionPerformed
        showDetaiisHistoryInvoice();
    }//GEN-LAST:event_miShowDetailsHistoryInvoiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreateInvoice;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnFindInvoice;
    private javax.swing.JButton btnPrintInvoice;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCusMoney;
    private javax.swing.JLabel lblCusName;
    private javax.swing.JLabel lblCusName1;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblEmpId1;
    private javax.swing.JLabel lblIdInvoice;
    private javax.swing.JLabel lblIdInvoice1;
    private javax.swing.JLabel lblMoneyBack;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JMenuItem miRemoveProductFromInvoice;
    private javax.swing.JMenuItem miShowDetailsHistoryInvoice;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTable tblDetailsInvoice;
    private javax.swing.JTable tblDetailsInvoice1;
    private javax.swing.JTable tblHistoryInvoice;
    private javax.swing.JTable tblOrđer;
    private javax.swing.JTextField txtCustomer_PhoneNumber;
    private javax.swing.JTextField txtCustomer_PhoneNumber_SearchHistoryInvoice;
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
                new DecimalFormat("###,###đ").format(product.getPrice())};
            tableOrderModel.addRow(row);
        }
    }

    private void upLoadData() {
        String productName = txtSearch.getText().trim();
        List<Products> list = products_DAO.selectByKeyword(productName);
        fillDataToTable(list);
    }

    private boolean phoneNumberExists() {
        String phoneNumber = txtCustomer_PhoneNumber.getText().trim();
        if (phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại khách hàng!");
            return false;
        } else if (!phoneNumber.matches("\\d{10,11}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại này không hợp lệ!");
            return false;
        } else {
            Customers customer = customers_DAO.selectbyID(phoneNumber);
            if (customer != null) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Số điện thoại này chưa đăng ký!");
                return false;
            }
        }
    }

    // Create a empty invoice
    private void createInvoice() {
        if (phoneNumberExists()) {
            String phoneNumber = txtCustomer_PhoneNumber.getText().trim();
            Customers customer = customers_DAO.selectbyID(phoneNumber);
            Orders order = new Orders();
            order.setDate(new Date());
            order.setTotal(0);
            order.setIDCus(customer.getIDCus());
            order.setIDEmpl(Role.user.getIDEmpl());
            orders_DAO.insert(order);
            JOptionPane.showMessageDialog(this, "Tạo hoá đơn thành công");
            btnCreateInvoice.setEnabled(false);
            btnAdd.setEnabled(true);
        }
    }

    private void addToInvoice() {
        int check = tblOrđer.getSelectedRow();
        if (check != -1) {
            if (phoneNumberExists()) {
                String selectedProductID = String.valueOf((int) tblOrđer.getValueAt(tblOrđer.getSelectedRow(), 0));
                Products product = products_DAO.selectbyID(selectedProductID);

                Details_Order details_Order = new Details_Order();
                details_Order.setNameDetails(product.getNamePro());
                details_Order.setPriceDetails(product.getPrice());
                details_Order.setIDProduct(product.getIDPro());
                details_Order.setQuality(1);

                List<Orders> order = orders_DAO.selectAll();
                details_Order.setIDOders(order.get(0).getIDBill());

                List<Details_Order> details_Orders = details_Order_DAO.selectByIdBill(order.get(0).getIDBill());
                String productName = String.valueOf(tblOrđer.getValueAt(tblOrđer.getSelectedRow(), 1));

                boolean productExists = false;
                if (details_Orders != null) {
                    for (Details_Order details : details_Orders) {
                        if (details.getNameDetails().equalsIgnoreCase(productName)) {
                            productExists = true;
                            break;
                        }
                    }
                }
                if (productExists) {
                    Details_Order existingOrder = details_Order_DAO.selectByProductName(productName, order.get(0).getIDBill());
                    if (existingOrder != null) {
                        existingOrder.setQuality(existingOrder.getQuality() + 1);
                        details_Order_DAO.update(existingOrder);
                    }
                } else {
                    details_Order_DAO.insert(details_Order);
                }
                products_DAO.insertTempTable(product);
                upLoadDataAffterAddInvoice();
                fillTableInvoice();
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm vào hoá đơn thành công");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần mua");
        }
    }

    private void upLoadDataAffterAddInvoice() {
        List<Products> list = products_DAO.selectTheOtherProduct();
        fillDataToTable(list);
    }

    // 12/2
    private void fillTableInvoice() {
        DefaultTableModel tableOrderModel = (DefaultTableModel) tblDetails.getModel();
        tableOrderModel.setRowCount(0);

        String number = txtCustomer_PhoneNumber.getText().trim();
        Customers customer = customers_DAO.selectbyPhonenumberForInvoice(number);
        List<Orders> orders = orders_DAO.selectbyCusId(customer.getIDCus());

        List<Details_Order> details_Orders = details_Order_DAO.selectByIdBill(orders.get(orders.size() - 1).getIDBill());

        if (details_Orders != null) {
            for (Details_Order details_Order : details_Orders) {
                Object[] row = {details_Order.getIDOders(), details_Order.getIDProduct(),
                    details_Order.getNameDetails(),
                    new DecimalFormat("###,###đ").format(details_Order.getPriceDetails()),
                    details_Order.getQuality(),
                    new DecimalFormat("###,###đ").format((details_Order.getPriceDetails() * details_Order.getQuality()))};
                tableOrderModel.addRow(row);
            }
        }

    }

    private void showDetaiisInvoice() {
        int rowCheck = tblDetails.getRowCount();
        if (rowCheck > 0) {
            DefaultTableModel tableOrderModel = (DefaultTableModel) tblDetailsInvoice.getModel();
            tableOrderModel.setRowCount(0);

            List<Orders> orders = orders_DAO.selectAll();
            List<Details_Order> list = details_Order_DAO.selectByIdBill(orders.get(0).getIDBill());

            for (Details_Order details_Order : list) {
                Object[] row = {details_Order.getNameDetails(), details_Order.getQuality(),
                    new DecimalFormat("###,###đ").format(details_Order.getPriceDetails()),
                    new DecimalFormat("###,###đ").format((details_Order.getQuality() * details_Order.getPriceDetails()))};

                total += (details_Order.getQuality() * details_Order.getPriceDetails());
                tableOrderModel.addRow(row);
            }

            while (true) {
                String cusMoneyString = JOptionPane.showInputDialog("Tổng: " + new DecimalFormat("###,###đ").format(total) + "\nNhập số tiền khách đưa");
                if (cusMoneyString == null) {
                    return;
                }
                try {
                    cusMoney = Float.parseFloat(cusMoneyString);
                    if (cusMoney < total) {
                        JOptionPane.showMessageDialog(this, "Không đủ tiền để thanh toán");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Hãy nhập đúng định dạng");
                }
            }

            lblIdInvoice.setText(String.valueOf(orders.get(0).getIDBill()));
            Customers customer = customers_DAO.selectbyIDCus(String.valueOf(orders.get(0).getIDCus()));
            lblCusName.setText(customer.getNameCus());
            lblEmpId.setText(orders.get(0).getIDEmpl());
            lblTotal.setText(new DecimalFormat("###,###đ").format(total));
            lblCusMoney.setText(new DecimalFormat("###,###đ").format(cusMoney));
            lblMoneyBack.setText(new DecimalFormat("###,###đ").format(cusMoney - total));

            jDialog1.setLocationRelativeTo(null);
            jDialog1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Chưa có sản phẩm nào để thanh toán");
        }

    }

    private void removeProductFromInvoice() {
        try {
            int productId = (int) tblDetails.getValueAt(tblDetails.getSelectedRow(), 1);
            int orderId = (int) tblDetails.getValueAt(tblDetails.getSelectedRow(), 0);
            String productName = (String) tblDetails.getValueAt(tblDetails.getSelectedRow(), 2);
            details_Order_DAO.removeProductFromCart(productId, orderId, productName);
            upLoadDataAffterAddInvoice();
            fillTableInvoice();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm");
        }
    }

    private void upLoadDataInvoiceHistory() {
        String customerPhone = txtCustomer_PhoneNumber_SearchHistoryInvoice.getText().trim();
        Customers customer = null;
        if (customerPhone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại");
        } else if (!customerPhone.matches("\\d{10,11}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại này không hợp lệ!");
            return;
        } else {
            try {
                customer = customers_DAO.selectbyPhonenumber(customerPhone).get(0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Số điện thoại này chưa đăng ký!");
                return;
            }

            if (customer != null) {
                List<Orders> list = orders_DAO.selectbyIdOrderCustomer(String.valueOf(customer.getIDCus()));
                if (list != null) {
                    DefaultTableModel tableOrderModel = (DefaultTableModel) tblHistoryInvoice.getModel();
                    tableOrderModel.setRowCount(0);
                    for (Orders info : list) {
                        Object[] row = {info.getIDBill(), info.getIDEmpl(), info.getDate(), customer.getNameCus(),
                            new DecimalFormat("###,###đ").format(info.getTotal())};
                        tableOrderModel.addRow(row);
                    }
                }
            }
        }

    }

    private void showDetaiisHistoryInvoice() {
        DefaultTableModel tableOrderModel = (DefaultTableModel) tblDetailsInvoice1.getModel();
        tableOrderModel.setRowCount(0);
        Orders orders = orders_DAO.selectbyID(String.valueOf((int) tblHistoryInvoice.getValueAt(tblHistoryInvoice.getSelectedRow(), 0)));

        List<Details_Order> list = details_Order_DAO.selectByIdBill(orders.getIDBill());
        float total = 0;
        for (Details_Order details_Order : list) {
            Object[] row = {details_Order.getNameDetails(), details_Order.getQuality(),
                new DecimalFormat("###,###đ").format(details_Order.getPriceDetails()),
                new DecimalFormat("###,###đ").format((details_Order.getQuality() * details_Order.getPriceDetails()))};

            total += (details_Order.getQuality() * details_Order.getPriceDetails());
            tableOrderModel.addRow(row);
        }

        lblIdInvoice1.setText(String.valueOf(orders.getIDBill()));
        Customers customer = customers_DAO.selectbyIDCus(String.valueOf(orders.getIDCus()));
        lblCusName1.setText(customer.getNameCus());
        lblEmpId1.setText(orders.getIDEmpl());
        lblTotal1.setText(new DecimalFormat("###,###đ").format(total));

        jDialog2.setLocationRelativeTo(null);
        jDialog2.setVisible(true);
    }

    private void printInvoice() {
        List<Orders> order = orders_DAO.selectAll();
        details_Order_DAO.updateTotalMoneyForInvoice(total, order.get(0).getIDBill());
        jDialog1.setVisible(false);
        JOptionPane.showMessageDialog(this, "Thành công");
        DefaultTableModel tableModel = (DefaultTableModel) tblDetails.getModel();
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }

        btnCreateInvoice.setEnabled(true);
        btnAdd.setEnabled(true);
        txtCustomer_PhoneNumber.setText(null);
        new Statistics_Panel().fillTableByMonth();
    }
}
