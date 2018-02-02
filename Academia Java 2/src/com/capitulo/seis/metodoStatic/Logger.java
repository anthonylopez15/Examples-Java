package com.capitulo.seis.metodoStatic;

public class Logger {
	private static int qtdLogs;
	
	public static void logId(String mensagem){
		String dataHora = "Hoje é: " + new java.util.Date();
		System.out.println(dataHora + " : " + qtdLogs + " : " + mensagem);
		qtdLogs++;
	}

	public static void main(String[] args) {
		Logger.logId("Logger");
		Logger log1 = new Logger();
		log1.logId("log1");
		Logger log2 = new Logger();
		log2.logId("log2");
		Logger.logId("Logger");
	}

}
