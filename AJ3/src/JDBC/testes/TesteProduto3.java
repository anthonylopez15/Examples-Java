package JDBC.testes;

import JDBC.database.ProdutoDB;
import JDBC.util.GlobalcodeException.GlobalcodeException;
import java.util.List;

public class TesteProduto3 {

    public static void main(String[] args) throws GlobalcodeException {

        ProdutoDB db = new ProdutoDB();
        if (args.length == 0) {
            int id = 2;
            int qtdRemovidos =  db.delete(id);
            System.out.println(qtdRemovidos + " produto(s) removido(s).");
        } else {
            List produtos = db.getAllProdutos();
            System.out.println("Foram encontrados " + produtos.size() + " produto(s).");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(produtos.get(i));
            }
        }
    }
}
