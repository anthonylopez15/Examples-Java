/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.testes;

import JDBC.beans.Produto;
import JDBC.database.ProdutoDB;
import JDBC.util.GlobalcodeException.GlobalcodeException;
import java.util.List;

/**
 *
 * @author Anthony
 */
public class TesteProdutoDB2 {

    public static void main(String[] args) throws GlobalcodeException {

        ProdutoDB db = new ProdutoDB();
        int codigo = 1;
        if (codigo == 1) {
            int id = codigo;
            Produto produto = db.getProduto(id);
            if(produto != null){
                System.out.println("O produto encontrado foi " + produto);
            }else{
                System.out.println("O produto nao foi encontrado");
            }
        }else{
            List produtos = db.getAllProdutos();
            System.out.println("From encontrados " + produtos.size() + " produto(s).");
            for(int i = 0; i < produtos.size(); i++){
                System.out.println(produtos.get(i));
            }
        }
    }

}
