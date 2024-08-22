package view;

import javax.swing.JOptionPane;

public class TelaRecomendacoes extends javax.swing.JFrame {

    public TelaRecomendacoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlDados = new javax.swing.JPanel();
        lblDados = new javax.swing.JLabel();
        txtCaloriasDiarias = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        pnlResultados = new javax.swing.JPanel();
        lblCarbo = new javax.swing.JLabel();
        lblProteina = new javax.swing.JLabel();
        lblGordura = new javax.swing.JLabel();
        lblResultCarbo = new javax.swing.JLabel();
        lblResultProteina = new javax.swing.JLabel();
        lblResultGordura = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recomendações");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(153, 255, 153));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Recomendações");

        pnlDados.setBackground(new java.awt.Color(255, 255, 255));

        lblDados.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblDados.setForeground(new java.awt.Color(102, 255, 102));
        lblDados.setText("Calorias diárias (kcal):");

        txtCaloriasDiarias.setBackground(new java.awt.Color(255, 255, 255));
        txtCaloriasDiarias.setForeground(new java.awt.Color(102, 255, 102));
        txtCaloriasDiarias.setText("Suas calorias aqui");
        txtCaloriasDiarias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCaloriasDiariasMouseClicked(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(102, 255, 102));
        btnCalcular.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblDados)
                        .addGap(18, 18, 18)
                        .addComponent(txtCaloriasDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnCalcular)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDados)
                    .addComponent(txtCaloriasDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addContainerGap())
        );

        pnlResultados.setBackground(new java.awt.Color(255, 255, 255));

        lblCarbo.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lblCarbo.setForeground(new java.awt.Color(102, 255, 102));
        lblCarbo.setText("Carboidratos (50%):");

        lblProteina.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lblProteina.setForeground(new java.awt.Color(102, 255, 102));
        lblProteina.setText("Proteina (25%):");

        lblGordura.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lblGordura.setForeground(new java.awt.Color(102, 255, 102));
        lblGordura.setText("Gordura (25%):");

        lblResultCarbo.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lblResultCarbo.setForeground(new java.awt.Color(102, 255, 102));

        lblResultProteina.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lblResultProteina.setForeground(new java.awt.Color(102, 255, 102));

        lblResultGordura.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        lblResultGordura.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarbo)
                    .addComponent(lblProteina)
                    .addComponent(lblGordura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResultCarbo, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(lblResultProteina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultGordura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCarbo)
                    .addComponent(lblResultCarbo, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProteina)
                    .addComponent(lblResultProteina, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGordura)
                    .addComponent(lblResultGordura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 0, 0));
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
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(18, 18, 18))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTitulo))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void txtCaloriasDiariasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCaloriasDiariasMouseClicked
        this.txtCaloriasDiarias.setText("");
    }//GEN-LAST:event_txtCaloriasDiariasMouseClicked

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double calorias;
        double carboidratos;
        double proteinas;
        double gorduras;
        
        try {
            if(this.txtCaloriasDiarias.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha o campo!");
            } else {

                calorias = Double.parseDouble(this.txtCaloriasDiarias.getText());

                carboidratos = calorias * 0.5 / 4;
                proteinas = calorias * 0.25 /4;
                gorduras = calorias * 0.25 /9;

                String carboidratoFormatado = String.format("%.2f", carboidratos);
                String proteinaFormatada = String.format("%.2f", proteinas);
                String gorduraFormatada = String.format("%.2f", gorduras);

                this.lblResultCarbo.setText(carboidratoFormatado + "g");
                this.lblResultProteina.setText(proteinaFormatada + "g");
                this.lblResultGordura.setText(gorduraFormatada + "g");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insira apenas números no campo!");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRecomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRecomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRecomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRecomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRecomendacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCarbo;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblGordura;
    private javax.swing.JLabel lblProteina;
    private javax.swing.JLabel lblResultCarbo;
    private javax.swing.JLabel lblResultGordura;
    private javax.swing.JLabel lblResultProteina;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JTextField txtCaloriasDiarias;
    // End of variables declaration//GEN-END:variables
}
