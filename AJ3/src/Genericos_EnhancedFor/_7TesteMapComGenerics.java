package Genericos_EnhancedFor;

import java.util.HashMap;
import java.util.Map;

public class _7TesteMapComGenerics {

    public static void main(String[] args) {
        
        Map<String, Pessoa> mapPessoas = new HashMap<>();
        
        String rg1 = "3556666";
        mapPessoas.put(rg1, new Pessoa("Maria", rg1, "30/10/1984"));
        
        String rg2 = "7888234";
        mapPessoas.put(rg2, new Pessoa("Carlos", rg2, "17/05/1996"));
        
        for(String chave : mapPessoas.keySet()){
            Pessoa p = mapPessoas.get(chave);
            System.out.println(p.getNome());
        }
        
    }
}
