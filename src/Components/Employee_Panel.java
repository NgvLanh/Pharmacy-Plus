package Components;

import Classes.Staff;
import DAO.Staff_DAO;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import support.Role;

/**

 @author PHUC
 */
public class Employee_Panel extends javax.swing.JPanel {

    Staff_DAO staff_DAO = new Staff_DAO();

    public Employee_Panel() {
        initComponents();
        upLoadData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        txtFullName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPhhoneNumber = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rdoManager = new javax.swing.JRadioButton();
        rdoEmployee = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtPassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        txtFullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Họ tên");

        txtPhhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel8.setLayout(new java.awt.GridLayout(1, 0, 10, 5));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel8.add(btnAdd);

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel8.add(btnUpdate);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Xoá");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel8.add(btnDelete);

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear.setText("Làm mới");
        btnClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel8.add(btnClear);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Số điện thoại");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setText("Thông tin nhân viên");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Mã nhân viên");

        txtEmployeeId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Năm sinh");

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Địa chỉ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Vai trò");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Mật khẩu");

        buttonGroup1.add(rdoManager);
        rdoManager.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoManager.setText("Quản lý");

        buttonGroup1.add(rdoEmployee);
        rdoEmployee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoEmployee.setText("Nhân viên");

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                    .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(rdoManager)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoEmployee))
                                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel14)))
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(rdoManager)
                    .addComponent(rdoEmployee))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("Thông tin", jPanel7);

        jScrollPane3.setBorder(null);

        tblStaff.setAutoCreateRowSorter(true);
        tblStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Năm sinh", "Số điện thoại", "Địa chỉ", "Vai trò", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStaff.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblStaff.setRowHeight(25);
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblStaff);
        if (tblStaff.getColumnModel().getColumnCount() > 0) {
            tblStaff.getColumnModel().getColumn(0).setResizable(false);
            tblStaff.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblStaff.getColumnModel().getColumn(1).setResizable(false);
            tblStaff.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblStaff.getColumnModel().getColumn(2).setResizable(false);
            tblStaff.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblStaff.getColumnModel().getColumn(3).setResizable(false);
            tblStaff.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblStaff.getColumnModel().getColumn(4).setResizable(false);
            tblStaff.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblStaff.getColumnModel().getColumn(5).setResizable(false);
            tblStaff.getColumnModel().getColumn(5).setPreferredWidth(10);
            tblStaff.getColumnModel().getColumn(6).setResizable(false);
            tblStaff.getColumnModel().getColumn(6).setPreferredWidth(10);
        }
        tblStaff.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 14));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFind.setText("Tìm");
        btnFind.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));
        btnFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Danh sách", jPanel1);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Quản lý nhân viên ___________________");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        search();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        selectEmpployeeInfo();
    }//GEN-LAST:event_tblStaffMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        search();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        insert();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
        txtEmployeeId.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoEmployee;
    private javax.swing.JRadioButton rdoManager;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhhoneNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    // 11/30
    private void fillDataToTable(List<Staff> list) {
        DefaultTableModel customerTabel = (DefaultTableModel) tblStaff.getModel();
        customerTabel.setRowCount(0);
        if (list != null) {
            for (Staff employee : list) {
                Object[] row = {employee.getIDEmpl(), employee.getNameEmpl(),
                    employee.getDate(), employee.getPhoneEmpl(), employee.getAddressEmpl(),
                    employee.isRole() ? "Quản lý" : "Nhân viên", "*****"};
                customerTabel.addRow(row);
            }
        }
    }

    private void upLoadData() {
        List<Staff> list = staff_DAO.selectAll();
        fillDataToTable(list);
    }

    private void search() {
        String employeeId = txtSearch.getText().trim();
        List<Staff> list = staff_DAO.searchEmployee(employeeId);
        fillDataToTable(list);
    }

    private boolean validateData() {
        String userName = txtEmployeeId.getText().trim();
        String fullName = txtFullName.getText().trim();
        Date birthYear = jDateChooser1.getDate();
        String phoneNumber = txtPhhoneNumber.getText().trim();
        String address = txtAddress.getText().trim();
        boolean manager = rdoManager.isSelected();
        boolean employee = rdoEmployee.isSelected();
        String password = new String(txtPassword.getPassword()).trim();

        if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên");
            return false;
        } else if (!userName.matches("^(NV|nv)\\d{3}$")) {
            JOptionPane.showMessageDialog(this, "Mã đăng nhập nên có định dang như (NVxxx or nvxxx)");
            return false;
        }

        if (fullName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên");
            return false;
        } else if (!fullName.matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(this, "Trong tên không đúng định dạng");
            return false;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -18);
        Date now = new Date();
        Date eighteen = calendar.getTime();

        if (birthYear == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày sinh");
            return false;
        } else if (birthYear.after(now)) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ");
            return false;
        } else if (birthYear.after(eighteen)) {
            JOptionPane.showMessageDialog(this, "Bạn chưa dủ 18 tuổi");
            return false;
        }

        if (phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại");
            return false;
        } else if (!phoneNumber.matches("^(09|08|03)\\d{8,9}$")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng (10 hoặc 11 số)");
            return false;
        }

        if (address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ");
            return false;
        }

        if (!manager && !employee) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn vai trò (Quản lý/Nhân viên)");
            return false;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");
            return false;
        } else if (!password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không đủ mạnh (Chữ hoa, thường, kí tự, số, dài 8+)");
            return false;
        }
        return true;
    }

    private boolean duplicate() {
        String userName = txtEmployeeId.getText().trim();
        String phoneNumber = txtPhhoneNumber.getText().trim();
        List<Staff> staff = staff_DAO.selectAll();

        for (Staff employee : staff) {
            if (employee.getIDEmpl().equalsIgnoreCase(userName)) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại");
                return false;
            }
            if (employee.getPhoneEmpl().equalsIgnoreCase(phoneNumber)) {
                JOptionPane.showMessageDialog(this, "Số điện thoại nhân viên đã tồn tại");
                return false;
            }
        }
        return true;
    }

    private Staff getDataFromStaff() {
        String userName = txtEmployeeId.getText().trim();
        String fullName = txtFullName.getText().trim();
        Date birthYear = jDateChooser1.getDate();
        String phoneNumber = txtPhhoneNumber.getText().trim();
        String address = txtAddress.getText().trim();
        boolean manager = rdoManager.isSelected();
        String password = new String(txtPassword.getPassword()).trim();

        return new Staff(userName,
                fullName,
                phoneNumber,
                address,
                password,
                manager,
                birthYear);
    }

    private void setDataToStaff(Staff employee) {
        txtEmployeeId.setText(employee.getIDEmpl());
        txtFullName.setText(employee.getNameEmpl());
        jDateChooser1.setDate(employee.getDate());
        txtPhhoneNumber.setText(employee.getPhoneEmpl());
        txtAddress.setText(employee.getAddressEmpl());
        boolean role = employee.isRole();
        if (role) {
            rdoManager.setSelected(true);
        } else {
            rdoEmployee.setSelected(true);
        }
        txtPassword.setText(employee.getPassword());
    }

    private void selectEmpployeeInfo() {
        String employeeId = (String) tblStaff.getValueAt(tblStaff.getSelectedRow(), 0);
        Staff employee = staff_DAO.selectbyID(employeeId);
        if (employee != null) {
            setDataToStaff(employee);
            jTabbedPane1.setSelectedIndex(0);
            txtEmployeeId.setEnabled(false);
        }
    }

    private void insert() {
        if (Role.Manager()) {
            if (validateData() && duplicate()) {
                try {
                    staff_DAO.insert(getDataFromStaff());
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công");
                    upLoadData();
                    clear();
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nhân viên không đủ quyền hạn");
        }
    }

    private void update() {
        if (Role.Manager()) {
            if (validateData()) {
                String empId = txtEmployeeId.getText().trim();
                if (empId.isEmpty()) {
                 JOptionPane.showMessageDialog(this, "Nhân viên này chưa có trong danh sách nên không thể cập nhật");
                 return;
            }
                Staff emp = staff_DAO.selectbyID(empId);
                if (emp != null) {
                    try {
                        Staff employee = getDataFromStaff();
                        staff_DAO.update(employee);
                        JOptionPane.showMessageDialog(this, "Cập nhật thông tin nhân viên thành công");
                        clear();
                        upLoadData();
                    } catch (RuntimeException e) {
                        JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thành công");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Dữ liệu không có mã nhân viên này");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nhân viên không đủ quyền hạn");
        }
    }

    private void delete() {
        String empId = txtEmployeeId.getText().trim();
        if (Role.Manager()) {
            if (!empId.isEmpty()) {
                int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xoá nhân viên này!", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    Staff emp = staff_DAO.selectbyID(empId);
                    if (emp != null) {
                        if (emp.getIDEmpl().equals(Role.user.getIDEmpl())) {
                            JOptionPane.showMessageDialog(this, "Bạn không thể xoá chính minh");
                        } else {
                            try {
                                staff_DAO.delete(empId);
                                JOptionPane.showMessageDialog(this, "Xoá nhân viên thành công");
                                clear();
                                upLoadData();
                            } catch (RuntimeException e) {
                                JOptionPane.showMessageDialog(this, "Không thể xoá vì còn dữ liệu");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Dữ liệu không có mã nhân viên này");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập hoặc chọn nhân viên cần xoá ở danh sách");
                jTabbedPane1.setSelectedIndex(1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nhân viên không đủ quyền hạn");
        }
    }

    private void clear() {
        JTextField[] textFields = new JTextField[]{txtEmployeeId, txtFullName, txtPassword, txtPhhoneNumber, txtAddress};
        for (JTextField textField : textFields) {
            textField.setText("");
        }
        jDateChooser1.setDate(null);
        buttonGroup1.clearSelection();
    }

}
