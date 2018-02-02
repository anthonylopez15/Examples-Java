
public class Conta {

	private double saldo;
	private String numero;
	private String titular;
	private int agencia;
	private int banco;
	
	
	void inicializaConta(double saldoInicial, String num, String tit, int ag, int bc) {
        System.out.println("Inicializando uma conta com os seguintes dados:");
        saldo = saldoInicial;
        numero = num;
        titular = tit;
        agencia = ag;
        banco = bc;
	}
	
	void saque (double valor){
		System.out.println("Realizando um saque R$" +valor+ " da conta " +this.numero);
		if(valor > 0){
			if(this.saldo >= valor){//VERIFICA SE TEM SALDO SUFI
				this.saldo -= valor;//SACA VALOR DO SALDO
			}else{
				System.out.println("Saldo Insuficiente para retirada!");
			}
		}else{
			System.out.println("Valor Indevido.");
		}
	}
	
	void deposito(double valor){
		System.out.println("Depositando R$" +valor);
		if(valor > 0){
			this.saldo += valor;
		}else
            System.out.println("O valor do deposito deve ser positivo");
	}
	
	void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println("AGENCIA:\t" + agencia + "\t BANCO:\t" + banco);
        System.out.println("NUMERO: \t" + numero);
        System.out.println("TITULAR: \t" + titular);
        System.out.println("SALDO: \t" + saldo);
        System.out.println("-----------------------------\n");
    }
	
	public double getSaldo(){
		return saldo;
	}
	
	public int getAgencia(){
		return agencia;
	}
	
	public int getBanco(){
		return banco;
	}
	public String getNumero(){
		return numero;
	}
	public String getTitular(){
		return titular;
	}
	public void setTitular(String titular){
		this.titular = titular;
	}
	
}
