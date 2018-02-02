package JDBC.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import JDBC.beans.Produto;
import JDBC.util.GlobalcodeException.GlobalcodeException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDB {

    public void createTable() throws SQLException {
        Connection con = ConnectionManager.getConexao();
        Statement st = null;
        try {
            st = con.createStatement();
            String sql = "create table if not exists produtos"
                    + "(id int(3) not null auto_increment primary key,"
                    + "nome varchar(20) not null,"
                    + "preco int (10) not null);";
            st.executeUpdate(sql);
            System.out.println("Tabela de produtos criada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro na criacao da tabela produtos " + e.getMessage());
        } finally {
            ConnectionManager.close(con, st);
        }
    }

    public Produto save(Produto produto) throws GlobalcodeException {
        Statement st = null;
        String sql = "";
        if (produto.getId() == 0) {//Se o id for igual a zero, o produto ainda nao existe no banco
            sql = "insert into produtos (nome, preco) values " //portanto faremos um INSERT , caso contrario faremos um UPDATE
                    + " ('" + produto.getNome() + "', '" + produto.getPreco() + "')";
        } else {
            sql = "update from produtos set nome = '" + produto.getNome() + "', "
                    + "preco = '" + produto.getPreco() + "'"
                    + "where id = '" + produto.getId() + "' ";
        }
        Connection con = ConnectionManager.getConexao();
        try {
            st = con.createStatement();
            st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            if (produto.getId() == 0) {
                ResultSet generatedKey = st.getGeneratedKeys();
                if (generatedKey.next()) {
                    int id = generatedKey.getInt(1);
                    produto.setId(id);
                    System.out.println("SQL: " + sql + " ID: " + id);
                }
            }
        } catch (SQLException ex) {
            throw new GlobalcodeException("Erro na execucao da query " + sql, ex);
        } finally {
            ConnectionManager.close(con, st);
        }
        return produto;
    }

    public Produto getProduto(int id) throws GlobalcodeException {
        String sql = "select * from produtos where id = '" + id + "'  ";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        Produto p = null;
        try {
            con = ConnectionManager.getConexao();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                p = new Produto();
                String nome = rs.getString("nome");
                int preco = rs.getInt("preco");
                p = new Produto(id, nome, preco);
            }
        } catch (SQLException ex) {
            throw new GlobalcodeException("erro ao pegar id " + sql, ex);
        } finally {
            ConnectionManager.closeAll(con, st, rs);
        }
        return p;
    }

    public List getAllProdutos() throws GlobalcodeException {
        String sql = "select * from produtos";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List produtos = new ArrayList();

        try {
            con = ConnectionManager.getConexao();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String nome = rs.getString("nome");
                int preco = rs.getInt("preco");
                int id = rs.getInt("id");
                produtos.add(new Produto(id, nome, preco));
            }
        } catch (SQLException ex) {
            throw new GlobalcodeException("Erro ao listar produto " + sql, ex);
        } finally {
            ConnectionManager.closeAll(con, st, rs);
        }
        return produtos;
    }

    public int delete(int id) throws GlobalcodeException {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "delete from produtos where id = ? ";
        int qtdRemovidos = 0;
        try {
            con = ConnectionManager.getConexao();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            qtdRemovidos = ps.executeUpdate();
        } catch (SQLException ex) {
            String errorMsg = "Erro ao tentar remover produto de id " + id;
            throw new GlobalcodeException(errorMsg, ex);
        } finally {
            ConnectionManager.close(con, ps);
        }
        return qtdRemovidos;
    }
//    public void save(Produto produto) {
//        Statement st = null;
//        String sql = null;
//        //se o id for igual a zero o produto ainda nao existe no banco
//        //portanto, faremos um INSERT, caso contrario, faremos um update
//        if (produto.getId() == 0) {
//            sql = "insert into produtos (nome, preco) values('" + produto.getNome() + "', '" + produto.getPreco() + "' )";
//        } else {
//            sql = " update produtos set nome = '" + produto.getNome() + "', preco = '" + produto.getPreco() + "' "
//                    + "where id = '" + produto.getId() + "' ";
//        }
//        Connection con = ConnectionManager.getConexao();
//        try {
//            st = con.createStatement();
//            st.executeUpdate(sql);
//            System.out.println("SQL = " + sql);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage() + " erro na execucao da query " + ex.getMessage());
//        } finally {
//            ConnectionManager.close(con, st);
//        }
//    }//fim save
}
