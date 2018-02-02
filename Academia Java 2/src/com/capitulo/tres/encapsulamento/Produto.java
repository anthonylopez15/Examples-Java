package com.capitulo.tres.encapsulamento;

public class Produto {

	String descricao, marca;
	double preco;
	
	void valoresInicias(double umPreco, String umaDescricao, String umaMarca){
		alterarPreco(umPreco);
		setDescricao(umaDescricao);
		setMarca(umaMarca);
	}
	
	String getDescricao(){
		return descricao;
	}
	void setDescricao(String novaDescricao){
		descricao = novaDescricao;
	}
	String getMarca(){
		return marca;
	}
	void setMarca(String novaMarca){
		marca = novaMarca;
	}
	double getPreco(){
		return preco;
	}
	void alterarPreco(double novoPreco){
		if((novoPreco > 0) && (novoPreco != this.preco)){
			preco = novoPreco;
			System.out.println("Preco alterado com sucesso! \nPreco Atual : "+this.preco);
		}else{
			System.out.println("O valor não satisfatorio");
		}
	}
	void aumentarPreco(double porcentagem){
		if(porcentagem > 0){
			System.out.println("aumentar o preco em "+porcentagem+" % ");
			porcentagem = 1 + (porcentagem/100); 
			preco = preco * porcentagem;//preco = preco * ((porcentagem/100)+1)
			System.out.println("Novo preco: "+preco);
		}else{
			System.out.println("aumento deve ser maior do que zero");
		}
	}
	void imprime(){
		System.out.println("------------------");
		System.out.println("Produto : " + descricao);
		System.out.println("Marca : " + marca);
		System.out.println("Preco : " + preco);
		System.out.println("------------------");
	}
}
