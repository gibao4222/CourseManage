/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author duy
 */
public class GUIMain extends javax.swing.JFrame {

    /**
     * Creates new form GUIMain
     */
    public GUIMain() {
        initComponents();
//        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder2 = new Custom.PanelBorder();
        menu1 = new Custom.Menu();
        lb_QLD = new javax.swing.JLabel();
        lb_QLPC = new javax.swing.JLabel();
        label_QLKH = new javax.swing.JLabel();
        PanelSwitch = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("frameMain\n"); // NOI18N
        setResizable(false);

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        lb_QLD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_QLD.setForeground(new java.awt.Color(255, 255, 255));
        lb_QLD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_QLD.setText("Quản lý điểm");
        lb_QLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_QLDMouseClicked(evt);
            }
        });

        lb_QLPC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_QLPC.setForeground(new java.awt.Color(255, 255, 255));
        lb_QLPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_QLPC.setText("Quản lý phân công");
        lb_QLPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_QLPCMouseClicked(evt);
            }
        });

        label_QLKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_QLKH.setForeground(new java.awt.Color(255, 255, 255));
        label_QLKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_QLKH.setText("Quản lý khóa học");
        label_QLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_QLKHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_QLPC, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(lb_QLD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(label_QLKH, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(label_QLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_QLD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_QLPC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(501, Short.MAX_VALUE))
        );

        PanelSwitch.setPreferredSize(new java.awt.Dimension(1056, 720));

        javax.swing.GroupLayout PanelSwitchLayout = new javax.swing.GroupLayout(PanelSwitch);
        PanelSwitch.setLayout(PanelSwitchLayout);
        PanelSwitchLayout.setHorizontalGroup(
            PanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1056, Short.MAX_VALUE)
        );
        PanelSwitchLayout.setVerticalGroup(
            PanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_QLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_QLDMouseClicked
        // TODO add your handling code here:
        clickListenerLeftMenu(new QuanLyDiemGUI());
    }//GEN-LAST:event_lb_QLDMouseClicked

    private void lb_QLPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_QLPCMouseClicked
        // TODO add your handling code here:
        clickListenerLeftMenu(new QuanLyPhanCongGUI());
    }//GEN-LAST:event_lb_QLPCMouseClicked

    private void label_QLKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_QLKHMouseClicked
        // TODO add your handling code here:
        clickListenerLeftMenu(new QuanLyKhoaHocGUI());
    }//GEN-LAST:event_label_QLKHMouseClicked

    private void clickListenerLeftMenu(JPanel panelPara){
        //hàm chung để chuyển cái GUI con
        
        
        //Bỏ hết các GUI con cũ trước khi add GUI con mới vào
        PanelSwitch.removeAll();
        //lấy Bounds của jDesktopPanel để set Bound cho GUI con
        panelPara.setBounds(0,0,PanelSwitch.getPreferredSize().width,PanelSwitch.getPreferredSize().height);
        // làm cho GUI con hiển thị
        panelPara.setVisible(true);
        // add GUI con vào jDesktopPanel
        PanelSwitch.add(panelPara);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PanelSwitch;
    private javax.swing.JLabel label_QLKH;
    private javax.swing.JLabel lb_QLD;
    private javax.swing.JLabel lb_QLPC;
    private Custom.Menu menu1;
    private Custom.PanelBorder panelBorder2;
    // End of variables declaration//GEN-END:variables
}
