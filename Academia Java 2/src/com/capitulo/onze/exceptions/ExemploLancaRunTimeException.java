package com.capitulo.onze.exceptions;

import java.io.File;
import java.io.IOException;

public class ExemploLancaRunTimeException {

//	public void criarArquivo(String name) throws IOException{
//		File f = new File(name);
//		f.createNewFile();
//	}
//	
//	public static void main(String[] args){
//		try {
//			ExemploLancaRunTimeException ca = new ExemploLancaRunTimeException();
//			ca.criarArquivo("teste.txt");
//			System.out.println("Arquivo criado");
//		} catch (IOException e) {
//			System.out.println("---------Tratamento de ERRO-----------");
//			System.out.println("Não foi possivel criar o arquivo!"+ e.getMessage());
//			System.out.println("--------------------------------------");
//		}
//		
//		
//	}
	public static void main(String[] args){
		int i = 23;
		int j = 1;
		try {
			double res = i/j;
			System.out.println(i + " / " + j + " = " + res);
		} catch (ArithmeticException e) {
			System.out.println("-------Tratamento de Erro-------");
			System.out.println("Menssagem de erro para o usuario:");
			System.out.println("Divisão invalida! " + e.getMessage());
			System.out.println("\nStack Trace: ");
			e.printStackTrace();
			System.out.println("--------------------------------");
		}finally{
			System.out.println("Passou pelo Finally");
		}
	}
}
