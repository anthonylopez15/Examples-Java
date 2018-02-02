package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.Comparator;

public class ComparadorClienteQtdPedidos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cliente cl1 = (Cliente) o1;
        Cliente cl2 = (Cliente) o2;
        return cl1.getQtdPedidos() - cl2.getQtdPedidos();
    }
}
