/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerCardapio;

/**
 *
 * @author Casa
 */
public class Cardapio extends javax.swing.JFrame {
    
    private final ControllerCardapio controller;

    /**
     * Creates new form MenuPrincipal
     */
    public Cardapio() {
        initComponents();
        this.controller = new ControllerCardapio(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblPizza1 = new javax.swing.JLabel();
        lblPreco1 = new javax.swing.JLabel();
        lblPizza2 = new javax.swing.JLabel();
        lblPreco2 = new javax.swing.JLabel();
        lblPizza3 = new javax.swing.JLabel();
        lblPreco3 = new javax.swing.JLabel();
        lblPizza4 = new javax.swing.JLabel();
        lblPreco4 = new javax.swing.JLabel();
        lblPizza5 = new javax.swing.JLabel();
        lblPreco5 = new javax.swing.JLabel();
        lblPizza6 = new javax.swing.JLabel();
        lblPreco6 = new javax.swing.JLabel();
        lblPizza7 = new javax.swing.JLabel();
        lblPreco7 = new javax.swing.JLabel();
        lblPizza8 = new javax.swing.JLabel();
        lblPreco8 = new javax.swing.JLabel();
        lblPizza9 = new javax.swing.JLabel();
        lblPreco9 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Cardápio");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 170, -1));

        lblPizza1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPizza1.setForeground(new java.awt.Color(255, 255, 255));
        lblPizza1.setText("À Moda da Casa");
        getContentPane().add(lblPizza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, -1));

        lblPreco1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPreco1.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco1.setText("R$ 44,00");
        getContentPane().add(lblPreco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 130, -1));

        lblPizza2.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPizza2.setForeground(new java.awt.Color(255, 255, 255));
        lblPizza2.setText("Aliche");
        getContentPane().add(lblPizza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 90, -1));

        lblPreco2.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPreco2.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco2.setText("R$ 35,00");
        getContentPane().add(lblPreco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 130, -1));

        lblPizza3.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPizza3.setForeground(new java.awt.Color(255, 255, 255));
        lblPizza3.setText("Baurú");
        getContentPane().add(lblPizza3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 90, -1));

        lblPreco3.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPreco3.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco3.setText("R$ 34,00");
        getContentPane().add(lblPreco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 130, -1));

        lblPizza4.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPizza4.setForeground(new java.awt.Color(255, 255, 255));
        lblPizza4.setText("Baiana");
        getContentPane().add(lblPizza4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 100, -1));

        lblPreco4.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPreco4.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco4.setText("R$ 37,00");
        getContentPane().add(lblPreco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 130, -1));

        lblPizza5.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPizza5.setForeground(new java.awt.Color(255, 255, 255));
        lblPizza5.setText("Brasileira");
        getContentPane().add(lblPizza5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 140, -1));

        lblPreco5.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPreco5.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco5.setText("R$ 40,00");
        getContentPane().add(lblPreco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 130, -1));

        lblPizza6.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPizza6.setForeground(new java.awt.Color(255, 255, 255));
        lblPizza6.setText("Paraguaia");
        getContentPane().add(lblPizza6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 140, -1));

        lblPreco6.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPreco6.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco6.setText("R$ 42,00");
        getContentPane().add(lblPreco6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 160, 130, -1));

        lblPizza7.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPizza7.setForeground(new java.awt.Color(255, 255, 255));
        lblPizza7.setText("Portuguesa");
        getContentPane().add(lblPizza7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 150, -1));

        lblPreco7.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPreco7.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco7.setText("R$ 39,00");
        getContentPane().add(lblPreco7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, 130, -1));

        lblPizza8.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPizza8.setForeground(new java.awt.Color(255, 255, 255));
        lblPizza8.setText("Vegetariana");
        getContentPane().add(lblPizza8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 160, -1));

        lblPreco8.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPreco8.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco8.setText("R$ 40,00");
        getContentPane().add(lblPreco8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 320, 130, -1));

        lblPizza9.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPizza9.setForeground(new java.awt.Color(255, 255, 255));
        lblPizza9.setText("Frango com Catupiry");
        getContentPane().add(lblPizza9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 280, -1));

        lblPreco9.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        lblPreco9.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco9.setText("R$ 38,00");
        getContentPane().add(lblPreco9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, 130, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/cardapio.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        this.controller.voltarParaMenu();
        
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblPizza1;
    private javax.swing.JLabel lblPizza2;
    private javax.swing.JLabel lblPizza3;
    private javax.swing.JLabel lblPizza4;
    private javax.swing.JLabel lblPizza5;
    private javax.swing.JLabel lblPizza6;
    private javax.swing.JLabel lblPizza7;
    private javax.swing.JLabel lblPizza8;
    private javax.swing.JLabel lblPizza9;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JLabel lblPreco2;
    private javax.swing.JLabel lblPreco3;
    private javax.swing.JLabel lblPreco4;
    private javax.swing.JLabel lblPreco5;
    private javax.swing.JLabel lblPreco6;
    private javax.swing.JLabel lblPreco7;
    private javax.swing.JLabel lblPreco8;
    private javax.swing.JLabel lblPreco9;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
