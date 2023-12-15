package Components;

import Classes.Suppliers;
import DAO.Supply_Dao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import support.Role;

/**

 @author Asus
 */
public class Supplier_Panel extends javax.swing.JPanel {

    Supply_Dao supply_Dao = new Supply_Dao();

    /**
     Creates new form Suppliers_Panel
     */
    public Supplier_Panel() {
        initComponents();
        upLoadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        txtFullName1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPhhoneNumber1 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btnAdd1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtSupplyID = new javax.swing.JTextField();
        txtAddress1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSupply = new javax.swing.JTable();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText(" Quản lí nhà cung cấp____________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );

        jTabbedPane7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        txtFullName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Tên nhà cung cấp:");

        txtPhhoneNumber1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel10.setLayout(new java.awt.GridLayout(1, 0, 10, 5));

        btnAdd1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd1.setText("Thêm");
        btnAdd1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnAdd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        jPanel10.add(btnAdd1);

        btnUpdate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate1.setText("Cập nhật");
        btnUpdate1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnUpdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        jPanel10.add(btnUpdate1);

        btnDelete1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete1.setText("Xoá");
        btnDelete1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnDelete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel10.add(btnDelete1);

        btnClear1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear1.setText("Làm mới");
        btnClear1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnClear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        jPanel10.add(btnClear1);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Số điện thoại:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel22.setText("Thông tin nhà cung cấp");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Mã nhà cung cấp:");

        txtSupplyID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtAddress1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Địa chỉ:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel20)
                            .addComponent(jLabel25)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAddress1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(txtPhhoneNumber1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFullName1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSupplyID, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel22))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtSupplyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtFullName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(62, 62, 62)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        jTabbedPane7.addTab("Thông tin", jPanel9);

        jScrollPane3.setBorder(null);

        tblSupply.setAutoCreateRowSorter(true);
        tblSupply.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblSupply.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSupply.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblSupply.setRowHeight(25);
        tblSupply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplyMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSupply);
        if (tblSupply.getColumnModel().getColumnCount() > 0) {
            tblSupply.getColumnModel().getColumn(0).setResizable(false);
            tblSupply.getColumnModel().getColumn(1).setResizable(false);
            tblSupply.getColumnModel().getColumn(2).setResizable(false);
            tblSupply.getColumnModel().getColumn(3).setResizable(false);
        }

        txtFind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnFind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFind.setText("Tìm");
        btnFind.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane7.addTab("Danh sách", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane7)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        insert();
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        update();
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        delete();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        clear();
        txtSupplyID.setEnabled(true);
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void tblSupplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplyMouseClicked
        selectSuppliersInfo();
    }//GEN-LAST:event_tblSupplyMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        search();
    }//GEN-LAST:event_btnFindActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable tblSupply;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtFullName1;
    private javax.swing.JTextField txtPhhoneNumber1;
    private javax.swing.JTextField txtSupplyID;
    // End of variables declaration//GEN-END:variables

    private void fillDataToTable(List<Suppliers> list) {
        DefaultTableModel suplyTabel = (DefaultTableModel) tblSupply.getModel();
        suplyTabel.setRowCount(0);
        if (list != null) {
            for (Suppliers supply : list) {
                Object[] row = {supply.getIDSupplier(), supply.getNameSupplierString(),
                    supply.getPhone(), supply.getAddress()};
                suplyTabel.addRow(row);
            }
        }
    }

    private void upLoadData() {
        List<Suppliers> list = supply_Dao.selectAll();
        fillDataToTable(list);
    }

    private void search() {
        String id = txtFind.getText().trim();
        Suppliers supplier = supply_Dao.selectbyID(id);
        List<Suppliers> list = new ArrayList<>();
        list.add(supplier);
        fillDataToTable(list);
    }

    private boolean validateData() {
        String supplierId = txtSupplyID.getText().trim();
        if (supplierId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống mã sản xuất");
            return false;
        } else if (!supplierId.matches("^NSX\\d{3}$")) {
            JOptionPane.showMessageDialog(this, "Mã sản xuất không đúng định dạng (NSXxxx)");
            return false;
        }
        String supplyName = txtFullName1.getText().trim();
        if (supplyName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống tên nhà sản xuất");
            return false;
        } else if (!supplyName.matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(this, "Trong tên nhà sản xuất không đúng định dạng");
            return false;
        }
        String phoneNumber = txtPhhoneNumber1.getText().trim();
        if (phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại");
            return false;
        } else if (!phoneNumber.matches("^(09|08|03)\\d{8,9}$")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng (10 hoặc 11 số)");
            return false;
        }
        String supplyAddress = txtAddress1.getText().trim();
        if (supplyAddress.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống địa chỉ");
            return false;
        } else if (!supplyAddress.matches("^[\\p{L} \\d.,]+$")) {
            JOptionPane.showMessageDialog(this, "Trong địa chỉ không đúng định dạng");
            return false;
        }
        return true;
    }

    private Suppliers getDatSuppliers() {
        String supplyName = txtFullName1.getText().trim();
        String phoneNumber = txtPhhoneNumber1.getText().trim();
        String supplyId = txtSupplyID.getText();
        String supplyAddress = txtAddress1.getText().trim();
        Suppliers supply = new Suppliers();
        supply.setNameSupplierString(supplyName);
        supply.setPhone(phoneNumber);
        supply.setAddress(supplyAddress);
        supply.setIDSupplier(supplyId);
        return supply;
    }

    private void setDataToSuppliers(Suppliers supply) {
        txtSupplyID.setText(supply.getIDSupplier());
        txtFullName1.setText(supply.getNameSupplierString());
        txtPhhoneNumber1.setText(supply.getPhone());
        txtAddress1.setText(supply.getAddress());
    }

    private void selectSuppliersInfo() {
        String id = (String) tblSupply.getValueAt(tblSupply.getSelectedRow(), 0);
        Suppliers supply = supply_Dao.selectbyIDSupplier(id);
        if (supply != null) {
            setDataToSuppliers(supply);
            jTabbedPane7.setSelectedIndex(0);
            txtSupplyID.setEnabled(false);
        }
    }

    private boolean duplicate() {
        List<Suppliers> list = supply_Dao.selectAll();
        String supplierString = txtSupplyID.getText().trim();
        if (!supplierString.isEmpty()) {
            String supplierId = supplierString;
            for (Suppliers supplier : list) {
                if (supplier.getIDSupplier().equalsIgnoreCase(supplierId)) {
                    JOptionPane.showMessageDialog(this, "Mã nhà sản xuất đã tồn tại");
                    return false;
                }
            }
        }
        String phoneNumber = txtPhhoneNumber1.getText().trim();
        if (!phoneNumber.isEmpty()) {
            for (Suppliers supplier : list) {
                if (supplier.getPhone().equalsIgnoreCase(phoneNumber)) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại nhà sản xuất đã tồn tại");
                    return false;
                }
            }
        }
        return true;
    }

    private void insert() {
        if (Role.Manager()) {
            if (validateData() && duplicate()) {
                try {
                    supply_Dao.insert(getDatSuppliers());
                    JOptionPane.showMessageDialog(this, "Thêm nhà sản xuất thành công");
                    upLoadData();
                    clear();
                    jTabbedPane7.setSelectedIndex(1);
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Thêm nhà sản xuất thất bại");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nhân viên không đủ quyền hạn");
        }
    }

    private void update() {
        if (Role.Manager()) {
            String supplierId = txtSupplyID.getText().trim();
            if (!supplierId.isEmpty()) {
                if (validateData()) {
                    Suppliers supplier = supply_Dao.selectbyID(supplierId);
                    if (supplier != null) {
                        try {
                            Suppliers info = getDatSuppliers();
                            supply_Dao.update(info);
                            JOptionPane.showMessageDialog(this, "Cập nhật thông tin nhà sản xuất thành công");
                            clear();
                            upLoadData();
                        } catch (RuntimeException e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(this, "Cập nhật nhà sản xuất thất bại");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Dữ liệu không có nhà sản xuất này");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà sản xuất cần cập nhật ở danh sách");
                jTabbedPane7.setSelectedIndex(1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nhân viên không đủ quyền hạn");
        }
    }

    private void delete() {
        if (Role.Manager()) {
            String supplierId = txtSupplyID.getText().trim();
            if (!supplierId.isEmpty()) {
                int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xoá nhà sản xuất này!", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    try {
                        supply_Dao.delete(supplierId);
                        JOptionPane.showMessageDialog(this, "Xoá nhà sản xuất thành công");
                        clear();
                        upLoadData();
                    } catch (RuntimeException e) {
                        JOptionPane.showMessageDialog(this, "Xoá nhà sản xuất thất bại do ràng buộc dữ liệu");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà sản xuất cần xoá ở danh sách");
                jTabbedPane7.setSelectedIndex(1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nhân viên không đủ quyền hạn");
        }
    }

    private void clear() {
        JTextField[] textFields = new JTextField[]{txtSupplyID, txtFullName1, txtPhhoneNumber1, txtAddress1};
        for (JTextField textField : textFields) {
            textField.setText("");
        }
    }
}
