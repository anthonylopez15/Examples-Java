package com.capitulo.tres.encapsulamento;

public class TestaData {

	public static void main(String[] args){
		Data d = new Data();
		d.setDia(12);
		d.setMes(01);
		d.setAno(2016);
		d.imprime();
		String s = d.isAnoBissexto() ? " " : "nao ";
		System.out.println("O ano " + s + "e bissexto ");
	}
}
