
package Genericos_EnhancedFor;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _5TesteWildcardSuper {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Number> l2 = new ArrayList<>();
        List<Object> l3 = new ArrayList<>();
        List<String> l4 = new ArrayList<>();
        
        imprimir(l1);
        imprimir(l2);
        imprimir(l3);
       // imprimir(l4);// esta linha não compila
        
    }

    private static void imprimir(Collection<? super Integer> colecao) {
        for(Object o: colecao){
            System.out.println(o);
        }
        colecao.add(new Integer(10));//aceita adicao somente do tipo especifico
    }
}
