package capitulo.vDois.Set_HashSet_Iterator_LinkedHashSet_TreeSet_Compable_Comparator_NavigableSet_ListArrayList;

public class Cliente implements Comparable{

    private String nome;
    private String telefone;
    private String cpf;
    private int id;
    private int qtdPedidos;

    /**
     * @param nome Nome do cliente
     * @param telefone Telefone do cliente
     * @param cpf CPF do cliente
     * @param id ID do cliente
     */
    public Cliente(int id, String nome, int qtdPedidos) {
        this.id = id;
        this.setNome(nome);
        this.setQtdPedidos(qtdPedidos);
    }

    public Cliente(String nome, String telefone, String cpf, int id) {
        this(nome, telefone, cpf);
        this.id = id;
    }

    /**
     * Este construtor podera ser utilizado quando o id do cliente precisar ser
     * atribuido depois, como por exemplo quando e necessario criar o cliente
     * para salvar no banco de dados, onde o id e gerado automaticamente.
     *
     * @param nome Nome do cliente
     * @param telefone Telefone do cliente
     * @param cpf CPF do cliente
     *
     */
    public Cliente(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    /**
     * @return CPF do Cliente
     */
    public String getCpf() {
        return cpf;
    }

    public int getQtdPedidos() {
        return qtdPedidos;
    }

    public void setQtdPedidos(int qtdPedidos) {
        this.qtdPedidos = qtdPedidos;
    }

    /**
     * @return ID do cliente
     */
    public int getId() {
        return id;
    }

    /**
     * @return Nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return Telefone do cliente
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param cpf CPF do cliente
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param id ID do cliente
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param nome Nome do cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param telefone Telefone do cliente
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * toString para impressao dos dados do cliente.
     */
    @Override
//    public String toString() {
//        String cliente = " ID [" + this.id + "]";
//        cliente += this.nome + "\t CPF (" + this.cpf + " ) \t";
//        cliente += "- Tel: {" + this.telefone + "}";
//        return cliente;
//    }
    public String toString() {
        String cliente = " id [" + this.id + "] ";
        cliente += "\tNome: " + this.nome + "\t Pedidos: " + this.qtdPedidos ;
        return cliente;
    }

    /*
	 * Para verificar que elementos repetidos nao podem ser inseridos no TreeSet
	 * descomente o metodo hashCode e o metodo equals
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Cliente other = (Cliente) obj;
        if (cpf == null) {
            if (other.cpf != null) {
                return false;
            }
        } else if (!cpf.equals(other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Cliente outroCli = (Cliente) o;
        String atributo = this.cpf;
        String otroAtri = outroCli.getCpf();
        return atributo.compareTo(otroAtri);
    }
    
    

}
