package com.capitulo.oito.sobrescrita;

public class Endereco {
	private String rua;
	private int numero;
	
	public Endereco(String rua, int num){
		this.setRua(rua);
		this.setNumero(num);
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
