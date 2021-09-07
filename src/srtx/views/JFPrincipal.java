/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srtx.views;

import srtx.util.Format;

/**
 *
 * @author saulo
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
        //setAlwaysOnTop(true);
        txtPrecoProduto.requestFocus();
        setLocationRelativeTo(null);
        jSlider1.setMaximum(300);
        jSlider1.setValue(50);
        jSlider1.setMajorTickSpacing(100);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTrack(true);
        txtTaxaLucro.setText("" + jSlider1.getValue());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTaxa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblTaxaJuros = new javax.swing.JLabel();
        lblPrecoFinalVenda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCustoProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTaxaLucro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecoVendaLucro = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        lblTaxaLucro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador Repasse de Taxas Juros Cartão SRTX");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("SRTX 1.0");

        jLabel3.setText("Preço do seu Produto?");

        txtPrecoProduto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecoProduto.setText("0,00");
        txtPrecoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoProdutoFocusGained(evt);
            }
        });
        txtPrecoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoProdutoKeyPressed(evt);
            }
        });

        jLabel4.setText("Taxa de Juros % Operadora Cartão (Maquininha)");

        txtTaxa.setBackground(new java.awt.Color(255, 255, 204));
        txtTaxa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTaxa.setText("3,19");
        txtTaxa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTaxaFocusGained(evt);
            }
        });
        txtTaxa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaxaKeyPressed(evt);
            }
        });

        jLabel5.setText("Seu preço de Venda Final R$:");

        txtPrecoVenda.setEditable(false);
        txtPrecoVenda.setBackground(new java.awt.Color(204, 255, 204));
        txtPrecoVenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecoVenda.setText("0,00");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/srtx/img/maquina_cartao.png"))); // NOI18N
        jButton1.setText("Simular");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTaxaJuros.setText("...");

        lblPrecoFinalVenda.setText("...");

        jLabel6.setText("Preço de Custo seu Produto?");

        txtCustoProduto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCustoProduto.setText("0,00");
        txtCustoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCustoProdutoFocusGained(evt);
            }
        });
        txtCustoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustoProdutoKeyPressed(evt);
            }
        });

        jLabel7.setText("Taxa % de lucro que queira Ganhar?");

        txtTaxaLucro.setBackground(new java.awt.Color(204, 255, 255));
        txtTaxaLucro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTaxaLucro.setText("0");
        txtTaxaLucro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTaxaLucroFocusGained(evt);
            }
        });
        txtTaxaLucro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaxaLucroKeyPressed(evt);
            }
        });

        jLabel8.setText("Seu preço de Venda Final R$:");

        txtPrecoVendaLucro.setEditable(false);
        txtPrecoVendaLucro.setBackground(new java.awt.Color(204, 255, 204));
        txtPrecoVendaLucro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecoVendaLucro.setText("0,00");

        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel1.setText("+ Taxa de:  ");

        lblTaxaLucro.setText("...");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Formação de Preço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTaxaJuros))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPrecoFinalVenda)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPrecoVendaLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTaxaLucro))
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTaxaLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTaxaJuros))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecoFinalVenda)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTaxaLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecoVendaLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(lblTaxaLucro))))
                        .addGap(6, 6, 6)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        calculaRepasse();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPrecoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoProdutoFocusGained
        // TODO add your handling code here:
        txtPrecoProduto.selectAll();
    }//GEN-LAST:event_txtPrecoProdutoFocusGained

    private void txtTaxaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTaxaFocusGained
        // TODO add your handling code here:
        txtTaxa.selectAll();
    }//GEN-LAST:event_txtTaxaFocusGained

    private void txtPrecoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoProdutoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            txtTaxa.requestFocus();
        }

    }//GEN-LAST:event_txtPrecoProdutoKeyPressed

    private void txtTaxaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaxaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            calculaRepasse();
        }
    }//GEN-LAST:event_txtTaxaKeyPressed

    private void txtCustoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustoProdutoFocusGained
        // TODO add your handling code here:
        txtCustoProduto.selectAll();
    }//GEN-LAST:event_txtCustoProdutoFocusGained

    private void txtCustoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustoProdutoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            txtTaxaLucro.requestFocus();
        }
    }//GEN-LAST:event_txtCustoProdutoKeyPressed

    private void txtTaxaLucroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTaxaLucroFocusGained
        // TODO add your handling code here:
        txtTaxaLucro.selectAll();
    }//GEN-LAST:event_txtTaxaLucroFocusGained

    private void txtTaxaLucroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaxaLucroKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==10) {
            jSlider1.setValue(Integer.parseInt(txtTaxaLucro.getText()));
            alteraTaxaLucro();
        }
    }//GEN-LAST:event_txtTaxaLucroKeyPressed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        alteraTaxaLucro();
    }//GEN-LAST:event_jSlider1StateChanged

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblPrecoFinalVenda;
    private javax.swing.JLabel lblTaxaJuros;
    private javax.swing.JLabel lblTaxaLucro;
    private javax.swing.JTextField txtCustoProduto;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtPrecoVendaLucro;
    private javax.swing.JTextField txtTaxa;
    private javax.swing.JTextField txtTaxaLucro;
    // End of variables declaration//GEN-END:variables

    private double precoProduto;
    private double taxaJuros;
    private double valorTaxaJuros;
    private double valorProdutoFinal;
    private double calculo;
    private double calculoPrecoProduto;
    private double calculoTaxa;
    //------------------------//
    private double precoCustoProduto;
    private double taxaLucro;
    private double precoVendaLucro;
    // espressao formula = 22,9/(1-3,19%) ou 100X22,9/100-3,19

    private void calculaRepasse() {
        precoProduto = Double.parseDouble(txtPrecoProduto.getText().replace(",", "."));
        taxaJuros = Double.parseDouble(txtTaxa.getText().replace(",", "."));
        calculoPrecoProduto = 100 * precoProduto;
        calculoTaxa = 100 - taxaJuros;
        calculo = calculoPrecoProduto / calculoTaxa;
        txtPrecoVenda.setText(Format.FormatNumber3(calculo));
        lblPrecoFinalVenda.setText("" + calculo);
        lblTaxaJuros.setText("" + calculoTaxa + " , " + calcPercent(precoProduto, taxaJuros));
        //System.out.println("" + (1 - calcPercent(precoProduto, taxaJuros)));
    }
    
    private double calcPercent(double valor, double percent) {
        double result = (valor * percent) / 100;
        lblTaxaJuros.setText("" + result);
        return result;
    }
    
    private void alteraTaxaLucro() {
        txtTaxaLucro.setText("" + jSlider1.getValue());
        calculaTaxaLucro();
    }
    
    private void calculaTaxaLucro() {
        precoCustoProduto = Double.parseDouble(txtCustoProduto.getText().replace(",", "."));
        taxaLucro = Double.parseDouble(txtTaxaLucro.getText().replace(",", "."));
        double lucro = calcPercent(precoCustoProduto, taxaLucro);
        lblTaxaLucro.setText("" + Format.FormatNumber3(lucro));
        txtPrecoVendaLucro.setText(Format.FormatNumber3(precoCustoProduto + lucro));
        txtPrecoProduto.setText(Format.FormatNumber3(precoCustoProduto + lucro));
        
        calculaRepasse();
        
    }
    
}
