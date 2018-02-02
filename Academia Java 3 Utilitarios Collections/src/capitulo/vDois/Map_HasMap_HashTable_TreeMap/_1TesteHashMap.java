package capitulo.vDois.Map_HasMap_HashTable_TreeMap;

import capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList.Pessoa;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _1TesteHashMap {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Marcio Oliveira", 11111L, "04/10/1970");
        Pessoa p2 = new Pessoa("Armando Silva", 22222L, "11/12/1987");
        Pessoa p3 = new Pessoa("Fernanda Santos", 33333L, "09/05/1964");
        //Map - interface q define colecoes que mapeiam pares chave-valor. esse tipo de colecao é utilizada 
        //quando é necessario localizar rapidamente um determinado valor sem fazer uma busca em todos os elementos
        //da colecao. A localizacao é feita atraves da chave, q deve ser unica.
        
        //HashMap - implementa Map, que utiliza uma estrutura de dados do tipo tabela hash para armazenar
        //os pares chava-valor. Nao garante a ordem dos seus elementos, nem que estarao sempre na mesma ordem.
        Map pessoas = new HashMap();
        pessoas.put(p1.getRg(), p1);
        pessoas.put(p2.getRg(), p2);
        pessoas.put(p3.getRg(), p3);

        imprimeMap(pessoas);
        removeElemento(pessoas, 22222L);
        imprimeMap(pessoas);
    }

    private static void imprimeMap(Map map) {
        System.out.println("\n========Impressao do Map========\n");
        Set chaves = map.keySet();
        Iterator i = chaves.iterator();
        while (i.hasNext()) {//atraves do iterator i vamos navegar no Set chaves
            Long chave = (Long) i.next();//recuperando as chaves armazenadas no Set para entao obter o valor associado
            System.out.println("[chave]: " + chave);//recuperando o objeto para atraves do rg
            System.out.println(map.get(chave) + "\n");
        }
    }
    private static void removeElemento(Map map, Long chave) {
        Pessoa valorRemovido;
        if (map.containsKey(chave)) {//verificando se a chave existe no HashMap
            System.out.println("\n=========Removendo Elemento do Map=========\n");
            valorRemovido = (Pessoa) map.remove(chave);//Lembrar de fazer cast de objetos que vem do HashMap
            System.out.println("Valor Removido: " + valorRemovido);
        } else {
            System.out.println("Chave nao encontrada no HashMap");
        }
    }
}