package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class _7NavigableSetTesteSubConjunto {

    public static void main(String[] args) {
        //A interface NavigableSet é um extensao de SortedSet. Essa interface foi criada no Java 6
        //e basicamente introduz metodos de busca, tais como buscar de objetos maiores ou menores
        //que um determado subconjunto da colecao.
        Integer[] elementos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        NavigableSet colecao = new TreeSet();
        for (int i = 0; i < elementos.length; i++) {
            colecao.add(elementos[i]);
        }
        Iterator it = colecao.iterator();
        System.out.println("elementos: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        //de 2  mostra ate antes 7 
        NavigableSet subConjunto1 = colecao.subSet(2, true, 7, false);
        System.out.println("\nLista incluindo os extremos:");
        for (Object integer : subConjunto1) {
            System.out.print(integer + " ");
        }
        NavigableSet subConjunto2 = colecao.subSet(1, true, 9, true);
        System.out.println("\nLista excluindo os extremos:");
        for (Object integer : subConjunto2) {
            System.out.print(integer + " ");
        }
    }
}
