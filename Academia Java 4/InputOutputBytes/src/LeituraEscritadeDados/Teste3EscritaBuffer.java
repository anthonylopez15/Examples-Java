package LeituraEscritadeDados;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Teste3EscritaBuffer {

    /*private*/
    private FileOutputStream gravador;
    private BufferedOutputStream gravadorBufferizado;
    private DataOutputStream gravadorPrimitivos;

    /*static*/
    static final byte DADOS_SHORT = 0;
    static final byte DADOS_FLOAT = 1;
    static final byte DADOS_UTF = 2;

    public Teste3EscritaBuffer(String nomeArquivo) throws FileNotFoundException {
        gravador = new FileOutputStream(nomeArquivo, true);
        gravadorBufferizado = new BufferedOutputStream(gravador, 1024);
        gravadorPrimitivos = new DataOutputStream(gravadorBufferizado);
    }

    public void fecharArquivo() throws IOException {
        gravadorPrimitivos.flush();
        gravadorPrimitivos.close();
    }

    public void gravarArrayShort(short[] array) throws IOException {
        gravadorPrimitivos.write(DADOS_SHORT);
        gravadorPrimitivos.writeInt(array.length);
        for (int i = 0; i < array.length; i++) {
            gravadorPrimitivos.writeShort(array[i]);
//            System.out.print(array[i] + "\t");
        }
//        System.out.println();
    }

    public void gravarArrayFloat(float[] array) throws IOException {
        gravadorPrimitivos.write(DADOS_FLOAT);
        gravadorPrimitivos.writeInt(array.length);
        for (int i = 0; i < array.length; i++) {
            gravadorPrimitivos.writeFloat(array[i]);
//            System.out.print(array[i] + "\t");
        }
//        System.out.println();
    }

    public void gravarStringUTF(String texto) throws IOException {
        gravadorPrimitivos.write(DADOS_UTF);
        gravadorPrimitivos.writeUTF(texto);
//        System.out.println("String: " + texto);
    }
}
