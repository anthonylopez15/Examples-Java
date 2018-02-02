package reescrita;

public class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;
	
	public Funcionario(String nome, String cpf, double sal){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setSalario(sal);
	}
	public void imprimeFun(){
		System.out.println("-------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("-------------------------");
	}
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
}
