package view;

import controller.ValidacaoIMC;

public class IMC extends javax.swing.JFrame {

    private double imc;
    
    public IMC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        pnlDados = new javax.swing.JPanel();
        lblAltura = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblMsgErro = new javax.swing.JLabel();
        pnlResultados = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        lblInterpretacao = new javax.swing.JLabel();
        lblResultadoCalculo = new javax.swing.JLabel();
        lblResultadoIMC = new javax.swing.JLabel();
        lblCalculoImc = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IMC");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(153, 255, 153));

        pnlDados.setBackground(new java.awt.Color(255, 255, 255));

        lblAltura.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(102, 255, 102));
        lblAltura.setText("Altura (cm):");

        lblPeso.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(102, 255, 102));
        lblPeso.setText("Peso (kg)");

        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setForeground(new java.awt.Color(153, 153, 153));
        txtAltura.setText("Sua altura aqui");
        txtAltura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAlturaMouseClicked(evt);
            }
        });

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setForeground(new java.awt.Color(153, 153, 153));
        txtPeso.setText("Seu peso aqui");
        txtPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPesoMouseClicked(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(102, 255, 102));
        btnCalcular.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblMsgErro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMsgErro.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAltura)
                    .addComponent(lblPeso))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtPeso))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(lblMsgErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsgErro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlResultados.setBackground(new java.awt.Color(255, 255, 255));

        lblResultado.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(102, 255, 102));
        lblResultado.setText("Resultado:");

        lblInterpretacao.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblInterpretacao.setForeground(new java.awt.Color(102, 255, 102));
        lblInterpretacao.setText("Interpretação");

        lblResultadoCalculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResultadoCalculo.setForeground(new java.awt.Color(102, 255, 102));

        lblResultadoIMC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResultadoIMC.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInterpretacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResultadoCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(lblResultadoIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultado)
                    .addComponent(lblResultadoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInterpretacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultadoIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblCalculoImc.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblCalculoImc.setForeground(new java.awt.Color(255, 255, 255));
        lblCalculoImc.setText("Cálculo de IMC");

        lblResult.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 255, 255));
        lblResult.setText("Resultado");

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
                .addGap(34, 34, 34)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblCalculoImc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addComponent(lblResult))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCalculoImc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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

    private void txtAlturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAlturaMouseClicked
        txtAltura.setText("");
    }//GEN-LAST:event_txtAlturaMouseClicked

    private void txtPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesoMouseClicked
        txtPeso.setText("");
    }//GEN-LAST:event_txtPesoMouseClicked

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        boolean sucesso;
        
        String mensagem;
        double imc;
        
        double altura;
        double peso;
        
        double alturaCalc;
        double pesoCalc;
        
        ValidacaoIMC validacaoIMC = new ValidacaoIMC();
        
        try{
            // Validando se o campo 'altura' não está vazio
            if(!txtAltura.getText().isEmpty()){
                altura = Double.parseDouble(txtAltura.getText());
            } else {
                altura = 0;
            }
            
            // Validando se o campo 'peso' não está vazio
            if(!txtPeso.getText().isEmpty()){
                peso = Double.parseDouble(txtPeso.getText());
            } else {
                peso = 0;
            }
            
            sucesso = validacaoIMC.validacaoCampos(altura, peso);
            
            if(sucesso) {

                alturaCalc = Double.parseDouble(txtAltura.getText());
                pesoCalc = Double.parseDouble(txtPeso.getText());

                imc = pesoCalc / (alturaCalc / 100 * alturaCalc / 100);

                if(imc < 18.5){
                    mensagem = "Magreza";
                } else if(imc > 18.5 && imc < 24.9){
                    mensagem = "Normal";
                } else if(imc > 25 && imc < 29.9){
                    mensagem = "Sobrepeso";
                } else if(imc > 30 && imc < 39.9){
                    mensagem = "Obesidade";
                } else {
                    mensagem = "Obesidade grave";
                }

                lblResultadoCalculo.setText(Double.toString(imc));
                lblResultadoIMC.setText(mensagem);

            } else {
                this.lblMsgErro.setText("Preencha todos os CAMPOS!");
            } 
        } catch(Exception e){
            this.lblMsgErro.setText("Insira apenas NÚMEROS!");
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
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblCalculoImc;
    private javax.swing.JLabel lblInterpretacao;
    private javax.swing.JLabel lblMsgErro;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultadoCalculo;
    private javax.swing.JLabel lblResultadoIMC;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
