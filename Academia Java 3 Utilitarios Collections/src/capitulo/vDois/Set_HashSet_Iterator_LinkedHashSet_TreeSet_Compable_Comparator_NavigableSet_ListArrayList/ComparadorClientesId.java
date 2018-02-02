package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.Comparator;

public class ComparadorClientesId implements Comparator{
    //retorna um valor interno, devendo ser positivo se o primeiro for maior que o segundo
    //zero se os elementos forem considerados iguais, e negativo se o argumento for menos que o segundo
    @Override
    public int compare(Object o1, Object o2){
        Cliente cl1 = (Cliente) o1;
        Cliente cl2 = (Cliente) o2;
        return cl1.getId() - cl2.getId();
    }
}
