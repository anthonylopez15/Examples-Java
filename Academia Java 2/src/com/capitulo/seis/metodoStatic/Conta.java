package com.capitulo.seis.metodoStatic;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
public class Conta {

    private double saldo;
    private String numero;
    private Cliente titular;
    private Agencia agencia;
    private Banco banco;
	private static double taxaIFN = 0.038d;
	private double acumuladorIFN;

    /**
     * @param saldoInicial
     *            Saldo Inicial da conta
     * @param num
     *            Numero da conta
     * @param tit
     *            Titular da conta
     * @param ag
     *            Agencia a qual a conta pertence
     * @param bc
     *            Banco a qual a agencia pertence
     */
    public Conta(double saldoInicial, String num, Cliente tit, Agencia ag, Banco bc) {
        saldo = saldoInicial;
        numero = num;
        titular = tit;
        agencia = ag;
        banco = bc;
    }

    /**
     * @param num
     *            Numero da conta
     * @param tit
     *            Titular da conta
     * @param ag
     *            Agencia a qual a conta pertence
     * @param bc
     *            Banco a qual a agencia pertence
     */
    public Conta(String num, Cliente tit, Agencia ag, Banco bc) {
        saldo = 0;
        numero = num;
        titular = tit;
        agencia = ag;
        banco = bc;
    }

    /**
     * @param valor
     *            valor a ser sacado da conta
     */
    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + numero);
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                // ------------------------------------------
                // este eh o ponto correto para acumular o IFN
                // ------------------------------------------
                acumularIFN(valor);
            } else
                System.out.println("Saldo insuficiente");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }
    public static double getTaxaIFN(){
		return taxaIFN;
	}
	public static void setTaxaIFN(double taxa){
		taxaIFN = taxa;
	}
	private void acumularIFN(double valorSaque){
		acumuladorIFN += taxaIFN + valorSaque;
	}
	public double getIFNAcumulado(){
		return acumuladorIFN;
	}

    /**
     * @param valor
     *            valor a ser depositado da conta
     */
    public void deposito(double valor) {
        System.out.println("Realizando deposito de R$" + valor + " da conta " + numero);
        if (valor >= 0)
            this.saldo += valor;
        else
            System.out.println("O valor do deposito deve ser positivo");
    }

    /**
     * Este metodo deve imprimir todos os dados da conta corrente
     */
    public void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println(" AGENCIA:" + agencia.getNumero());
        System.out.println(" NUMERO : " + numero);
        System.out.println(" TITULAR: " + titular.getNome());
        System.out.println(" SALDO  : R$" + saldo);
        System.out.println("-----------------------------\n");
    }

    /**
     * @return saldo da conta
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * @return agencia numero da agencia da conta
     */
    public Agencia getAgencia() {
        return agencia;
    }

    /**
     * @return banco numero do banco da conta
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @return numero numero da conta
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @return titular nome do titular da conta
     */
    public Cliente getTitular() {
        return titular;
    }

    /**
     * @param saldo
     *            Saldo da conta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @param agencia
     *            Numero da agencia da conta
     */
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    /**
     * @param banco
     *            Numero do banco da conta
     */
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    /**
     * @param numero
     *            Numero da conta
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @param titular
     *            nome do titular da conta
     */
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static void main(String[] args) {

//        System.out.println("Taxa IFN Vigente: " + Conta.getTaxaIFN());
//        
//        Conta conta1 = new Conta(600, "987444", "Gabriel Monteiro da Silva", "3456", 202);
//        Conta conta2 = new Conta(800, "435357", "Bernardino de Campos", "3456", 202);
//        
//        conta1.imprimeDados();
//        conta2.imprimeDados();
//        
//        conta1.saque(200);
//        conta2.saque(400);
//        
//        System.out.println("IFN devido por conta1:" + conta1.getIFNAcumulado());
//        System.out.println("IFN devido por conta2:" + conta2.getIFNAcumulado());
//        
//        // alterando o IFN
//        Conta.setTaxaIFN(0.03);
//        System.out.println("\n\nNova Taxa IFN: " + Conta.getTaxaIFN());
//        conta1.saque(150);
//        conta2.saque(300);
//        
//        System.out.println("IFN devido por conta1:" + conta1.getIFNAcumulado());
//        System.out.println("IFN devido por conta2:" + conta2.getIFNAcumulado());}
    
    }
    

