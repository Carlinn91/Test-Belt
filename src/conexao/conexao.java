package conexao;

/**
 * Pasta e arquivo criado para a conexão do MySQL para o JAVA
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class conexao {
    /** 
     * URL para conexão com o user e o password
 */
    private static final String url = "jdbc:mysql://localhost:3310/bd_belt";
    private static final String user = "root";
    private static final String password = "1234";  
    

    private static Connection conn;
    /** 
     * Método estático criado para verificar se a conexão já foi instaciada ou não
 */
    public static Connection getConexao(){
        
        /** 
     * Try sugerido pelo VS code, caso dê algum erro ele cai no catch
    */
        try {

        if (conn==null){

                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }else{
                return conn;
            }

         } catch (SQLException e) {
            e.printStackTrace();
            return null;
       }
    }
    
}
