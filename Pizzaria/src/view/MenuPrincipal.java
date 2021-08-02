/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerMenuPrincipal;

/**
 *
 * @author Casa
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final ControllerMenuPrincipal controller;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.controller = new ControllerMenuPrincipal(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        btnFazerPedido = new javax.swing.JButton();
        btnCardapio = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Bem-vindo(a)");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 250, -1));

        lblTitulo2.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setText("a pizzaria Amirat");
        getContentPane().add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 330, -1));

        btnFazerPedido.setBackground(new java.awt.Color(255, 255, 255));
        btnFazerPedido.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnFazerPedido.setText("Fazer pedido");
        btnFazerPedido.setPreferredSize(new java.awt.Dimension(173, 45));
        btnFazerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFazerPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 330, -1));

        btnCardapio.setBackground(new java.awt.Color(255, 255, 255));
        btnCardapio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnCardapio.setText("Ver cardápio");
        btnCardapio.setMaximumSize(new java.awt.Dimension(173, 37));
        btnCardapio.setMinimumSize(new java.awt.Dimension(173, 37));
        btnCardapio.setPreferredSize(new java.awt.Dimension(173, 45));
        btnCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardapioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 330, -1));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(173, 37));
        btnSair.setMinimumSize(new java.awt.Dimension(173, 37));
        btnSair.setPreferredSize(new java.awt.Dimension(173, 45));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 330, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/menuPrincipal.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardapioActionPerformed
        
        controller.navegarParaCardapio();
        
    }//GEN-LAST:event_btnCardapioActionPerformed

    private void btnFazerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerPedidoActionPerformed
        
        controller.navegarParaCardapioPedido();
        
    }//GEN-LAST:event_btnFazerPedidoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCardapio;
    private javax.swing.JButton btnFazerPedido;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    // End of variables declaration//GEN-END:variables
}
