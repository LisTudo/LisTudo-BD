/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm_view;

import dao.CadastroDAO;
import dao.ListaDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import listudo.Sistema;
import metodos.LoginMetodos;

/**
 *
 * @author luizf
 */
public class FrmViewLogin extends javax.swing.JFrame {

    /**
     * Creates new form viewLogin
     */
    public FrmViewLogin() {
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

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        campoUsuario = new javax.swing.JTextField();
        btnCadastro1 = new javax.swing.JButton();
        btnCadastro2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton4.setText("jButton1");

        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luiz Felipe\\Downloads\\LisTudo - Cadastro.png")); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(900, 538));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastro.setText("CADASTRE-SE");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 130, 30));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 90, 30));

        campoSenha.setBackground(new java.awt.Color(255, 255, 255));
        campoSenha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(153, 153, 153));
        campoSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 230, 30));

        campoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        campoUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        campoUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 230, 30));

        btnCadastro1.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnCadastro1.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastro1.setText("CADASTRE-SE");
        btnCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastro1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 110, 30));

        btnCadastro2.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnCadastro2.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastro2.setText("CADASTRE-SE");
        btnCadastro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastro2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LisTudo - LOGIN.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-510, 0, 1410, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    /**
     * Método Button "Login", no qual o mesmo for pressionado.
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        /**
        * Instancia da classe LoginMetodos para construir o objeto onde serao
        * armazenados os objetos da classe Produto, e CadastroDao onde será
        * feito a validação no banco de dados
        */
        CadastroDAO cadastroDAO = new CadastroDAO();
        LoginMetodos loginMetodos = new LoginMetodos();
        ListaDAO listaDAO = new ListaDAO();
        

        try {

            loginMetodos.setNomeUsuario(campoUsuario.getText());
            loginMetodos.setSenha(campoSenha.getText());
            int id = 0;

            if (cadastroDAO.validacaoLoginUsuario(loginMetodos.getNomeUsuario(), loginMetodos.getSenha(), loginMetodos)) {

                Sistema lisTudo = new Sistema();

                this.dispose();

                /**
                * Responsavel por dar as boas vindas ao usuario, sinalizando
                * que o login está correto e inicio do programa.
                */
                System.out.println("--LISTUDO--");
                System.out.println("Boas Vindas, " + loginMetodos.getNome() + "!!!\n");

                lisTudo.telaInicial(loginMetodos, listaDAO);

            } else {

                JOptionPane.showMessageDialog(null, "USUARIO OU SENHA INVÁLIDOS!");

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO NA VÁLIDAÇÃO DO LOGIN!");

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed

        FrmViewLogin viewLogin = new FrmViewLogin();
        FrmCadastro viewCadastro = new FrmCadastro();

        viewCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void btnCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastro1ActionPerformed

    private void btnCadastro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastro2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCadastro1;
    private javax.swing.JButton btnCadastro2;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}