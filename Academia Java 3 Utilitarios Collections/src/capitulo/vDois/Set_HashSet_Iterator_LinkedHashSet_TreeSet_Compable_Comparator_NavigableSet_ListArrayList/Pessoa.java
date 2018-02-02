
package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

public class Pessoa implements Comparable{
    
    private String nome;
    private long rg;
    private String dataNascimento;

    @Override
    public boolean equals(Object o) {
        if (o == null)//Se nao for um parametro nulo retornaremos false
            return false;
        if (! (this.getClass().equals(o.getClass())))//se nao for um objeto de classe Pessoas retornaremos false
            return false;
        Pessoa outra = (Pessoa) o;//Se for um objeto da classe Pessoas faremos o cast down
        boolean rgsIguais = this.getRg() == outra.getRg();//Verifica se os regs sao iguais
        boolean nomesIguais = false; //Verifica se os nomes sao iguais
        if (this.getNome() != null)
            nomesIguais = this.getNome().equals(outra.getNome());
        else
            nomesIguais = outra.getNome() == null;
        return rgsIguais && nomesIguais;//retorna o resultado da comparacao
    }
    
    @Override
    public int compareTo(Object obj){
        Pessoa outraPessoa = (Pessoa) obj;
        String atributos = this.nome + this.rg;
        String outrosAtributos  = outraPessoa.getNome()  + outraPessoa.getRg();
        return atributos.compareTo(outrosAtributos);
    }

    public Pessoa(String nome, long rg, String dataNascimento) {
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

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public int hashCode() {
        String atributos = nome + rg;
        return atributos.hashCode();
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", rg = " + rg + "\t DataNascimento = " + dataNascimento;
    }

}