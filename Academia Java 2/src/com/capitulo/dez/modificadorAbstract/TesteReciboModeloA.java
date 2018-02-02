package com.capitulo.dez.modificadorAbstract;

public class TesteReciboModeloA {

	public static void main(String[] args) {
		
//		FormatadorModeloA fA = new FormatadorModeloA();
//		fA.setNomeEmpresa("Rain microsystem");
//		String texto = fA.gerarRecibo("Anthony Losa", 2000, "11/04/2004", 
//										"Aluguel de servidor");
//		System.out.println(texto);
		
		FormatadorModeloB fB = new FormatadorModeloB();
		fB.setNomeEmpresa("Rain microsystem");
		String texto = fB.gerarRecibo("Anthony Losa", 2000, "11/04/2004", 
										"Aluguel de servidor");
		System.out.println(texto);
	}

}
