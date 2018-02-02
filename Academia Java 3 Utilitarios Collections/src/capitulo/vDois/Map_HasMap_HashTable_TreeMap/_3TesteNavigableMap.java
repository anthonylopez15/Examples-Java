package capitulo.vDois.Map_HasMap_HashTable_TreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class _3TesteNavigableMap {
    public static void main(String[] args) {
        Integer[] chaves = {1,5,7,4,9,6,10,8,2,3};
        
        //NavigableMap - Introduz novos metodos de busca, tais como busca de objetos maiores e 
        //menores que um determinado chave de maneira semelhante a interface NavigableSet
        NavigableMap elementos = new TreeMap();
        for(Integer chave : chaves){
            elementos.put(chave, "elemento" + chave);
        }
        Integer chaveMenor = (Integer) elementos.lowerKey(6);
        System.out.println("primeira chave menor que 6 => " + chaveMenor);
        
        NavigableMap subConjunto = elementos.subMap(2, true, 5, true);
        System.out.println("Elementos do subConjunto:");
        for(Object chave: subConjunto.keySet()){
            System.out.println("chave: " + chave + "\tvalor: " + subConjunto.get(chave));
        }
        
    }
    
}
