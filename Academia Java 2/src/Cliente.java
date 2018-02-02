
public class Cliente {

	private String nome;
	private String cpf;
	
	void inicializaCliente(String nomeCliente, String cpfCliente){
		cpf = cpfCliente;
		nome = nomeCliente;		
	}
	
	void imprimeDados(){
		System.out.println("----------------------");
        System.out.println("Nome do cliente :" + nome);
        System.out.println("CPF:" + cpf);
        System.out.println("----------------------");    
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public String getCpf(){
		return cpf;
	}
}
