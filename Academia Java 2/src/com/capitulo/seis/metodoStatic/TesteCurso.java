package com.capitulo.seis.metodoStatic;

import com.capitulo.cinco.contrutores.Curso;


public class TesteCurso {	
	
		
	public static void main(String[] args) {
		Curso curso1 = new Curso("Academia Java", null, null, 128);
		System.out.println("O curso "+curso1.getNome()
				+ " tem a carga horaria de "+ curso1.getCargaHoraria()+" horas");
	
		Curso curso2 = new Curso("Academia Web", null, null, 124);
		System.out.println("O curso "+curso2.getNome()
				+ " tem a carga horaria de "+ curso2.getCargaHoraria()+" horas");
	
//		System.out.println("Exemplos do uso da classe math:");
//		System.out.println("raiz quadrada de 625: "+ Math.sqrt(625));
//		System.out.println("numero aleatorio: " + Math.random());
//		System.out.println("4.79 arredondado: "+ Math.round(4.79));
	}

}

