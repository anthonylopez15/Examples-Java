
package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class _2TesteLinkedHashSet {
    public static void main(String[] args) {
        
        //LinkedHashSet Implementa a interface Set, que utiliza com estrutura de dados interna a tabela hash,
        //Sua diferença em relacao a HashSet é que mantem a ordem de insecao de seus elementos
        Set nomes = new LinkedHashSet();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Ana Paula");
        nomes.add("Amanda");
        nomes.add("Joao");
        
        Iterator iterator = nomes.iterator();
        
        int i = 0;
        System.out.println("Lista dos nomes: \n");
        while(iterator.hasNext()){
            String nome = (String) iterator.next();
            System.out.println("Nome: [" + i++ + "] " + nome);
        }
    }
}
