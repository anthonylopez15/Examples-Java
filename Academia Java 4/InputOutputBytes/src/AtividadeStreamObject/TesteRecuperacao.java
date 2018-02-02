/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeStreamObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class TesteRecuperacao {

    public static void main(String[] args) {

        String cpf = "11232404-6";
        String nomeArquivo = "Cliente" + cpf + ".ser";
        FileInputStream leitor = null;
        ObjectInputStream leitorObjetos = null;

        try {

            leitor = new FileInputStream(nomeArquivo);
            Cliente clienteRecuperado = null;

            /* 
             * Inserir o codigo de leitura a partir deste ponto 
             *
             */
            leitorObjetos = new ObjectInputStream(leitor);
            clienteRecuperado = (Cliente) leitorObjetos.readObject(); 
            System.out.println("cliente recuperado: " + clienteRecuperado);

        } catch (IOException e) {
            System.out.println("Erro na operacao de I/O");
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteRecuperacao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // fechando os streams
            try {
                if (leitorObjetos != null) {
                    leitorObjetos.close();
                } else if (leitor != null) {
                    leitor.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

}
