package Genericos_EnhancedFor;

import java.util.Set;
import java.util.TreeSet;

public class _6TesteSetComGenerics {
    
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new TreeSet<>();
        pessoas.add(new Pessoa("Maria", "6123455" , "10/10/2001"));
        pessoas.add(new Pessoa("Marcos", "8467482" , "10/12/2001"));
        for(Pessoa p : pessoas){
            System.out.println(p.toString());
        }
        Set<Pessoa> pessoas2 = new TreeSet<>(new ComparadorPessoaPorDataNascimento());
        pessoas2.add(new Pessoa("Maria", "6123455", "10/10/2001"));
        pessoas2.add(new Pessoa("Marcos", "8467482", "10/12/2001"));
        for(Pessoa p : pessoas2){
            System.out.println(p.toString());
        }
    }
}
