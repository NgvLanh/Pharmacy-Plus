package Components;

import Classes.Products;
import DAO.Products_DAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import support.Role;

/**

 @author TIEN
 */
public class Products_Panel extends javax.swing.JPanel {

    Products_DAO products_DAO = new Products_DAO();

    public Products_Panel() {
        initComponents();
        upLoadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tbpArchive = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblProdetail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDetails = new javax.swing.JTextField();
        txtSupplierID = new javax.swing.JTextField();
        txtNamePro = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        btnChoose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDlt = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Quản Lý Sản Phẩm ________________");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpArchive.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("Tên Sản Phẩm :");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrice.setText("Giá Sản Phẩm :");

        lblProdetail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProdetail.setText("Chi Tiết Sản Phẩm :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mã NSX :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Mã Nhân Viên :");

        txtDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDetailsMouseClicked(evt);
            }
        });

        txtSupplierID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSupplierID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSupplierIDMouseClicked(evt);
            }
        });

        txtNamePro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNamePro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameProMouseClicked(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPriceMouseClicked(evt);
            }
        });

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnChoose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnChoose.setText("Chọn");
        btnChoose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 50, 0));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("(*)");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("(*)");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("(*)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã Sản Phẩm :");

        txtProID.setEditable(false);
        txtProID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("(*)");

        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 50, 100));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel6.add(btnAdd);

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel6.add(btnUpdate);

        btnDlt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDlt.setText("Xóa");
        btnDlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltActionPerformed(evt);
            }
        });
        jPanel6.add(btnDlt);

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("Làm Mới");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel6.add(btnReset);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(btnChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProdetail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNamePro, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                            .addComponent(txtPrice)
                            .addComponent(txtDetails)
                            .addComponent(txtSupplierID)
                            .addComponent(txtEmployeeID)
                            .addComponent(txtProID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtNamePro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProdetail)
                            .addComponent(txtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChoose)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtProID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        tbpArchive.addTab("Thông tin", jPanel1);

        tblProduct.setAutoCreateRowSorter(true);
        tblProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá", "Chi Tiết", "Mã NSX", "Mã Nhân Viên", "Ảnh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduct);
        tblProduct.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 14));

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setText("Tìm Kiếm");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbpArchive.addTab("Danh sách", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbpArchive)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbpArchive, javax.swing.GroupLayout.PREFERRED_SIZE, 498, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        selectImage();
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clear();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        insert();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNameProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameProMouseClicked
        txtNamePro.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_txtNameProMouseClicked

    private void txtPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPriceMouseClicked
        txtPrice.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_txtPriceMouseClicked

    private void txtDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDetailsMouseClicked
        txtDetails.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_txtDetailsMouseClicked

    private void txtSupplierIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSupplierIDMouseClicked
        txtSupplierID.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_txtSupplierIDMouseClicked

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        selectEmpployeeInfo();
    }//GEN-LAST:event_tblProductMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltActionPerformed
        delete();
    }//GEN-LAST:event_btnDltActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        search();
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnDlt;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProdetail;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTabbedPane tbpArchive;
    private javax.swing.JTextField txtDetails;
    public javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtNamePro;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSupplierID;
    // End of variables declaration//GEN-END:variables

    // 12/1
    private void fillDataToTable(List<Products> list) {
        DefaultTableModel customerTabel = (DefaultTableModel) tblProduct.getModel();
        customerTabel.setRowCount(0);
        if (list != null) {
            for (Products product : list) {
                Object[] row = {
                    product.getIDPro(),
                    product.getNamePro(),
                    product.getPrice(),
                    product.getDetails(),
                    product.getSupplier(),
                    product.getIDEmpl(),
                    product.getImage()};
                customerTabel.addRow(row);
            }
        }
    }

    private void upLoadData() {
        List<Products> list = products_DAO.selectAll();
        fillDataToTable(list);
    }

    private void search() {
        String employeeId = txtSearch.getText().trim();
        List<Products> list = products_DAO.selectByKeyword(employeeId);
        fillDataToTable(list);
    }

    private boolean validateData() {
        String productName = txtNamePro.getText().trim();
        String priceString = txtPrice.getText().trim();
        String supplierId = txtSupplierID.getText().trim();

        if (productName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống tên sản phẩm");
            return false;
        } else if (!productName.matches("^[\\p{L} \\d]+$")) {
            JOptionPane.showMessageDialog(this, "Tên sản phẩm không đúng định dạng");
            return false;
        } else if (productName.length() > 50) {
            JOptionPane.showMessageDialog(this, "Tên sản phẩm không quá 50 ký tự");
            return false;
        }

        if (priceString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá sản phẩm");
            return false;
        } else {
            try {
                float price = Float.parseFloat(priceString);
                if (price < 1000) {
                    JOptionPane.showMessageDialog(this, "Giá sản phẩm phải hơn 1000");
                    return false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Giá sản phẩm không hợp lệ");
                return false;
            }
        }

        if (supplierId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống mã sản xuất");
            return false;
        } else if (!supplierId.matches("^NSX\\d{3}$")) {
            JOptionPane.showMessageDialog(this, "Mã sản xuất không đúng định dạng (NSXxxx)");
            return false;
        }

        return true;
    }

    private boolean duplicate() {
        String productID = txtProID.getText().trim();
        List<Products> products = products_DAO.selectAll();

        if (!productID.isEmpty()) {
            for (Products product : products) {
                if (product.getIDPro() == Integer.parseInt(productID)) {
                    JOptionPane.showMessageDialog(this, "Mã sản phẩm đã tồn tại");
                    return false;
                }
            }
        }
        return true;
    }

    private Products getDataFromStaff() {
        String productName = txtNamePro.getText().trim();
        String priceString = txtPrice.getText().trim();
        String details = txtDetails.getText().trim();
        String supplierId = txtSupplierID.getText().trim();
        String empId = txtEmployeeID.getText().trim();
        String imageName = lblImage.getToolTipText();
        String productId = txtProID.getText();
        Products product = new Products();
        product.setNamePro(productName);
        product.setPrice(Float.parseFloat(priceString));
        product.setDetails(details);
        product.setSupplier(supplierId);;
        product.setIDEmpl(empId);
        product.setImage(imageName);
        if (!productId.isEmpty()) {
            product.setIDPro(Integer.parseInt(productId));
        }
        return product;
    }

    private void setDataToStaff(Products product) {
        txtNamePro.setText(product.getNamePro());
        txtPrice.setText(String.valueOf(product.getPrice()));
        txtDetails.setText(product.getDetails());
        txtSupplierID.setText(product.getSupplier());
        txtEmployeeID.setText(product.getIDEmpl());
        txtProID.setText(String.valueOf(product.getIDPro()));
        lblImage.setIcon(resizeImages("src\\Images\\" + product.getImage()));
    }

    private void selectEmpployeeInfo() {
        String productID = String.valueOf((int) tblProduct.getValueAt(tblProduct.getSelectedRow(), 0));
        Products product = products_DAO.selectbyID(productID);
        if (product != null) {
            setDataToStaff(product);
            tbpArchive.setSelectedIndex(0);
        }
    }

    private void insert() {
        if (validateData() && duplicate()) {
            try {
                String productID = txtProID.getText().trim();
                if (productID.isEmpty()) {
                    products_DAO.insert(getDataFromStaff());
                    JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công");
                    upLoadData();
                    clear();
                } else {
                    JOptionPane.showMessageDialog(this, "Mã sản phẩm đã tồn tại");
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thất bại");
            }
        }
    }

    private void update() {
        if (validateData()) {
            String productID = txtProID.getText().trim();
            Products product = products_DAO.selectbyID(productID);
            if (product != null) {
                try {
                    Products pro = getDataFromStaff();
                    products_DAO.update(pro);
                    JOptionPane.showMessageDialog(this, "Cập nhật thông tin sản phẩm thành công");
                    clear();
                    upLoadData();
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(this, "Cập nhật sản phẩm thành công");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Dữ liệu không có mã sản phẩm này");
            }
        }

    }

    private void delete() {
        String productID = txtProID.getText().trim();
        if (!productID.isEmpty()) {
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xoá sản phẩm này!", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                Products product = products_DAO.selectbyID(productID);
                if (product != null) {
                    try {
                        products_DAO.delete(productID);
                        JOptionPane.showMessageDialog(this, "Xoá sản phẩm thành công");
                        clear();
                        upLoadData();
                    } catch (RuntimeException e) {
                        JOptionPane.showMessageDialog(this, "Không thể xoá vì còn dữ liệu");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Dữ liệu không có mã sản phẩm này");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần xoá ở danh sách");
            tbpArchive.setSelectedIndex(1);
        }

    }

    private void clear() {
        JTextField[] textFields = new JTextField[]{txtNamePro,
            txtPrice, txtDetails, txtSupplierID, txtProID};
        for (JTextField textField : textFields) {
            textField.setText("");
        }
        txtEmployeeID.setText(Role.user.getIDEmpl());
        lblImage.setIcon(null);
    }

    private void selectImage() {
        JFileChooser fileChooser = new JFileChooser("src\\Images");
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            lblImage.setIcon(resizeImages("src\\Images\\" + file.getName()));
            lblImage.setToolTipText(file.getName());
        }

    }

    private ImageIcon resizeImages(String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(lblImage.getWidth() - 10, lblImage.getHeight() - 10, Image.SCALE_DEFAULT);
        ImageIcon imageResult = new ImageIcon(newImage);
        return imageResult;
    }
}
