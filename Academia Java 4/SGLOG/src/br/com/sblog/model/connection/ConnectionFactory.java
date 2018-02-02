/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sblog.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class ConnectionFactory {
    
     private static final String URL = "jdbc:mysql://localhost:3306/sblog";
    private static final String USUARIO = "root";
    private static final String SENHA = "1234";
    
    public static Connection conectar(){
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectou");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }
    
    public static void main(String[] args) {
        ConnectionFactory.conectar();
        
    }
         
            
}
