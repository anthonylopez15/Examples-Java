package JDBC.testes;

import JDBC.beans.Produto;
import JDBC.database.ProdutoDB;
import JDBC.util.GlobalcodeException.GlobalcodeException;
import java.sql.SQLException;

public class TesteProdutoDB {

    public static void main(String args[]) throws SQLException, GlobalcodeException {
        ProdutoDB db = new ProdutoDB();
        db.createTable();
        String nome;
        int preco;
        Produto produto;
        int id;
       
        if (args.length == 0) {
            System.out.println("O produto sera inserido no BD");
            nome = "Mais um vez 2";
            preco = 333;
            produto = new Produto(nome, preco);
        } else if (args.length == 3) {
            System.out.println("O produto sera alterado no BD");
            nome = "Produto2";
            preco = 300;
            id = 3;
            produto = new Produto(id, nome, preco);
        } else {
            System.out.println("Sintaxe para utilizacao deste programa");
            System.out.println("Para inserir um novo produto");
            System.out.println("<nome do produto> <preco do produto>");
            System.out.println("Para alterar um produto");
            System.out.println("<nome do produto> <preco do produto> <id>");
            return;
        }
        Produto cod = db.save(produto);
        System.out.println(cod);

    }
}
