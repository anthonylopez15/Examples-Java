package com.capitulo.quatro.sobrecarga;

public class Produto {

	private String descricao;
	private String marca;
	private double preco;
	
	public void valoresIniciais(double umPreco, String umaMarca){
		this.alterarPreco(umPreco);
		this.setMarca(umaMarca);
	}
	public void valoresIniciais(double umPreco, String umaDescricao, String umaMarca){
		this.valoresIniciais(umPreco, umaMarca);
		this.setDescricao(umaDescricao);
	}
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(String novaDescricao){
		this.descricao = novaDescricao;
	}
	public String getMarca(){
		return this.marca;
	}
	public void setMarca(String novaMarca){
		this.marca = novaMarca;
	}
	public double getPreco(){
		return preco;
	}
	public void alterarPreco(double novoPreco){
		if(novoPreco > 0){
			this.preco = novoPreco;
		}
	}
	
	public void aumentarPreco(double porcentagem){
		if(porcentagem > 0){
			System.out.println("aumentando o preco em "+porcentagem +"%");
			porcentagem = 1 + (porcentagem / 100);
			preco *= porcentagem;
			System.out.println("Novo preco = " + this.getPreco());
		}else{
			System.out.println("Aumente deves ser maior do que zero");
		}
	}
	void imprime(){
		System.out.println("------------------");
		System.out.println("Produto : " + descricao);
		System.out.println("Marca : " + marca);
		System.out.println("Preco : " + preco);
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		Produto p = new Produto();
		p.valoresIniciais(9.0,"Produto Y","Marca X");
		p.imprime();
		Produto p2 = new Produto();
		p2.valoresIniciais(1000, "Fiat");
		p2.imprime();

	}

}
