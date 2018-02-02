package LeituraEscritadeDados;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste3LeituraBuffer {

    public static void main(String[] args) {
        FileInputStream leitorArquivo = null;
        BufferedInputStream leitorBufferizado = null;
        DataInputStream leitorPrimitivos = null;

        try {
            leitorArquivo = new FileInputStream("D:/dados.txt");
            leitorBufferizado = new BufferedInputStream(leitorArquivo, 4096);
            leitorPrimitivos = new DataInputStream(leitorBufferizado);
            int leitura = 0;
            int tamanhoArray = 0;
            
            
            while ((leitura = leitorPrimitivos.read()) != -1) {
                byte b = (byte) leitura;
                switch (b) {
                    case 0://tratar array de short
                        tamanhoArray = leitorPrimitivos.readInt();
                        short[] arrayShort = new short[tamanhoArray];
                        for (int i = 0; i < arrayShort.length; i++) {
                            arrayShort[i] = leitorPrimitivos.readShort();
                        }
                        tratarShorts(arrayShort);
                        break;
                    case 1://tratar array de float
                        tamanhoArray = leitorPrimitivos.readInt();
                        float[] arrayFloat = new float[tamanhoArray];
                        for (int i = 0; i < arrayFloat.length; i++) {
                            arrayFloat[i] = leitorPrimitivos.readFloat();
                        }
                        tratarFloats(arrayFloat);
                        break;
                    case 2://tratar String UTF
                    //o formato UTF contem o tamanho da string
                        String texto = leitorPrimitivos.readUTF();
                        tratarString(texto);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Teste3LeituraBuffer.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                leitorPrimitivos.close();
            } catch (IOException ex) {
                Logger.getLogger(Teste3LeituraBuffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private static void tratarShorts(short[] array) {
        System.out.print("array de short: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void tratarFloats(float[] array) {
        System.out.print("array de float: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void tratarString(String s) {
        System.out.println("String: " + s);
    }
}
