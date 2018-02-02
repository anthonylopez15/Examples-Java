package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.NavigableSet;
import java.util.TreeSet;


public class _6NavegableSetTesteElementoMenor {

    public static void main(String[] args) {
        Integer[] elementos = {1,2,3,4,5,6,7,8,9,10};
        
        //Navigable - A interface NavigableSet é um extensao de SortedSet. Essa interface foi criada no Java 6
        //e basicamente introduz metodos de busca, tais como buscar de objetos maiores ou menores
        //que um determado subconjunto da colecao.
        
        //TreeSet - essa classe implementa  a interface NavigableSet, e por isso garante os elementos serao ordenados
        //ordem ascendente, de acordo com a ordem natural dos elementos
        NavigableSet colecao = new TreeSet();
        for(int i = 0; i < elementos.length; i++){
            colecao.add(i);
        }
        Integer menorQ6 = (Integer) colecao.lower(6);
        System.out.println(menorQ6);
    }
}
