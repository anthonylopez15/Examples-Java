package capitulo.wTres.JDBC;

import java.sql.SQLException;

public class TesteProdutoDB {

    public static void main(String args[]) throws SQLException {
        ProdutoDB db = new ProdutoDB();
        db.createTable();
        String nome;
        int preco;
        Produto produto;
        int id;
        
        
        if (args.length == 2) {
            System.out.println("O produto sera inserido no BD");
            nome = args[0];
            preco = Integer.parseInt(args[1]);
            produto = new Produto(nome, preco);
        } else if (args.length == 3) {
            System.out.println("O produto sera alterado no BD");
            nome = args[0];
            preco = Integer.parseInt(args[1]);
            id = Integer.parseInt(args[2]);
            produto = new Produto(id, nome, preco);
        } else {
            System.out.println("Sintaxe para utilizacao deste programa");
            System.out.println("Para inserir um novo produto");
            System.out.println("<nome do produto> <preco do produto>");
            System.out.println("Para alterar um produto");
            System.out.println("<nome do produto> <preco do produto> <id>");
            return;
        }
        db.save(produto);

    }
}
