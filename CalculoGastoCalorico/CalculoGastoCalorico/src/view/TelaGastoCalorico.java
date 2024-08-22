package view;

import controller.ValidacaoGastoCalorico;
import javax.swing.JOptionPane;

public class TelaGastoCalorico extends javax.swing.JFrame {

    public TelaGastoCalorico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrinciapal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlDados = new javax.swing.JPanel();
        jRadioButtonMulher = new javax.swing.JRadioButton();
        jRadioButtonHomem = new javax.swing.JRadioButton();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblNivelAtividade = new javax.swing.JLabel();
        cbxNivelAtividade = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        txtIdade = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        lblJButtonMsg = new javax.swing.JLabel();
        pnlResultado = new javax.swing.JPanel();
        lblBasal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblResultadoBasal = new javax.swing.JLabel();
        lblResultadoTotal = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gasto Calórico");
        setResizable(false);

        pnlPrinciapal.setBackground(new java.awt.Color(153, 255, 153));
        pnlPrinciapal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Cálculo de Gasto Calórico");
        pnlPrinciapal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 18, -1, -1));

        pnlDados.setBackground(new java.awt.Color(255, 255, 255));
        pnlDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButtonMulher.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonMulher.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jRadioButtonMulher.setForeground(new java.awt.Color(102, 255, 102));
        jRadioButtonMulher.setText("Mulher");
        jRadioButtonMulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMulherActionPerformed(evt);
            }
        });
        pnlDados.add(jRadioButtonMulher, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 16, 100, -1));

        jRadioButtonHomem.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jRadioButtonHomem.setForeground(new java.awt.Color(102, 255, 102));
        jRadioButtonHomem.setText("Homem");
        jRadioButtonHomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHomemActionPerformed(evt);
            }
        });
        pnlDados.add(jRadioButtonHomem, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 16, 100, -1));

        lblPeso.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(102, 255, 102));
        lblPeso.setText("Peso (kg):");
        pnlDados.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblAltura.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(102, 255, 102));
        lblAltura.setText("Altura (cm):");
        pnlDados.add(lblAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lblIdade.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(102, 255, 102));
        lblIdade.setText("Idade:");
        pnlDados.add(lblIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblNivelAtividade.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblNivelAtividade.setForeground(new java.awt.Color(102, 255, 102));
        lblNivelAtividade.setText("Nível de Atividade:");
        pnlDados.add(lblNivelAtividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        cbxNivelAtividade.setBackground(new java.awt.Color(255, 255, 255));
        cbxNivelAtividade.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        cbxNivelAtividade.setForeground(new java.awt.Color(102, 255, 102));
        cbxNivelAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentário", "Leve", "Moderado", "Ativo", "Extremamente ativo" }));
        pnlDados.add(cbxNivelAtividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 170, -1));

        btnCalcular.setBackground(new java.awt.Color(102, 255, 102));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        pnlDados.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 137, -1));

        txtIdade.setBackground(new java.awt.Color(255, 255, 255));
        txtIdade.setForeground(new java.awt.Color(204, 204, 204));
        txtIdade.setText("Sua idade aqui");
        txtIdade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdadeMouseClicked(evt);
            }
        });
        pnlDados.add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 137, -1));

        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setForeground(new java.awt.Color(204, 204, 204));
        txtAltura.setText("Sua altura aqui");
        txtAltura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAlturaMouseClicked(evt);
            }
        });
        pnlDados.add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 137, -1));

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setForeground(new java.awt.Color(204, 204, 204));
        txtPeso.setText("Seu peso aqui");
        txtPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPesoMouseClicked(evt);
            }
        });
        pnlDados.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 148, -1));

        lblJButtonMsg.setForeground(new java.awt.Color(255, 0, 0));
        pnlDados.add(lblJButtonMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 46, 231, 20));

        pnlPrinciapal.add(pnlDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 47, 375, -1));

        pnlResultado.setBackground(new java.awt.Color(255, 255, 255));

        lblBasal.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblBasal.setForeground(new java.awt.Color(102, 255, 102));
        lblBasal.setText("Gasto Basal:");

        lblTotal.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(102, 255, 102));
        lblTotal.setText("Gasto Total:");

        lblResultadoBasal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblResultadoBasal.setForeground(new java.awt.Color(102, 255, 102));

        lblResultadoTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblResultadoTotal.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout pnlResultadoLayout = new javax.swing.GroupLayout(pnlResultado);
        pnlResultado.setLayout(pnlResultadoLayout);
        pnlResultadoLayout.setHorizontalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBasal)
                    .addComponent(lblTotal))
                .addGap(18, 18, 18)
                .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResultadoBasal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultadoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlResultadoLayout.setVerticalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBasal)
                    .addComponent(lblResultadoBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblResultadoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlPrinciapal.add(pnlResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 342, 375, -1));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 0, 0));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlPrinciapal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 6, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrinciapal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrinciapal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonHomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHomemActionPerformed
        if(this.jRadioButtonHomem.isSelected()) {
            this.jRadioButtonMulher.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonHomemActionPerformed

    private void txtPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesoMouseClicked
        this.txtPeso.setText("");
    }//GEN-LAST:event_txtPesoMouseClicked

    private void txtAlturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAlturaMouseClicked
        this.txtAltura.setText("");
    }//GEN-LAST:event_txtAlturaMouseClicked

    private void txtIdadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdadeMouseClicked
        this.txtIdade.setText("");
    }//GEN-LAST:event_txtIdadeMouseClicked

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        boolean sucesso;
        double peso; 
        double altura; 
        int idade;
        double calcBasal;
        double calcTotal = 0.0;
        
        ValidacaoGastoCalorico validacaoGastoCalorico = new ValidacaoGastoCalorico();
        
        try {
            // Validando Botão de Seleção 
            if(!this.jRadioButtonMulher.isSelected() && !this.jRadioButtonHomem.isSelected()) {
                this.lblJButtonMsg.setText("Informe seu genêro!");
            } else {
                // Validando se 'peso' está vazio
                if(!txtPeso.getText().isEmpty()){
                    peso = Double.parseDouble(txtPeso.getText());
                } else {
                    peso = 0;
                }

                // Validando se 'altura' está vazio
                if(!txtAltura.getText().isEmpty()){
                    altura = Double.parseDouble(txtAltura.getText());
                } else {
                    altura = 0;
                }

                // Validando se 'idade' está vazio
                if(!txtIdade.getText().isEmpty()){
                    idade = Integer.parseInt(txtIdade.getText());
                } else {
                    idade = 0;
                }
                
                sucesso = validacaoGastoCalorico.validarCampos(peso, altura, idade);

                // Cálculando peso, altura e idade do usuário
                if(sucesso) {
                    if(this.jRadioButtonHomem.isSelected()) {
                        calcBasal = 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);

                    } else {
                        calcBasal = 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
                    }

                    // Cálculando nível de atividade do usuário
                    if(this.cbxNivelAtividade.getSelectedItem().toString().equals("Sedentário")) {
                        calcTotal = calcBasal * 1.2;
                    } else if(this.cbxNivelAtividade.getSelectedItem().toString().equals("Leve")) {
                        calcTotal = calcBasal * 1.375;
                    } else if(this.cbxNivelAtividade.getSelectedItem().toString().equals("Moderado")) {
                        calcTotal = calcBasal * 1.55;
                    } else if(this.cbxNivelAtividade.getSelectedItem().toString().equals("Ativo")) {
                        calcTotal = calcBasal * 1.725;
                    } else {
                        calcTotal = calcBasal * 1.9;
                    }
                    
                    // Mostrando os resultados do usuário
                    this.lblResultadoBasal.setText(Double.toString(calcBasal));
                    this.lblResultadoTotal.setText(Double.toString(calcTotal));

                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Insira apenas números nos campos seguintes!");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jRadioButtonMulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMulherActionPerformed
        if(this.jRadioButtonMulher.isSelected()) {
            this.jRadioButtonHomem.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonMulherActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGastoCalorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxNivelAtividade;
    private javax.swing.JRadioButton jRadioButtonHomem;
    private javax.swing.JRadioButton jRadioButtonMulher;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblBasal;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblJButtonMsg;
    private javax.swing.JLabel lblNivelAtividade;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblResultadoBasal;
    private javax.swing.JLabel lblResultadoTotal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlPrinciapal;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
