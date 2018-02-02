package JDBC.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {

    private static final String url = "jdbc:mysql://localhost/apostila";
    private static final String user = "root";
    private static final String password = "1234";

    public static Connection getConexao() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado...");
        } catch (SQLException ex) {
            System.out.println();
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void close(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
            System.out.println("Fechou conexao");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void close(Connection con, Statement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnectionManager.close(con);
    }

    public static void closeAll(Connection conn, Statement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println("---> Detalhamento do erro: " + e.getMessage());
        }
        ConnectionManager.close(conn, st);
    }
}
