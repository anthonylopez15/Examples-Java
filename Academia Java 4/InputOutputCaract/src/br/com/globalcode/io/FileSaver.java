package br.com.globalcode.io;

import br.com.globalcode.util.GlobalcodeException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Importante:
 * Este codigo sera utilizado pela classe EditorTexto por isto:
 *  
 * 1. Nao altere a assinatura dos metodos desta classe, ou seja, mantenha todos 
 * os modificadores, os parametros e as exceptions lançadas.
 * 2. Nao altere o nome desta classe
 * 
 * OBS: Na abertura dos arquivos, o texto aberto estara deslocado em relaçao a
 * atual tela. Para confirmar a abertura do arquivo, utilize as barras de rolagem 
 * na tela de edição.
 * 
 */
public class FileSaver {

    public static void save(String texto, String fileName) throws GlobalcodeException {
        FileWriter gravador = null;
        BufferedWriter buferizado = null;
        try {
            gravador = new FileWriter(fileName);
            buferizado = new BufferedWriter(gravador);
            buferizado.write(texto);
            buferizado.newLine();
            buferizado.flush();
            buferizado.close();
        } catch (IOException ex) {
            Logger.getLogger(FileSaver.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (buferizado != null && gravador != null) {
                    gravador.close();
                    buferizado.close();
                }
            } catch (IOException ex) {
                System.out.println("Erro ao fechar buffer");
                ex.printStackTrace();
            }

        }
    }

    public static String read(String fileName) throws GlobalcodeException {
        FileReader leitorArquivo = null;
        BufferedReader leitorBuferizado = null;
        String line = null;
        StringBuilder out = null;
        try {
            leitorArquivo = new FileReader(fileName);
            leitorBuferizado = new BufferedReader(leitorArquivo);
            out = new StringBuilder();
            line = leitorBuferizado.readLine();
            while (line != null) {
                out.append(line).append("\n");
                line = leitorBuferizado.readLine();
            }
            return out.toString();
        } catch (IOException ex) {
            new GlobalcodeException(ex, "ERRO NA LEITURA DO ARQUIVO ");
        } finally {
            try {
                if (leitorBuferizado != null && leitorArquivo != null) {
                    leitorArquivo.close();
                    leitorBuferizado.close();
                }
            } catch (IOException ex) {
                new GlobalcodeException(ex, "Erro ao fecha buffer ");
            }
        }
        return null;
        // o valor null deve ser trocado pela String lida no método
    }
}
