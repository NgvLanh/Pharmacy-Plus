package Components;

import Classes.Products;
import DAO.Products_DAO;
import DAO.Supply_Dao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
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
    Supply_Dao supply_Dao = new Supply_Dao();

    public Products_Panel() {
        initComponents();
        upLoadData();
        fillComboboxType();
        fillComboboxSupplier();
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
        txtNamePro = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        btnChoose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtProID = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDlt = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
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

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Quản lý sản phẩm ________________");

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
        lblProdetail.setText("Loại sản phẩm:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mã NSX :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Mã Nhân Viên :");

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã Sản Phẩm :");

        txtProID.setEditable(false);
        txtProID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                            .addComponent(lblPrice)
                            .addComponent(jLabel6)
                            .addComponent(lblName)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNamePro, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                            .addComponent(txtPrice)
                            .addComponent(txtEmployeeID)
                            .addComponent(txtProID)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtNamePro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdetail)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChoose))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtProID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        tbpArchive.addTab("Thông tin", jPanel1);

        tblProduct.setAutoCreateRowSorter(true);
        tblProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá", "Loại sản phẩm", "Mã NSX", "Mã Nhân Viên", "Ảnh", "Ngày nhâp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduct);
        tblProduct.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 14));
        if (tblProduct.getColumnModel().getColumnCount() > 0) {
            tblProduct.getColumnModel().getColumn(0).setResizable(false);
            tblProduct.getColumnModel().getColumn(1).setResizable(false);
            tblProduct.getColumnModel().getColumn(2).setResizable(false);
            tblProduct.getColumnModel().getColumn(3).setResizable(false);
            tblProduct.getColumnModel().getColumn(4).setResizable(false);
            tblProduct.getColumnModel().getColumn(5).setResizable(false);
            tblProduct.getColumnModel().getColumn(6).setResizable(false);
            tblProduct.getColumnModel().getColumn(7).setResizable(false);
        }

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))
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
                .addComponent(tbpArchive, javax.swing.GroupLayout.PREFERRED_SIZE, 491, Short.MAX_VALUE))
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
    }//GEN-LAST:event_txtNameProMouseClicked

    private void txtPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPriceMouseClicked
    }//GEN-LAST:event_txtPriceMouseClicked

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel3;
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
    public javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtNamePro;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProID;
    private javax.swing.JTextField txtSearch;
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
                    product.getType(),
                    product.getSupplier(),
                    product.getIDEmpl(),
                    product.getImage(),
                    product.getDate()};
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
        String supplierId = jComboBox2.getSelectedItem().toString();
        String productType = jComboBox1.getSelectedItem().toString();

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
        if (productType.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn loại sản phẩm");
            return false;
        }
        if (supplierId.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn mã nhà sản xuất");
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
        String details = jComboBox1.getSelectedItem().toString();
        String supplierId = jComboBox2.getSelectedItem().toString();
        String empId = txtEmployeeID.getText().trim();
        String imageName = lblImage.getToolTipText();
        String productId = txtProID.getText();

        Products product = new Products();
        product.setNamePro(productName);
        product.setPrice(Float.parseFloat(priceString));
        product.setType(details);
        product.setSupplier(supplierId);;
        product.setIDEmpl(empId);
        product.setImage(imageName);
        product.setDate(new Date());
        if (!productId.isEmpty()) {
            product.setIDPro(Integer.parseInt(productId));
        }
        return product;
    }

    private void setDataToStaff(Products product) {
        txtNamePro.setText(product.getNamePro());
        txtPrice.setText(String.valueOf(product.getPrice()));
        jComboBox1.setSelectedItem(product.getType());
        jComboBox2.setSelectedItem(product.getSupplier());
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
            if (productID.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Sản phẩm này chưa có trong danh sách nên không thể cập nhật");
                return;
            }
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
            txtPrice, txtProID};
        for (JTextField textField : textFields) {
            textField.setText("");
        }
        txtEmployeeID.setText(Role.user.getIDEmpl());
        lblImage.setIcon(null);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
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

    // New 12/7
    private void fillComboboxType() {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) jComboBox1.getModel();
        comboBoxModel.removeAllElements();
        comboBoxModel.addElement("");
        List<String> list = products_DAO.selectAllTypes();
        for (String string : list) {
            comboBoxModel.addElement(string);
        }
    }

    private void fillComboboxSupplier() {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) jComboBox2.getModel();
        comboBoxModel.removeAllElements();
        comboBoxModel.addElement("");
        List<String> list = supply_Dao.selectAllSuppliers();
        for (String string : list) {
            comboBoxModel.addElement(string);
        }
    }
}
