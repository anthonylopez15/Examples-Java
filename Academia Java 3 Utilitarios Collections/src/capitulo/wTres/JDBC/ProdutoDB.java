package capitulo.wTres.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
            //System.out.println("Erro na criacao da tabela produtos " );
            ConnectionManager.close(con, st);
        }
    }

    public void save(Produto produto) {
        Statement st = null;
        String sql = null;
        //se o id for igual a zero o produto ainda nao existe no banco
        //portanto, faremos um INSERT, caso contrario, faremos um update
        if (produto.getId() == 0) {
            sql = "insert into produtos (nome, preco) values('" + produto.getNome() + "', '" + produto.getPreco() + "' )";
        } else {
            sql = " update produtos set nome = '" + produto.getNome() + "', preco = '" + produto.getPreco() + "' "
                    + "where id = '" + produto.getId() + "' ";
        }
        Connection con = ConnectionManager.getConexao();
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            System.out.println("SQL = " + sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " erro na execucao da query " + sql);
        } finally {
            ConnectionManager.close(con, st);
        }

    }

}
