//Ao utilizar o WildCard no metodo imprimir, o parametro passa a ser uma Collection de tipo desconhecido, o que
//permite passar por esse parametro colecoes de quaisquer tipos genericos. Exatamente por ser um tipo desconhecido
//é que a recuperacao dos elementos desse parametro só pode ser feita usando i tipo object. Assim, o metodo get da colecao
//e o for(enhanced for) só trabalham com o tipo Object
package Genericos_EnhancedFor;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _3TesteWildcardSimples {

    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("Maria");
        lista.add("Jose");
        
        imprimir(lista);
        
    }

    private static void imprimir(Collection<?> lista) {
        for(Object o: lista){
            System.out.println(o);
        }
    }
}
