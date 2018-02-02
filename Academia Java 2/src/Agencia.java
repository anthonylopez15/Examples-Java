
public class Agencia {

	private String numero;
	private int banco;
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	void inicializaAgencia (String numeroAgencia, int bancoAgencia){
		numero = numeroAgencia;
		banco = bancoAgencia;
	}

	void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + numero);
        System.out.println("Banco no." + banco);
        System.out.println("----------------------");
    }
}

 