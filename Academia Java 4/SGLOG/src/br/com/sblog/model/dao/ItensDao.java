package br.com.sblog.model.dao;

import br.com.sblog.model.bean.ItenVenda;
import br.com.sblog.model.bean.Venda;
import br.com.sblog.model.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItensDao {

    private PreparedStatement ps;
    private ResultSet rs;
    static Connection con = ConnectionFactory.conectar();
    private String sql;

    public List<ItenVenda> mostraItensPorVenda(int cod) {
        sql = "select * from itensvenda where vendacod = ?";
        List<ItenVenda> listItens = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            rs = ps.executeQuery();
            while (rs.next()) {
                listItens.add(new ItenVenda(
                        new Venda(rs.getInt("vendacod")), rs.getString("descricao"),
                        rs.getInt("quantidade"), rs.getDouble("preco"), rs.getInt("itencodigo"))
                );
            }
            return listItens;
        } catch (SQLException ex) {
            Logger.getLogger(ItensDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
