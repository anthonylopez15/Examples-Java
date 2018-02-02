package com.capitulo.onze.polimorfismo;

public class TesteArrayHeterogeneo {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Willian Gates da Silva");
		p.setRg(189988111223L);
		
		Cliente c = new Cliente();
		c.setNome("Luiz Antonio faria lima");
		c.setRg(12399922818L);
		c.setCpf("66644552-98");
		
		Funcionario f = new Funcionario();
		f.setNome("Americo Vespucio da GAma");
		f.setRg(98888283L);
		f.setSalario(2650.0);
		f.setCarteiraProfissional("8777738892347");
		
		Pessoa[] pessoas = new Pessoa[3];
		pessoas[0] = f;//Funcionario
		pessoas[1] = p;//Pessoa
		pessoas[2] = c;//Cliente
		
		RelatorioPessoas relatorio = new RelatorioPessoas();
		relatorio.imprimeArray(pessoas);
	}

}
