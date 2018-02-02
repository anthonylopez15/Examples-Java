package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteLeituraTeclado {

    public static void main(String[] args) {
        //Cria canal de comunicaçao com o teclado
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Digite o texto a ser armazenado em arquivo: ");
            //Leitura de uma linha inteira
            String entrada = bf.readLine();
            BufferedWriter out = new BufferedWriter(new FileWriter("novoTeste.tmp"));
            //escrevendo a string capturada do teclado no arquivo
            out.write(entrada);
            out.flush();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(TesteLeituraTeclado.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("O valor foi armazenado no arquivo:novoTeste.tmp");

        try {
            BufferedReader leitura = new BufferedReader(new FileReader("C:/Pedido.txt"));
            String text = leitura.readLine();
            StringBuilder stringBuilder = new StringBuilder();

            while (text != null) {
                stringBuilder.append(text).append("\n");
                text = leitura.readLine();
            }
            System.out.println(stringBuilder.toString());
        }  catch (IOException ex) {
            Logger.getLogger(TesteLeituraTeclado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
