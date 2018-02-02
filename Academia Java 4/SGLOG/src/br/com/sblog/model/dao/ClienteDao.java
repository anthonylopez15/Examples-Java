
package br.com.sblog.model.dao;

import br.com.sblog.model.bean.Cliente;
import br.com.sblog.model.bean.ItenVenda;
import br.com.sblog.model.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDao {
    
    private PreparedStatement ps;
    private ResultSet rs;
    static Connection con = ConnectionFactory.conectar();
    private String sql;
    
    public void alterar(Cliente c){
        sql = "update cliente set nomeEmpresa = ?, cnpj = ? where cliente.codigo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNomeEmpresa());
            ps.setString(2, c.getCnpj());
            ps.setInt(3, c.getCodigo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Cliente buscarPorId(int codig){
        sql = "select * from cliente where codigo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codig);
            rs = ps.executeQuery();
            if(rs.next()){
                return new Cliente(rs.getInt("codigo"), rs.getString("nomeEmpresa"), rs.getString("cnpj"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    
    public static void main(String[] args) {
        
        ItensDao id = new ItensDao();
        List<ItenVenda> lista = id.mostraItensPorVenda(1);
        
        for(ItenVenda iv : lista){
            System.out.println("Produto: " + iv.getDescricao() +" "+ lista.size());
        }
        
    }
    
}
