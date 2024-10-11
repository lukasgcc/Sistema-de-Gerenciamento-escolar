/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetoescolar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas
 */
public class listadealunos extends javax.swing.JFrame {

    /**
     * Creates new form listadealunos
     */
    public listadealunos() {
        initComponents();
          carregarInformacoesProfessor();
    }
    
private void carregarInformacoesProfessor() {
    String idProfessor = SessaoUsuario.getInstancia().getIdProfessor();
Connection conn = null;
PreparedStatement stmt = null;
ResultSet rs = null;

try {
    conn = Conexao.obterConexao();
    String sql = "SELECT estucad.id, estucad.nome, estucad.curso, estucad.turma, " +
                 "CASE " +
                 "WHEN estucad.disciplina1 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) THEN estucad.disciplina1 " +
                 "WHEN estucad.disciplina2 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) THEN estucad.disciplina2 " +
                 "WHEN estucad.disciplina3 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) THEN estucad.disciplina3 " +
                 "WHEN estucad.disciplina4 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) THEN estucad.disciplina4 " +
                 "WHEN estucad.disciplina5 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) THEN estucad.disciplina5 " +
                 "END AS disciplina, " +
                 "notas.nota1 AS nota1, notas.nota2 AS nota2, notas.notatrabalho AS notatrabalho " +
                 "FROM estucad " +
                 "INNER JOIN profcad ON " +
                 "((estucad.disciplina1 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) AND " +
                 "(estucad.turma = profcad.turma1 OR estucad.turma = profcad.turma2 OR estucad.turma = profcad.turma3)) OR " +
                 "(estucad.disciplina2 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) AND " +
                 "(estucad.turma = profcad.turma1 OR estucad.turma = profcad.turma2 OR estucad.turma = profcad.turma3)) OR " +
                 "(estucad.disciplina3 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) AND " +
                 "(estucad.turma = profcad.turma1 OR estucad.turma = profcad.turma2 OR estucad.turma = profcad.turma3)) OR " +
                 "(estucad.disciplina4 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) AND " +
                 "(estucad.turma = profcad.turma1 OR estucad.turma = profcad.turma2 OR estucad.turma = profcad.turma3)) OR " +
                 "(estucad.disciplina5 IN (profcad.disciplinas, profcad.disciplinas2, profcad.disciplinas3) AND " +
                 "(estucad.turma = profcad.turma1 OR estucad.turma = profcad.turma2 OR estucad.turma = profcad.turma3))) " +
                 "LEFT JOIN notas ON estucad.id = notas.id " +
                 "WHERE profcad.id = ? " +
                 "AND (estucad.disciplina1 != 'Sem Matéria' AND estucad.disciplina2 != 'Sem Matéria' " +
                 "AND estucad.disciplina3 != 'Sem Matéria' AND estucad.disciplina4 != 'Sem Matéria' " +
                 "AND estucad.disciplina5 != 'Sem Matéria')";
    stmt = conn.prepareStatement(sql);
    stmt.setString(1, idProfessor);
    rs = stmt.executeQuery();

    DefaultTableModel model = (DefaultTableModel) listadealunos.getModel();
    model.setRowCount(0);

    Map<String, Object[]> alunosMap = new HashMap<>();

    while (rs.next()) {
        String ra = rs.getString("id");
        String nome = rs.getString("nome");
        String curso = rs.getString("curso");
        String disciplina = rs.getString("disciplina");
        String turma = rs.getString("turma");
        double nota1 = rs.getDouble("nota1");
        double nota2 = rs.getDouble("nota2");
        double notaTrabalho = rs.getDouble("notatrabalho");

        
        if (alunosMap.containsKey(ra)) {
            Object[] alunoData = alunosMap.get(ra);
           
            if (!Arrays.asList(alunoData).contains(disciplina)) {
                alunoData[3] += ", " + disciplina;
            }
            
            alunoData[6] = nota1;
            alunoData[7] = nota2;
            alunoData[8] = notaTrabalho;
        } else {
           
            alunosMap.put(ra, new Object[]{ra, nome, curso, disciplina, turma, null, nota1, nota2, notaTrabalho});
        }
    }

    
    for (Object[] alunoData : alunosMap.values()) {
        model.addRow(new Object[]{alunoData[0], alunoData[1], alunoData[2], alunoData[3], alunoData[4], alunoData[5], alunoData[6], alunoData[7], alunoData[8]});
    }
} catch (SQLException e) {
    Logger.getLogger(listadealunos.class.getName()).log(Level.SEVERE, null, e);
} finally {
    try {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        Logger.getLogger(listadealunos.class.getName()).log(Level.SEVERE, null, e);
    }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listadealunos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(925, 460));
        getContentPane().setLayout(null);

        listadealunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RA", "Nome", "Curso", "Disciplina", "Turma"
            }
        ));
        jScrollPane1.setViewportView(listadealunos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 60, 893, 355);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backbutton small3.png"))); // NOI18N
        jLabel1.setText("Voltar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(790, 17, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tabela de Alunos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(345, 6, 182, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/colorful_background_7.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-20, 0, 930, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(listadealunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listadealunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listadealunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listadealunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listadealunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listadealunos;
    // End of variables declaration//GEN-END:variables
}
