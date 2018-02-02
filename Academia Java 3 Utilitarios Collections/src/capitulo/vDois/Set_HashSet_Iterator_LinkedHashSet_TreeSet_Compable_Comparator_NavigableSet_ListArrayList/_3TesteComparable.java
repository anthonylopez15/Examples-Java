
package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class _3TesteComparable {
    public static void main(String[] args) {
        //implementa a inteface NavigableSet, e por isso, garante que os elementos
        //serao ordenados em ordem ascendente, de acordo com a ordem natural dos elementos
        Set nomes = new TreeSet();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Ana Paula");
        nomes.add("Amanda");
        
        Iterator iterator = nomes.iterator();
        int i = 0;
        System.out.println("Lista em ordem alfabetica dos nomes: \n");
        while(iterator.hasNext()){
            String nome = (String) iterator.next();
            System.out.println("nomes: ["+ i++ +"] " +nome) ;
        }
    }
}
