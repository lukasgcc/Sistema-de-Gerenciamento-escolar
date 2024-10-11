/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetoescolar;

import com.mysql.jdbc.ResultSetImpl;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
/**
 *
 * @author Lucas
 */
public class relatoriosestu extends javax.swing.JFrame {
 private String ra;
    /**
     * Creates new form relatoriosestu
     */
    public relatoriosestu() {
        initComponents();
         preencherInformacoesAluno(ra);
         String estudanteId = estura.getText().trim();
    DisciplinasAluno.preencherDisciplinas(displist, estudanteId);
    
        estura.setEditable(false);
        estunome.setEditable(false); 
        estuturma.setEditable(false); 
        estucurso.setEditable(false); 
         dispreg.setEditable(false); 
         notatrabalho.setEditable(false); 
         nota1.setEditable(false); 
         nota2.setEditable(false); 
         notafinal.setEditable(false); 
         feedback.setEditable(false); 
        presenca.setEditable(false); 
                extensao.setEditable(false); 
        
    }
    public class DisciplinasAluno {
    
    public static void preencherDisciplinas(JComboBox<String> displist, String estudanteId) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.obterConexao();

            String consultaDisciplinasSql = "SELECT disciplina1, disciplina2, disciplina3, disciplina4, disciplina5 FROM estucad WHERE id = ?";
            stmt = conn.prepareStatement(consultaDisciplinasSql);
            stmt.setString(1, estudanteId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                List<String> disciplinas = new ArrayList<>();

               
                for (int i = 1; i <= 5; i++) {
                    String disciplina = rs.getString("disciplina" + i);
                    if (disciplina != null && !disciplina.isEmpty()) {
                        disciplinas.add(disciplina);
                    }
                }

                
                displist.setModel(new DefaultComboBoxModel<>(disciplinas.toArray(new String[0])));
            } else {
                JOptionPane.showMessageDialog(null, "Estudante não encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar disciplinas do estudante: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
private void preencherInformacoesAluno(String ra) {
       try {
   
    String raAluno = SessaoAluno.getInstancia().getRaAluno();

    
    com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) Conexao.obterConexao();

    
    String sql = "SELECT * FROM estucad WHERE id=?";
    com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
    pst.setString(1, raAluno);

    
    ResultSetImpl rs = (ResultSetImpl) pst.executeQuery();

    
    if (rs.next()) {
        estura.setText(rs.getString("id"));
        estunome.setText(rs.getString("nome"));
        estucurso.setText(rs.getString("curso"));
        estuturma.setText(rs.getString("turma"));
        
    } else {
        JOptionPane.showMessageDialog(null, "Aluno não encontrado no banco de dados");
    }
    String consultaExtensaoSql = "SELECT extensao, notaextensao FROM extensao WHERE id=?";
        PreparedStatement pstExtensao = conn.prepareStatement(consultaExtensaoSql);
        pstExtensao.setString(1, raAluno);
        ResultSet rsExtensao = pstExtensao.executeQuery();

        if (rsExtensao.next()) {
            extensao.setText(rsExtensao.getString("extensao"));
            
        } else {
            JOptionPane.showMessageDialog(null, "Extensão não encontrada para o aluno no banco de dados.");
            extensao.setText(""); 
            
        }

        rsExtensao.close();
        pstExtensao.close();

        conn.close();

 
    rs.close();
    pst.close();
    conn.close();
    
   
            estunome.setBackground(Color.LIGHT_GRAY);
             estuturma.setBackground(Color.LIGHT_GRAY);
            estura.setBackground(Color.LIGHT_GRAY);
            estucurso.setBackground(Color.LIGHT_GRAY);
            dispreg.setBackground(Color.LIGHT_GRAY);
            nota1.setBackground(Color.LIGHT_GRAY);
            nota2.setBackground(Color.LIGHT_GRAY);
            notatrabalho.setBackground(Color.LIGHT_GRAY);
            notafinal.setBackground(Color.LIGHT_GRAY);
            extensao.setBackground(Color.LIGHT_GRAY);
           

} catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage());
        }
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estucurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        estunome = new javax.swing.JTextField();
        estura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nota1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        estuturma = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        extensao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nota2 = new javax.swing.JTextField();
        notatrabalho = new javax.swing.JTextField();
        notafinal = new javax.swing.JTextField();
        displist = new javax.swing.JComboBox<>();
        dispreg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedback = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        presencalabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        presenca = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1091, 453));
        getContentPane().setLayout(null);

        estucurso.setBackground(new java.awt.Color(255, 255, 255));
        estucurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estucursoActionPerformed(evt);
            }
        });
        getContentPane().add(estucurso);
        estucurso.setBounds(140, 150, 332, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 117, 50, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Disciplinas:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 206, 103, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Curso:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 140, 46, 40);

        estunome.setBackground(new java.awt.Color(255, 255, 255));
        estunome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estunomeActionPerformed(evt);
            }
        });
        getContentPane().add(estunome);
        estunome.setBounds(140, 120, 332, 22);

        estura.setBackground(new java.awt.Color(255, 255, 255));
        estura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esturaActionPerformed(evt);
            }
        });
        getContentPane().add(estura);
        estura.setBounds(140, 90, 112, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Meus Relatorios ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 340, 48);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 87, 140, 30);

        nota1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nota1);
        nota1.setBounds(522, 237, 114, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Notas:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(522, 183, 59, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Prova 1:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(522, 211, 58, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Prova 2:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(663, 211, 58, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Trabalho:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(786, 211, 66, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Nota Final:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(941, 213, 74, 17);

        estuturma.setBackground(new java.awt.Color(255, 255, 255));
        estuturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estuturmaActionPerformed(evt);
            }
        });
        getContentPane().add(estuturma);
        estuturma.setBounds(140, 180, 332, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Turma:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 180, 50, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Extensão:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(6, 337, 90, 22);

        extensao.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(extensao);
        extensao.setBounds(6, 365, 317, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backbutton small3.png"))); // NOI18N
        jLabel2.setText("Voltar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(940, 10, 120, 50);

        nota2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nota2);
        nota2.setBounds(654, 237, 114, 30);

        notatrabalho.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(notatrabalho);
        notatrabalho.setBounds(786, 237, 114, 30);

        notafinal.setBackground(new java.awt.Color(255, 255, 255));
        notafinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notafinalActionPerformed(evt);
            }
        });
        getContentPane().add(notafinal);
        notafinal.setBounds(941, 237, 114, 30);

        displist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displistActionPerformed(evt);
            }
        });
        getContentPane().add(displist);
        displist.setBounds(12, 237, 237, 22);

        dispreg.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dispreg);
        dispreg.setBounds(267, 237, 237, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Pesquisar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(267, 273, 130, 32);

        feedback.setColumns(20);
        feedback.setRows(5);
        jScrollPane1.setViewportView(feedback);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(520, 293, 543, 100);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Feedback:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(522, 271, 93, 22);

        presencalabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        presencalabel.setForeground(new java.awt.Color(0, 0, 0));
        presencalabel.setText("Presença:");
        getContentPane().add(presencalabel);
        presencalabel.setBounds(520, 40, 91, 22);

        presenca.setColumns(20);
        presenca.setRows(5);
        jScrollPane3.setViewportView(presenca);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(522, 67, 543, 110);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ilive logo small aluno.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 300, 170, 90);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/colorful_background_7.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(-1770, -30, 3070, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void estucursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estucursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estucursoActionPerformed

    private void estunomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estunomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estunomeActionPerformed

    private void estuturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estuturmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estuturmaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       new menuestu().setVisible(true);
                dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void displistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displistActionPerformed
       String disciplinaSelecionada = displist.getSelectedItem().toString();
        dispreg.setText(disciplinaSelecionada);
    }//GEN-LAST:event_displistActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String disciplinaSelecionada = (String) dispreg.getText();
    String raAluno = SessaoAluno.getInstancia().getRaAluno();

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        conn = Conexao.obterConexao();

        // Consulta para obter notas, feedback e presença de uma vez só
        String consultaSql = "SELECT nota1, nota2, notatrabalho, feedback, presenca FROM notas WHERE disciplina = ? AND id = ?";
        stmt = conn.prepareStatement(consultaSql);
        stmt.setString(1, disciplinaSelecionada);
        stmt.setString(2, raAluno);
        rs = stmt.executeQuery();

        if (rs.next()) {
            // Notas
            nota1.setText(String.valueOf(rs.getDouble("nota1")));
            nota2.setText(String.valueOf(rs.getDouble("nota2")));
            notatrabalho.setText(String.valueOf(rs.getDouble("notatrabalho")));

            // Média
            double media = (rs.getDouble("nota1") + rs.getDouble("nota2") + rs.getDouble("notatrabalho")) / 3;
            notafinal.setText(String.format("%.2f", media));

            // Feedback
            feedback.setText(rs.getString("feedback"));

            // Presença
            StringBuilder presencaText = new StringBuilder();
            presencaText.append(rs.getString("presenca")).append("\n");

            // Continuar buscando presenças adicionais se existirem
            while (rs.next()) {
                presencaText.append(rs.getString("presenca")).append("\n");
            }
            presenca.setText(presencaText.toString());

            // Verifica se há presença
            if (presencaText.length() == 0) {
                JOptionPane.showMessageDialog(this, "Presença para a disciplina selecionada não encontrada.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Notas, feedback ou presença para a disciplina selecionada não encontrados.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro ao buscar notas, feedback e presença: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void notafinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notafinalActionPerformed
      
    }//GEN-LAST:event_notafinalActionPerformed

    private void esturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esturaActionPerformed

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
            java.util.logging.Logger.getLogger(relatoriosestu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(relatoriosestu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(relatoriosestu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(relatoriosestu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new relatoriosestu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> displist;
    private javax.swing.JTextField dispreg;
    private javax.swing.JTextField estucurso;
    private javax.swing.JTextField estunome;
    private javax.swing.JTextField estura;
    private javax.swing.JTextField estuturma;
    private javax.swing.JTextField extensao;
    private javax.swing.JTextArea feedback;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField notafinal;
    private javax.swing.JTextField notatrabalho;
    private javax.swing.JTextArea presenca;
    private javax.swing.JLabel presencalabel;
    // End of variables declaration//GEN-END:variables
}
