package reescrita;

public class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionariosGerenciados;
	private double saldo;	
	
	public Gerente(String nome, String cpf, double sal, double saldo){
		super(nome, cpf, sal);
		this.saldo = saldo;
	}
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
		return true;
		} else {
			System.out.println("Acesso Negado!");
		return false;
		}
	}
	@Override
	public double getBonificacao(){
		return super.getBonificacao() + 1000;
	}
	
        @Override
	public String toString(){
		String returno = "-------------- ";
		returno += "\nNome: " + super.getNome();
		returno += "\nSalario: " + super.getSalario();
		returno += "\nSaldo: " + this.saldo;
		return returno;
	}
	
	
	public static void main(String[] args){
		Gerente g = new Gerente("Anthony", "12344", 1500.50, 300.20);
		
		
		double b = g.getBonificacao();
		g.imprimeFun();
		
		System.out.println("Bonifica��o do gerente: "+ b);
		System.out.println(g);
		
//		Gerente g2 = new Gerente(100);
//		
//		g.nome = "Joao Silva";
//		
//		
//		
//		g.salario = 5000;
//		if(g != g2){
//		System.out.println("objetos refenciados sao diferentes..");
//		}
		
	}
}
