
package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class _1TesteSetHashSet {
    public static void main(String[] args) {
        //Set - A interface Set  não acrescenta em nenhum metodo novo em relação aos herdados de Collection
        //apenas impoe a condicao de nao permitir duplicados nos contratos dos metodos
        
        //HashSet - é um implementacao da interface Set, que utiliza como estrutura de dados interna uma tabela hash
        //esse tipo de estrutura de dados indexa os elementos pelo codigo gerado pelo metodo hashcade().
        Set nomes = new HashSet();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Ana Paula");
        nomes.add("Amanda");
        nomes.add(  "Joao");
        
        //é utilizada para navegar dentro de colecoes não indexadas, como é o caso de Set.
        //iteradores são obtidos atraves do metodo iterator(), definida na interface Collection
        Iterator iterator = nomes.iterator();
        
        int i = 1;
        System.out.println("Lista dos nomes: \n");
        while(iterator.hasNext()){//retorna true se existem mais elementos a serem iterados na colecao
            String nome = (String) iterator.next();//retorna o proximo elemento da iteracao
            System.out.println("Nome[" + i++ + "]" + nome);
        }
        
    }
}
