package Main;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import support.Role;

/**

 @author Lành
 */
public class Pharmacy_Main extends javax.swing.JFrame {

    /** Creates new form Pharmacy_Main */
    public Pharmacy_Main() {
        initComponents();
        Image logo = new ImageIcon("src\\Images\\original_logo.png").getImage();
        this.setIconImage(logo);
        hideAllPanels();
        menu.setVisible(false);
        login_Panel.setVisible(true);

//  
        login_Panel.addActionListenerToMain(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideAllPanels();
                menu.setVisible(true);
                customer_Panel.txtManv.setText(Role.user.getIDEmpl());
                products_Panel.txtEmployeeID.setText(Role.user.getIDEmpl());
                String empName = Role.user.getNameEmpl();
                String[] nameSplip = empName.split(" ");
                String name = "";
                if (nameSplip.length > 1) {
                    name = nameSplip[nameSplip.length - 1];
                } else {
                    name = nameSplip[0];
                }
                menu.jLabel8.setText("Xin chào " + name);

            }
        });
//        // Menu Products switch
        menu.addActionListener((e) -> {
            int panel = menu.panelNumber;
            switch (panel) {
                case 1 -> {
                    hideAllPanels();
                    sales_Panel.setVisible(true);
                }
                case 2 -> {
                    hideAllPanels();
                    customer_Panel.setVisible(true);
                }
                case 3 -> {
                    hideAllPanels();
                    employee_Panel.setVisible(true);
                }
                case 4 -> {
                    hideAllPanels();
                    products_Panel.setVisible(true);
                }
                case 5 -> {
                    hideAllPanels();
                    statistics_Panel.setVisible(true);
                }
                case 6 -> {
                    hideAllPanels();
                    menu.setVisible(false);
                    login_Panel.setVisible(true);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sales_Panel = new Components.Sales_Panel();
        menu = new Components.Menu();
        customer_Panel = new Components.Customer_Panel();
        login_Panel = new Components.Login_Panel();
        employee_Panel = new Components.Employee_Panel();
        products_Panel = new Components.Products_Panel();
        statistics_Panel = new Components.Statistics_Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy Plus");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(sales_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 600));
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(customer_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 600));
        getContentPane().add(login_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));
        getContentPane().add(employee_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 600));
        getContentPane().add(products_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 600));
        getContentPane().add(statistics_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacy_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacy_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.Customer_Panel customer_Panel;
    private Components.Employee_Panel employee_Panel;
    private Components.Login_Panel login_Panel;
    private Components.Menu menu;
    private Components.Products_Panel products_Panel;
    private Components.Sales_Panel sales_Panel;
    private Components.Statistics_Panel statistics_Panel;
    // End of variables declaration//GEN-END:variables

    // Lanh -- Hide all panels
    private void hideAllPanels() {
        JPanel[] panels = {login_Panel,
            employee_Panel,
            products_Panel,
            customer_Panel,
            sales_Panel,
            statistics_Panel};

        for (JPanel panel : panels) {
            panel.setVisible(false);
        }
    }

}
