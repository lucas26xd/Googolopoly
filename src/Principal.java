
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas Santos
 */
public class Principal extends javax.swing.JFrame {

    private ArrayList<String> nomes;
    private int caixa[];
    private DefaultTableCellRenderer coluna;
    private Color cores[] = {new Color(51, 153, 255), Color.MAGENTA, Color.ORANGE, Color.GREEN};

    public Principal(ArrayList<String> nomes) {
        initComponents();
        setLocationRelativeTo(null);

        this.nomes = nomes;
        povoa();
        tfValor.requestFocus();

        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource("Imagens/dinheiro.png")));

        for (int i = 0; i < nomes.size(); i++) {
            coluna = new DefaultTableCellRenderer();
            coluna.setBackground(cores[i]);
            tabela.getColumnModel().getColumn(i).setCellRenderer(coluna);
            tabela.getColumnModel().getColumn(i).setHeaderRenderer(coluna);
        }
    }

    private void povoa() {
        caixa = new int[nomes.size()];
        Object obj[] = new Object[nomes.size()];

        for (int i = 0; i < caixa.length; i++) {
            caixa[i] = 2000;
            obj[i] = caixa[i] + " shares";
            jogadores.addItem(nomes.get(i));
        }

        tabela.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{obj}, nomes.toArray(new String[nomes.size()])
        ));
    }

    private void atualizaValores() {
        Object obj[] = new Object[nomes.size()];

        for (int i = 0; i < caixa.length; i++) {
            obj[i] = caixa[i] + " shares";
        }
        DefaultTableModel mod = (DefaultTableModel) tabela.getModel();
        mod.setNumRows(0);
        mod.addRow(obj);
        for (int i = 0; i < nomes.size(); i++) {
            coluna = new DefaultTableCellRenderer();
            coluna.setBackground(cores[i]);
            if (caixa[i] < 0) {
                coluna.setForeground(new Color(200, 0, 0));
            } else {
                coluna.setForeground(Color.black);
            }
            tabela.getColumnModel().getColumn(i).setCellRenderer(coluna);
            tabela.getColumnModel().getColumn(i).setHeaderRenderer(coluna);
        }
    }

    private void povoaRecebedores() {
        jogadoresRecebe.removeAllItems();
        for (int i = 0; i < caixa.length; i++) {
            jogadoresRecebe.addItem(nomes.get(i));
        }
        jogadoresRecebe.removeItemAt(jogadores.getSelectedIndex());
    }

    private Principal() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jogadores = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        rbReceber = new javax.swing.JRadioButton();
        rbPagar = new javax.swing.JRadioButton();
        rbTransferir = new javax.swing.JRadioButton();
        jogadoresRecebe = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        tfValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historico = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Caixa do Googolopoly");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabela.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        tabela.setEnabled(false);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jogadores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jogadores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jogadoresItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Jogador:");

        rbReceber.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbReceber);
        rbReceber.setSelected(true);
        rbReceber.setText("Receber");
        rbReceber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbReceberFocusGained(evt);
            }
        });

        rbPagar.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbPagar);
        rbPagar.setText("Pagar");
        rbPagar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbPagarFocusGained(evt);
            }
        });

        rbTransferir.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbTransferir);
        rbTransferir.setText("Transferir");
        rbTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTransferirMouseClicked(evt);
            }
        });

        jogadoresRecebe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jogadoresRecebe.setEnabled(false);
        jogadoresRecebe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jogadoresRecebeItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Jogador à Receber:");

        btnOK.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ok.png"))); // NOI18N
        btnOK.setText("OK");
        btnOK.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tfValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Valor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rbReceber)
                            .addGap(18, 18, 18)
                            .addComponent(rbPagar)
                            .addGap(18, 18, 18)
                            .addComponent(rbTransferir))
                        .addComponent(jLabel1)
                        .addComponent(jogadores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jogadoresRecebe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbReceber)
                            .addComponent(rbPagar)
                            .addComponent(rbTransferir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogadoresRecebe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOK)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Caixa", jPanel1);

        historico.setEditable(false);
        historico.setColumns(20);
        historico.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        historico.setRows(5);
        jScrollPane2.setViewportView(historico);

        jTabbedPane1.addTab("Histórico", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        new Inicial().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        try {
            if (tfValor.getText().length() > 0) {
                if (rbReceber.isSelected()) {
                    caixa[jogadores.getSelectedIndex()] += Integer.parseInt(tfValor.getText());
                    historico.append(jogadores.getSelectedItem() + " RECEBEU " + tfValor.getText() + " shares.\n");
                } else if (rbPagar.isSelected()) {
                    caixa[jogadores.getSelectedIndex()] -= Integer.parseInt(tfValor.getText());
                    historico.append("'" + jogadores.getSelectedItem() + "' PAGOU " + tfValor.getText() + " shares.\n");
                } else {
                    if (jogadoresRecebe.getSelectedIndex() != -1) {
                        caixa[jogadores.getSelectedIndex()] -= Integer.parseInt(tfValor.getText());
                        caixa[tabela.getColumnModel().getColumnIndex(jogadoresRecebe.getSelectedItem())] += Integer.parseInt(tfValor.getText());
                        historico.append("'" + jogadores.getSelectedItem() + "' TRANSFERIU " + tfValor.getText() + " shares para '" + jogadoresRecebe.getSelectedItem() + "'.\n");
                    } else
                        JOptionPane.showMessageDialog(null, "Selecione um jogador para receber a transferência!", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
                atualizaValores();
                tfValor.setText("");
                rbReceber.setSelected(true);
                jogadoresRecebe.setSelectedIndex(-1);
                tfValor.requestFocus();
                jogadoresRecebe.setEnabled(false);
            } else
                JOptionPane.showMessageDialog(null, "Digite um valor válido!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void rbTransferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTransferirMouseClicked
        povoaRecebedores();
        jogadoresRecebe.setEnabled(true);
    }//GEN-LAST:event_rbTransferirMouseClicked

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        btnOKActionPerformed(evt);
    }//GEN-LAST:event_tfValorActionPerformed

    private void rbPagarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbPagarFocusGained
        jogadoresRecebe.setEnabled(false);
        jogadoresRecebe.setSelectedIndex(-1);
        tfValor.requestFocus();
    }//GEN-LAST:event_rbPagarFocusGained

    private void rbReceberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbReceberFocusGained
        jogadoresRecebe.setEnabled(false);
        jogadoresRecebe.setSelectedIndex(-1);
        tfValor.requestFocus();
    }//GEN-LAST:event_rbReceberFocusGained

    private void jogadoresRecebeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jogadoresRecebeItemStateChanged
        tfValor.requestFocus();
    }//GEN-LAST:event_jogadoresRecebeItemStateChanged

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        jogadores.setSelectedIndex(tabela.columnAtPoint(evt.getPoint()));
    }//GEN-LAST:event_tabelaMouseClicked

    private void jogadoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jogadoresItemStateChanged
        povoaRecebedores();
        jogadoresRecebe.setSelectedIndex(-1);
    }//GEN-LAST:event_jogadoresItemStateChanged

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea historico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox jogadores;
    private javax.swing.JComboBox jogadoresRecebe;
    private javax.swing.JRadioButton rbPagar;
    private javax.swing.JRadioButton rbReceber;
    private javax.swing.JRadioButton rbTransferir;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
