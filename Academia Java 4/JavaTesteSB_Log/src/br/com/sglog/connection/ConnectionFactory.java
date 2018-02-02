
package br.com.sglog.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
    private static final String URL="jdbc:mysql://localhost:3306/sblog";
    private static final String USUARIO ="root";
    private static final String SENHA="1234";
    
    public static Connection conecta(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("conectado");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar "+ex.getMessage());
        }
        return con;
    }//fim do metod
    
    
}
