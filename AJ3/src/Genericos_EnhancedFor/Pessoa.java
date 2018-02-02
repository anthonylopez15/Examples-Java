
package Genericos_EnhancedFor;

import java.util.Date;


public class Pessoa implements Comparable<Pessoa>{
   private String nome;
   private String rg;
   private String dataNascimento;

    public Pessoa(String nome, String rg, String dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int compareTo(Pessoa outroPessoa) {
        String dadosCompletos = this.nome + this.rg;
        String dadosCompletosOutraPessoa = outroPessoa.nome + outroPessoa.rg;
        return dadosCompletos.compareTo(dadosCompletosOutraPessoa);
    }

    @Override
    public String toString() {
        return "nome = " + nome + " rg = " + rg + " dataNascimento = " + dataNascimento;
    }
    
   
}
