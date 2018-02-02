package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AtividadeTesteSet {

   public static void main(String args[]) {
        Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
        Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
        Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
        Cliente c4 = new Cliente("Cliente3", "3333", "cpf3");
        Set clientes = new HashSet();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);

        Iterator ponteiroClientes = clientes.iterator();
        while (ponteiroClientes.hasNext()) {
            Cliente c = (Cliente) ponteiroClientes.next();
            System.out.println(c.getNome());
        }
    }
}