/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package JDBCatividade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientesDAOImpl implements IClientesDAO {

    private final static String SALVAR_CLIENTE = "INSERT INTO clientes (nome,cpf,telefone) VALUES (?,?,?)";
    private final static String CREATE_TABLE = "CREATE TABLE  IF NOT EXISTS  clientes (id int(3) NOT NULL AUTO_INCREMENT   PRIMARY KEY, nome VARCHAR(20) NOT NULL, cpf varchar(20) NOT NULL, telefone varchar(20) NOT NULL)";
    private final static String DELETE_CLIENTE = "DELETE FROM clientes WHERE cpf = '";
    private final static String GET_ALL_CLIENTES = "SELECT * FROM clientes";
    private final static String GET_CLIENTE_BY_CPF = "SELECT * FROM clientes WHERE cpf = ?";

    public void createTable() throws GlobalcodeException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = ConnectionManager.getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate(CREATE_TABLE);
            System.out.println("tabela criada com sucesso");
        } catch (SQLException e) {
            throw new GlobalcodeException(
                    "Erro ao criar a tabela de clientes : " + CREATE_TABLE, e);
        } finally {
            ConnectionManager.closeAll(conn, stmt);
        }
    }

    @Override
    public void excluir(String cpf) throws GlobalcodeException {
        Connection con = null;// Criar uma variavel para a Connection
        Statement st = null;// Criar uma variavel para o Statement
        try {
            con = ConnectionManager.getConnection();// Abrir a conexao
            st = con.createStatement();//st = con.prepareStatement(DELETE_CLIENTE);// Criar o Statement
            // Executar a instrucao de delete recuperando o numero de linhas alteradas (executeUpdate)
            int linhas = st.executeUpdate(DELETE_CLIENTE + cpf + "'");//st.setString(1, cpf); st.executeUpdate(); 
            System.out.println(linhas + " excluida com sucesso");
        } catch (SQLException ex) {
            throw new GlobalcodeException("Erro na execucao da query ", ex);
        } finally {
            ConnectionManager.closeAll(con, st);// Fechar a Connection e o Statement
        }
    }

    @Override
    public void salvar(Cliente cliente) throws GlobalcodeException {
        Connection con = null;
        PreparedStatement pt = null;
        if (cliente.getId() == 0) {
            try {
                con = ConnectionManager.getConnection();
                pt = con.prepareStatement(SALVAR_CLIENTE, Statement.RETURN_GENERATED_KEYS);
                pt.setString(1, cliente.getNome());
                pt.setString(2, cliente.getCpf());
                pt.setString(3, cliente.getTelefone());
                pt.executeUpdate();
                ResultSet rs = pt.getGeneratedKeys();
                if(rs.next()){
                    int codigoRecuperado = rs.getInt(1);
                    System.out.println("\ncodigo recuperado: " + codigoRecuperado +"\n");
                }
                System.out.println("Cliente salvo com sucesso...");
            } catch (SQLException ex) {
                throw new GlobalcodeException("Erro ao salvar cliente", ex);
            } finally {
                ConnectionManager.closeAll(con, pt);
            }
        }
    }

    /*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getAllClientes()
     */
    @Override
    public List getAllClientes() throws GlobalcodeException {
        Connection con = null;// Criar uma variavel para a Connection
        Statement st = null;// Criar uma variavel para o Statement
        ResultSet rs = null;
        List clientes = new ArrayList();// Criar um ArrayList para armazenar os clientes
        try {
            con = ConnectionManager.getConnection();// Abrir a conexao
            st = con.createStatement();// Criar o Statement
            rs = st.executeQuery(GET_ALL_CLIENTES);// Executar a consulta e guardar o resultado em um ResultSet
            while (rs.next()) {
                //a) obter dados retornados
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String tel = rs.getString("telefone");
                int id = rs.getInt("id");
                Cliente c = new Cliente(nome, tel, cpf, id);//b) criar o cliente
                clientes.add(c);//c) guardar o cliente na lista
            }
        } catch (SQLException ex) {
            throw new GlobalcodeException("Erro ao criar lista de clientes: ", ex);
        } finally {
            ConnectionManager.closeAll(con, st, rs);// Fechar a Connection, o Statement e ResultSet
        }
        return clientes;//retornar a lista com os clientes
    }

    @Override
    public Cliente getClienteByCPF(String cpf) throws GlobalcodeException {
        Connection con = null;// Declarar uma variavel para a Connection
        PreparedStatement ps = null;// Declarar uma variavel para o PreparedStatement
        ResultSet rs = null;// Declarar uma variavel para o ResultSet
        Cliente c = null;
        try {
            con = ConnectionManager.getConnection();// Abrir a conexao
            ps = con.prepareStatement(GET_CLIENTE_BY_CPF);// Criar o PreparedStatement
            ps.setString(1, cpf);// Atribuir uma String para a 1a. interrogacao (cpf)
            rs = ps.executeQuery();// Executar a consulta e guardar o resultado no ResultSet
            if (rs.next()) {
                String nome = rs.getString("nome"); // Ler o ResultSet, recuperando um objeto cliente
                cpf = rs.getString("cpf");
                String fone = rs.getString("telefone");
                int id = rs.getInt("id");
                c = new Cliente(nome, fone, cpf, id);
            }
            // Fechar a Connection, o Statement e o ResultSet
        } catch (SQLException ex) {
            throw new GlobalcodeException("Erro ao pegar cliente por CPF", ex);
        }finally{
            ConnectionManager.closeAll(con, ps, rs);
        }
        return c;// Retornar o cliente
    }
}
