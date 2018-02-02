package capitulo.vDois.Map_HasMap_HashTable_TreeMap;

import capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList.Pessoa;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class _2TesteTreeMap {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Armando silva", 22222L, "11/12/1987");
        Pessoa p2 = new Pessoa("Marcio oliveira", 11111L, "04/10/1970");
        Pessoa p3 = new Pessoa("Fernanda santos", 33333L, "09/05/1964");

        //TreeMap - implementa NavigableMap, e por isso garante q as chaves serao ordenadas em ordem ascendente
        //de acordo com a ordem natural dos elementos, ou por um tipo Comparator
        //passado como parametro na contrucao TreeMap
        Map pessoas = new TreeMap();
        pessoas.put(p1.getRg(), p1);
        pessoas.put(p2.getRg(), p2);
        pessoas.put(p3.getRg(), p3);

        imprimeMap(pessoas);

    }

    private static void imprimeMap(Map map) {
        Set chaves = map.keySet();
        Iterator ite = chaves.iterator();
        while (ite.hasNext()) {
            Long chave = (Long) ite.next();
            System.out.println("[Chave]: " + chave);
            System.out.println("cliente: " + map.get(chave));
        }

    }
}
