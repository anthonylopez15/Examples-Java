
package br.com.sblog.model.dao;

import br.com.sblog.model.bean.Cliente;
import br.com.sblog.model.bean.Venda;
import br.com.sblog.model.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VendaDao {
    
    private PreparedStatement ps;
    private ResultSet rs;
    static Connection con = ConnectionFactory.conectar();
    private String sql;
    
    public Venda mostraVenda(int c){
        sql = "select * from venda where empresacod = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, c);
            rs = ps.executeQuery();
            if(rs.next()){
                return new Venda(rs.getInt("codigo"), rs.getString("pedido"),
                rs.getDouble("valor"), rs.getString("condicao"),
                rs.getString("dataEnvio"), new Cliente(rs.getInt("empresacod")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
       
}
