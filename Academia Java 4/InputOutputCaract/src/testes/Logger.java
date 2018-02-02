package testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {

    protected static String logFile = "logger.log";

    public static void changeLogFile(String logFile) {
        Logger.logFile = logFile;
    }

    public static String getLogFile() {
        return Logger.logFile;
    }

    public static void log(String mensagem) {
        try {
            FileWriter escritorArquivos = new FileWriter(logFile, true);
            try (BufferedWriter buferizador = new BufferedWriter(escritorArquivos)) {
                buferizador.write(new Date() + " - " + mensagem);
                buferizador.newLine();
                buferizador.flush();
            }
        } catch (Exception e) {
            /*como nao queremos lancar uma excecao quando nao for possivel
              logar, iremos apenas imprimir a mensagem na tela*/
            System.out.println("[Logger] Erro ao executar o metodo log");
            e.printStackTrace();
        }
    }
    public static void log( Exception e){
        try {
            FileWriter escritorArquivos = new FileWriter(logFile, true);
            BufferedWriter buferizador = new BufferedWriter(escritorArquivos);
            buferizador.write(new Date() + " - " + e.getMessage());
            buferizador.newLine();
            PrintWriter printWriter = new PrintWriter(buferizador);
            e.printStackTrace(printWriter);
            printWriter.flush();
            printWriter.close();
        } catch (Exception ex) {
            System.out.println("[Logger] Erro ao executar o metodo lofIt");
            e.printStackTrace();
        }
    }
}
