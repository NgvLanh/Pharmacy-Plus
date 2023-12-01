
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import support.Role;

/**

 @author Lành
 */
public class Pharmacy_Main extends javax.swing.JFrame {

    /** Creates new form Pharmacy_Main */
    public Pharmacy_Main() {
        initComponents();
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
//                    login_Panel.setVisible(true);
                    JOptionPane.showMessageDialog(this, "Chức năng thêm");
                }
                case 7 -> {
                    hideAllPanels();
                    menu.setVisible(false);
                    login_Panel.setVisible(true);
                }
                case 8 -> {
                    System.exit(0);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy Plus");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
