/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Gabriel
 */
public class TelaAction extends javax.swing.JFrame {

    /**
     * Creates new form TelaAction
     */
    public TelaAction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuBancaDefesa = new javax.swing.JMenuItem();
        menuEventoCientifico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        validacoes = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuEventoCientificoChefe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jMenu1.setText("Professor");

        menuBancaDefesa.setText("Banca de Defesa");
        menuBancaDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBancaDefesaActionPerformed(evt);
            }
        });
        jMenu1.add(menuBancaDefesa);

        menuEventoCientifico.setText("Evento Científico");
        menuEventoCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEventoCientificoActionPerformed(evt);
            }
        });
        jMenu1.add(menuEventoCientifico);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Chefe de Departamento");

        validacoes.setText("Validações");
        validacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validacoesActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Banca de Defesa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        validacoes.add(jMenuItem3);

        menuEventoCientificoChefe.setText("Evento Científico");
        menuEventoCientificoChefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEventoCientificoChefeActionPerformed(evt);
            }
        });
        validacoes.add(menuEventoCientificoChefe);

        jMenu2.add(validacoes);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaBancaDefesaChefe bancaChefe = new TelaBancaDefesaChefe();
        bancaChefe.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuEventoCientificoChefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEventoCientificoChefeActionPerformed
        TelaEventoCientificoChefe eventoChefe = new TelaEventoCientificoChefe();
        eventoChefe.setVisible(true);
    }//GEN-LAST:event_menuEventoCientificoChefeActionPerformed

    private void menuBancaDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBancaDefesaActionPerformed
        TelaBancaDefesa bancaDefesa = new TelaBancaDefesa();
        bancaDefesa.setVisible(true);
    }//GEN-LAST:event_menuBancaDefesaActionPerformed

    private void menuEventoCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEventoCientificoActionPerformed
        TelaEventoCientifico eventoCientifico = new TelaEventoCientifico();
        eventoCientifico.setVisible(true);
    }//GEN-LAST:event_menuEventoCientificoActionPerformed

    private void validacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validacoesActionPerformed
        
    }//GEN-LAST:event_validacoesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuBancaDefesa;
    private javax.swing.JMenuItem menuEventoCientifico;
    private javax.swing.JMenuItem menuEventoCientificoChefe;
    private javax.swing.JMenu validacoes;
    // End of variables declaration//GEN-END:variables
}
