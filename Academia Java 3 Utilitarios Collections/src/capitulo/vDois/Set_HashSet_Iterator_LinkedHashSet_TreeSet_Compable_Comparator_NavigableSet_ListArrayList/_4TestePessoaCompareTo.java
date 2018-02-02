
package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class _4TestePessoaCompareTo {
    public static void main(String[] args) {
        //Criamos varias instancias da classe Pessoa
        Pessoa p1 = new Pessoa("Joao silva", 123 , "20/05/1965");
        Pessoa p2 = new Pessoa("Joana soares", 1 , "28/02/1934");
        Pessoa p3 = new Pessoa("Mauricio costa", 1236, "14/07/1977");
        Pessoa p4 = new Pessoa("Carina salgado", 11111, "1/05/1982");
        Pessoa p5 = new Pessoa("Joao silva", 123, "20/05/1965");
        Pessoa p6 = new Pessoa("Joao silva", 1234, "20/05/1965");
        
        //TreeSet - essa classe implementa  a interface NavigableSet, e por isso garante os elementos serao ordenados
        //ordem ascendente, de acordo com a ordem natural dos elementos
        Set pessoas = new TreeSet();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);
        
        System.out.println("------------PESSOAS------------");
        Iterator iterator = pessoas.iterator();
        int i = 0;
        while(iterator.hasNext()){
            //Object o = iterator.next();
            //System.out.println("objeto nº["+ i++ +"] " + o);
            System.out.println(iterator.next());
        }
    }
}
