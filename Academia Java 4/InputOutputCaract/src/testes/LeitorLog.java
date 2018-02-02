package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorLog {

    private String nomeArquivo = Logger.getLogFile();
    private FileReader leitorArquivo;
    private BufferedReader buferizador;

    public void le(String nomeArquivo) throws GlobalcodeException {
        try {
            leitorArquivo = new FileReader(nomeArquivo);
            buferizador = new BufferedReader(leitorArquivo);
            String linha = buferizador.readLine();
            while (linha != null) {                
                System.out.println(linha);
                linha = buferizador.readLine();
            }
        } catch (IOException ex) {
            throw new GlobalcodeException("Erro ao ler o arquivo " + nomeArquivo);
        }finally{
            if(buferizador != null){
                try {
                    buferizador.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void le() throws GlobalcodeException {
        this.le(nomeArquivo);        
    }
}
