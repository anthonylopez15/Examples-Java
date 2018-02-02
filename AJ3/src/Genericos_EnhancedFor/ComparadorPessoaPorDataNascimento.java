package Genericos_EnhancedFor;

import java.util.Comparator;

public class ComparadorPessoaPorDataNascimento implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return pessoa1.getDataNascimento().compareTo(pessoa2.getDataNascimento());
    }
    
    
}
