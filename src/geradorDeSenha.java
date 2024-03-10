/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.lang.StringBuilder;
import java.util.Random;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.datatransfer.*;
//import java.awt.Toolkit;
/**
 *
 * @author mateu
 */
public class geradorDeSenha extends javax.swing.JFrame {
    private static StringBuilder senha =  new StringBuilder();
    private static Random aleatorio = new Random();
    private static String senhaFormatada;
    private static int quantidadeCaracteresSenha;
    private static final String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private Clipboard clipboard;
    
    /**
     * Creates new form geradorDeSenha
     */
    public geradorDeSenha() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        labelQuantidadeCaracteres = new javax.swing.JLabel();
        textFieldQuantidadeCaracteres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneLocalSenhaGerada = new javax.swing.JTextPane();
        botaoGerar = new javax.swing.JButton();
        jButtonCopiarTexto = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Made by Me");
        setLocationByPlatform(true);
        setResizable(false);

        labelQuantidadeCaracteres.setText("Quantidade de caracteres: ");

        textFieldQuantidadeCaracteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldQuantidadeCaracteresActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(textPaneLocalSenhaGerada);

        botaoGerar.setText("Gerar");
        botaoGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerarActionPerformed(evt);
            }
        });

        jButtonCopiarTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copy-two-paper-sheets-interface-symbol_54702.png"))); // NOI18N
        jButtonCopiarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarTextoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoGerar)
                            .addComponent(labelQuantidadeCaracteres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldQuantidadeCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCopiarTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidadeCaracteres)
                    .addComponent(textFieldQuantidadeCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoGerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCopiarTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldQuantidadeCaracteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldQuantidadeCaracteresActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textFieldQuantidadeCaracteresActionPerformed

    private void botaoGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerarActionPerformed
        // TODO add your handling code here:
        try {
            quantidadeCaracteresSenha = Integer.parseInt(textFieldQuantidadeCaracteres.getText());
            senhaFormatada = gerarSenha(quantidadeCaracteresSenha);
            textPaneLocalSenhaGerada.setText(senhaFormatada);
            senha.delete(0, senha.length());
        } catch (java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio ou conter letras!", "ERROR", JOptionPane.ERROR_MESSAGE);
//            System.out.println("Você não pode colocar letra neste campo!");
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_botaoGerarActionPerformed

    private void jButtonCopiarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarTextoActionPerformed
        // TODO add your handling code here:
        // copiando o texto para a area de trasnferencia
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        String texto = senhaFormatada;
        StringSelection stringSelection = new StringSelection(texto);
        clipboard.setContents(stringSelection, null);
        JOptionPane.showMessageDialog(null, "A senha foi copiada para a área de transferência");
    }//GEN-LAST:event_jButtonCopiarTextoActionPerformed

    private static String gerarSenha(Integer quantidadeCaracteresSenha){
        while (senha.length() < quantidadeCaracteresSenha){
            char caractereAleatorio = caracteres.charAt(aleatorio.nextInt(caracteres.length()));
            senha.append(caractereAleatorio);
        }
        return senha.toString();
    }
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
            java.util.logging.Logger.getLogger(geradorDeSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(geradorDeSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(geradorDeSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(geradorDeSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new geradorDeSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoGerar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCopiarTexto;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelQuantidadeCaracteres;
    private javax.swing.JTextField textFieldQuantidadeCaracteres;
    private javax.swing.JTextPane textPaneLocalSenhaGerada;
    // End of variables declaration//GEN-END:variables
}
