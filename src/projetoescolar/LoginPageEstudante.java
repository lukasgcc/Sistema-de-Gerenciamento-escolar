/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetoescolar;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas
 */
public class LoginPageEstudante extends javax.swing.JFrame {

    /**
     * Creates new form LoginPageEstudante
     */
    public LoginPageEstudante() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(736, 498));
        setPreferredSize(new java.awt.Dimension(736, 498));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuário: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 247, 90, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ilive aluno.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 0, 210, 230);

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pass);
        pass.setBounds(120, 280, 531, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Senha: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 277, 70, 30);

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(user);
        user.setBounds(120, 242, 530, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Entrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 370, 290, 50);

        jToggleButton1.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 102, 0));
        jToggleButton1.setText("Primeiro Acesso?");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(440, 320, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Esqueceu a senha?");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 310, 170, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backbutton small3.png"))); // NOI18N
        jLabel5.setText("Voltar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(560, 10, 120, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/colorful_background_7.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-1190, 0, 2000, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String ra = user.getText().trim(); 
        String senha = pass.getText().trim();

    try {
        Connection conn = (Connection) Conexao.obterConexao();
        Statement st = (Statement) conn.createStatement();
        String sql = "SELECT * FROM estucad";
        ResultSet rs = st.executeQuery(sql);

        boolean alunoEncontrado = false;

        while (rs.next()) {
            String raBanco = rs.getString("id").trim(); 
            String senhaBanco = rs.getString("senha").trim();

            if (ra.equals(raBanco) && senha.equals(senhaBanco)) {
              
                SessaoAluno.getInstancia().setRaAluno(ra);

              
                new menuestu().setVisible(true);
                dispose();

                alunoEncontrado = true;
                break;
            }
        }

        if (!alunoEncontrado) {
            JOptionPane.showMessageDialog(null, "RA ou senha incorretos");
        }

        rs.close();
        st.close();
        conn.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro com banco de dados");
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        new primeiroacesso().setVisible(true);
        

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new esqueceusenha().setVisible(true);
       

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        bemvindo obj = new bemvindo();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(LoginPageEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPageEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPageEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPageEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPageEstudante().setVisible(true);
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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
