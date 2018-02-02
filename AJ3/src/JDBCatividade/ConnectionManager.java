package JDBCatividade;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {

    /*
	 * Os valores das constantes abaixo devem estar de acordo com o banco de
	 * dados utilizado.
     */
    //private static final String STR_DRIVER = "org.gjt.mm.mysql.Driver";
    private static final String DATABASE = "apostila";
    private static final String IP = "localhost";
    private static final String STR_CON = "jdbc:mysql://" + IP + ":3306/" + DATABASE;
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws GlobalcodeException {
        Connection conn = null;
        try {
            //Class.forName(STR_DRIVER);
            conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
            System.out.println("\n[ConnectionManager]: Obtendo conexao");
            return conn;
        } catch (SQLException e) {
            throw new GlobalcodeException("Erro ao obter a conexao", e);
        }
    }

    public static void closeAll(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
            System.out.println("Fechando a conexao...\n");
        } catch (SQLException e) {
            System.out.println("---> Detalhamento do erro: " + e.getMessage());
        }
    }

    public static void closeAll(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            System.out.println("---> Detalhamento do erro: " + e.getMessage());
        }
        ConnectionManager.closeAll(conn);
    }

    public static void closeAll(Connection conn, Statement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
                closeAll(conn, st);
            }
        } catch (SQLException e) {
            System.out.println("---> Detalhamento do erro: " + e.getMessage());
        }
    }
}
