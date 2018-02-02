package com.capitulo.seis.metodoStatic;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
public class Banco {

    private String nome;
    private int numero;

    /**
     * @param nome
     *            Nome do banco
     * @param numero
     *            Numero do banco
     */
    public Banco(String nome, int numero) {
        this.setNome(nome);
        this.setNumero(numero);
    }

    /**
     * @return nome nome do banco
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return numero numero do banco
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param nome
     *            nome do banco
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param num
     *            numero do banco
     */
    public void setNumero(int num) {
        numero = num;
    }

    /**
     * Metodo para impressao de todos os dados da classe Banco
     */
    public void imprimeDados() {
        System.out.println("Banco: " + nome + "\tNumero do banco " + numero);
    }

    public static void main(String[] args){
    	// Criacao e inicializacao do banco
        System.out.println("\n\nPASSO1: Criacao do banco:");
        Banco oBanco = new Banco("GlobalBank", 100);
        oBanco.imprimeDados();
        // Criacao e inicializacao da agencia
        System.out.println("\n\nPASSO2: Criacao da agencia:");
        Agencia ag = new Agencia("001", oBanco);
        ag.imprimeDados();
        // Criacao do cliente
        System.out.println("\n\nPASSO3: Criacao do titular:");
        Cliente titular = new Cliente("Joao da Silva", "12323");
        titular.imprimeDados();
        // Criacao de uma conta
        System.out.println("\n\nPASSO4: Criacao da conta:");
        Conta aConta = new Conta(10000, "1265", titular, ag, oBanco);
        aConta.imprimeDados();
    }
}

