package GUI;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Santos
 */
public class Inicial extends javax.swing.JFrame {

    public Inicial() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource("Imagens/monopoly.jpg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        btnEntra = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        tfNum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Googolopoly");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/principal.png"))); // NOI18N

        btnEntra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEntra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/start.png"))); // NOI18N
        btnEntra.setText("Iniciar");
        btnEntra.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntraActionPerformed(evt);
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

        tfNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNum.setText("2");
        tfNum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Num. de Jogadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        tfNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntra)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente sair?") == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntraActionPerformed
        if (tfNum.getText().length() > 0) {
            try {
                ArrayList<String> nomes = new ArrayList<>();
                int num = Integer.parseInt(tfNum.getText());
                if (num > 1 && num < 5) {
                    for (int i = 0; i < num; i++) {
                        nomes.add(JOptionPane.showInputDialog("Digite o nome do " + (i+1) + "º Jogador:"));
                    }
                    new Principal(nomes).setVisible(true);
                    setVisible(false);
                } else
                    JOptionPane.showMessageDialog(null, "Digite um número de Jogadores válido (2 a 4)!", "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite um número de Jogadores válido (2 a 4)!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite um número de Jogadores!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntraActionPerformed

    private void tfNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumActionPerformed
        btnEntraActionPerformed(evt);
    }//GEN-LAST:event_tfNumActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntra;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfNum;
    // End of variables declaration//GEN-END:variables
}
