package LeituraEscritadeDados;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Teste3BufferTeste {

    public static void main(String[] args) throws IOException {

        Teste3EscritaBuffer gd = new Teste3EscritaBuffer("D:/dados.txt");
        
        String texto = "Hoje é um bom dia para testar os Streams do JAVA";
        gd.gravarStringUTF(texto);
        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yy HH:mm");
        gd.gravarStringUTF(formatador.format(new Date()));
        
        float[] dadosFloat = {1341.202F, 12.23F, -914.508F, 1275.8759F };
        gd.gravarArrayFloat(dadosFloat);
        
        short[] dadosShort = {1015, 2316, -1723, 2332, -3821, 8122};
        gd.gravarArrayShort(dadosShort);
        
        gd.gravarStringUTF("VAMOS PARAR POR AQUI. ");
        
        gd.fecharArquivo();
       
        
    }
}
