package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _8ArrayListTesteOrdenacao {

    public static void main(String[] args) {

        Integer[] elementos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(elementos);//ordena o array de acordo com a ordem natural dos elementos. lança exception caso os elem nao implementem Comparable
        System.out.println("Array ordenacao:");
        System.out.println(Arrays.toString(elementos));//retorna uma string com a listagem dos elementos do array entre colchetes

        List clientes = new ArrayList();
        clientes.add(new Cliente(1, "Cliente 01", 205));
        clientes.add(new Cliente(3, "Cliente 02", 89));
        clientes.add(new Cliente(1, "Cliente 03", 20));
        clientes.add(new Cliente(2, "Globalcode", 43));
        ComparadorClientesId compId = new ComparadorClientesId();
        Collections.sort(clientes, compId);//ordena a lista de acordo com a regra estabelecida no Comparator
        System.out.println("Lista ordenada");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }
    }
}
