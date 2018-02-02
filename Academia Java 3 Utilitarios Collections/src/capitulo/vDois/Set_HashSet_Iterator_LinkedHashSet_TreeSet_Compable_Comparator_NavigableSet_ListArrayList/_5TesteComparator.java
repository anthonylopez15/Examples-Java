package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _5TesteComparator {

    public static void main(String[] args) {

        Cliente cl1 = new Cliente(1, "Cliente 01", 205);
        Cliente cl2 = new Cliente(2, "Globalcode", 43);
        Cliente cl3 = new Cliente(3, "Cliente 02", 89);
        Cliente cl4 = new Cliente(4, "Cliente 03", 20);

        ComparadorClienteQtdPedidos comp = new ComparadorClienteQtdPedidos();

        Set ts = new TreeSet(comp);
        ts.add(cl1);
        ts.add(cl2);
        ts.add(cl3);
        ts.add(cl4);
        
        Iterator it = ts.iterator();
        System.out.println("\nUtilizando ComparadorClientesQtdPedidos");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        ComparadorClientesId compId = new ComparadorClientesId();
        Set ts2 = new TreeSet(compId);
        ts2.addAll(ts);
        Iterator it2 = ts2.iterator();
        System.out.println("\nUtilizandoClientesId");
        while (it2.hasNext()) {
            Object next = it2.next();
            System.out.println("" + next);
        }
        
    
    }
}
