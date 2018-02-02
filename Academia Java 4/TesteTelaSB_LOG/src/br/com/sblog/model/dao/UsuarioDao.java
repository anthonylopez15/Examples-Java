package br.com.sblog.model.dao;

import br.com.sblog.model.connection.ConnctionFactory;
import br.com.sblog.model.bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthony
 */
public class UsuarioDao {
    
    Connection con = ConnctionFactory.conectar();
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public void salvar(Usuario u) {
        sql = "insert into usuario(usunome) values (?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getNome());
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Cadastrodo com Sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Usuario> listarUsuarios() {
        sql = "select * from usuario";
        List<Usuario> listarTodos = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                listarTodos.add(new Usuario(rs.getString("usunome")));
            }
            return listarTodos;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Usuario buscarUsuario(String u) {
        sql = "select * from usuario where usunome = ? ;";
        Usuario u1 = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt("usucodigo"), rs.getString("usunome"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Resultado não encontrado! ", "Mensagem", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                ps.close();
                rs.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public void alterarNome(Usuario u){
        sql = "update usuario set usunome = ? where usucodigo = ?; ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getNome());
            ps.setInt(2, u.getCodigo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    public static void main(String[] args) {
        UsuarioDao ud = new UsuarioDao();
        Usuario u = ud.buscarUsuario("lopez");
        System.out.println(" " + u.getCodigo() + " " + u.getNome());
    }
}
