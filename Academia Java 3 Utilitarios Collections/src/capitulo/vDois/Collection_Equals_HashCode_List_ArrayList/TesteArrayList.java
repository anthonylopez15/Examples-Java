
package capitulo.vDois.Collection_Equals_HashCode_List_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        //Instanciando objetos da classe Pessoas
        Pessoa p1 = new Pessoa("Marcio Oliveira", 1192030021L, "04/10/1970");
        Pessoa p2 = new Pessoa("Armando Silva", 321654987L, "11/12/1987");
        Pessoa p3 = new Pessoa("Fernanda Santos", 1995116277L, "09/05/19764");
        
        //Adicionando as pessoas no ArrayList pessoas
        List pessoas = new ArrayList();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        
        imprimeElementos(pessoas);
        //removendo o elemento do indice 1
        System.out.println("\n===removendo o elemento (1)");
        Pessoa pessoaRemovida = (Pessoa)pessoas.remove(1);
        System.out.println(" Pessoa removida \n\t" + pessoaRemovida);
        imprimeElementos(pessoas);
    }

    //metodo auxiliar para impressao dos elementos do ArrayList.
    private static void imprimeElementos(List pessoas) {
        System.out.println("\n===Numero de pessoas: " + pessoas.size());
        //imprimindo os elementos do array
        System.out.println("===imprimindo todas as pessoas: ");
        for (int i = 0; i < pessoas.size(); i++){
            System.out.println(" (" + i + ") ==>" + pessoas.get(i));
        }
    }
}
