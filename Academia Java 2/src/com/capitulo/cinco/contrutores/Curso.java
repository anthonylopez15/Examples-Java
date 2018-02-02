package com.capitulo.cinco.contrutores;

public class Curso {
	private String nome;
	private String descricao;
	private String codigo;
	private int cargaHoraria;
	
	public Curso(String nome, String desc, String cod, int carga){
		setNome(nome);
		setCodigo(cod);
		setCargaHoraria(carga);
		setDescricao(desc);
	}
	public void imprime(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Descricao: " + this.getDescricao());
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("Carga Horaria: " + this.getCargaHoraria());
	}
	public int getCargaHoraria(){
		return cargaHoraria;
	}
	public String getCodigo(){
		return codigo;
	}
	public String getDescricao(){
		return descricao;
	}
	public String getNome(){
		return nome;
	}
	public void setCargaHoraria(int i){
		cargaHoraria = i;
	}
	public void setCodigo(String cod){
		codigo = cod;
	}
	public void setDescricao(String desc){
		this.descricao = desc;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	
	public static void main (String[] args){
		String nomeCurso = "Curso de Tricot";
		String descricaCurso = "Neste curso voce ira aprender tudo sobre tricot";
		String codigo = "ct1";
		int cargaHoraria = 40;
		//chama ao construtor
		
		Curso curso1 = new Curso(nomeCurso, descricaCurso, codigo, cargaHoraria);
		curso1.imprime();
	}
	
}








