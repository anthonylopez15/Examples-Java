package LeituraEscritadeDados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class Teste1LeituraEscritaBytes {

    public static void main(String[] args) {
        byte[] dados = {19, 76, -120, -44};
        FileOutputStream gravador = null;
        try {
            gravador = new FileOutputStream("D:/dados.dat");
            for (int i = 0; i < dados.length; i++) {
                byte b = dados[i];
                gravador.write(b);
            }
            gravador.close();
        } catch (IOException ex) {
            Logger.getLogger(Teste1LeituraEscritaBytes.class.getName()).log(Level.SEVERE, null, ex);
        }
        leitor();
    }

    public static void leitor() {
        FileInputStream leitor = null;
        try {
//            leitor = new FileInputStream("D:/dados.dat");
            leitor = new FileInputStream("D:/dados.dat");
            int contador = 0;
            int ultimaLeitura = leitor.read();
            while (ultimaLeitura != -1) {
                byte b = (byte) ultimaLeitura;
                contador++;
                System.out.println("byte " + contador + ": " + b);
                ultimaLeitura = leitor.read();
            }
            leitor.close();
        } catch (IOException ex) {
            Logger.getLogger(Teste1LeituraEscritaBytes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
