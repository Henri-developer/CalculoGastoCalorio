package view;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnIMC = new javax.swing.JButton();
        btnGastoCalorico = new javax.swing.JButton();
        btnRecomendacoes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nutri Soft");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        btnIMC.setBackground(new java.awt.Color(102, 255, 102));
        btnIMC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIMC.setForeground(new java.awt.Color(255, 255, 255));
        btnIMC.setText("IMC");
        btnIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMCActionPerformed(evt);
            }
        });

        btnGastoCalorico.setBackground(new java.awt.Color(102, 255, 102));
        btnGastoCalorico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGastoCalorico.setForeground(new java.awt.Color(255, 255, 255));
        btnGastoCalorico.setText("GASTO CALÓRICO");
        btnGastoCalorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastoCaloricoActionPerformed(evt);
            }
        });

        btnRecomendacoes.setBackground(new java.awt.Color(102, 255, 102));
        btnRecomendacoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRecomendacoes.setForeground(new java.awt.Color(255, 255, 255));
        btnRecomendacoes.setText("RECOMENDAÇÕES");
        btnRecomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecomendacoesActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 0, 0));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGastoCalorico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecomendacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(172, 172, 172))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnIMC)
                .addGap(18, 18, 18)
                .addComponent(btnGastoCalorico)
                .addGap(18, 18, 18)
                .addComponent(btnRecomendacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMCActionPerformed
        IMC imc = new IMC();
        imc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIMCActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnGastoCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastoCaloricoActionPerformed
        TelaGastoCalorico telaGastoCalorico = new TelaGastoCalorico();
        telaGastoCalorico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGastoCaloricoActionPerformed

    private void btnRecomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecomendacoesActionPerformed
        TelaRecomendacoes telaRecomendacoes = new TelaRecomendacoes();
        telaRecomendacoes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRecomendacoesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGastoCalorico;
    private javax.swing.JButton btnIMC;
    private javax.swing.JButton btnRecomendacoes;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
