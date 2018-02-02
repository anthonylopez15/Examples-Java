package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    String sql;

    public UsuarioDAO() {

    }

    public List getUsuariosByEmail(String sufixo) {
        sql = "select * from usuario where email like '%" + sufixo + "%' ";
        List<Usuario> lista = new ArrayList<>();
        Usuario usu = null;
        try {
            con = ConnectionManager.getConexao();
            ps = con.prepareStatement(sql);
            //ps.setString(1, sufixo);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String endereco = rs.getString("endereco");
                usu = new Usuario(nome, email, telefone, endereco);
                lista.add(usu);
                System.out.println("Listou ok " + usu);
            }
        } catch (Exception ex) {
            System.out.println("Erro ao listar email " + ex.getMessage());
        } finally {
            ConnectionManager.closeAll(con, ps, rs);
        }
        return lista;

    }
}
