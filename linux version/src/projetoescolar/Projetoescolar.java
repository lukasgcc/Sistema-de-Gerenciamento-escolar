// @author Lucas Gonçalves da Cruz (202412055); Pedro Paulo Lima (324120829); Cayo Marques Macedo (202411215); Maik Douglas de Souza Martins(202410926);  Stella Expedita de Lima(202411513)
package projetoescolar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


 class Conexao {

     private static final String URL = "jdbc:mysql://localhost:3307/escolar";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    
    public static Connection obterConexao() throws SQLException {
        Connection conexao = null;
        try {
          
            Class.forName("com.mysql.jdbc.Driver");

            
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
           
            e.printStackTrace();
            throw new SQLException("Erro ao conectar ao banco de dados");
        }
        return conexao;
    }

   
    public static void fecharConexao(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
               
                e.printStackTrace();
            }
        }
    }
}



public class Projetoescolar {

  
    public static void main(String[] args) {
           bemvindo obj = new bemvindo();
        obj.setVisible(true);
        dispose();
        
       
    }

    private static void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
