
package Genericos_EnhancedFor;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _4TesteWildcardExtends {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<Integer>();
        List<Cliente> l3 = new ArrayList<Cliente>();
        
        imprimir(l1);
        imprimir(l2);
        //imprimir(l3);// somente se: Cliente implements Serializable
        
    }

    private static void imprimir(Collection<? extends Serializable> colecao) {
        for(Serializable o: colecao){
            System.out.println(o);
        }
    }
}
