package LeituraEscritadeDados;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste2EscritaLeituraTiposPrimitivos {

    public static void main(String[] args) {
        byte b = 1;
        short s = 12;
        int i = 656;
        long l = 5566L;
        float f = 451f;
        double d = 1241.0;

        String nomeArq = "D:/tipoPrimitivos.dat";
        FileOutputStream escritorArquivo = null;
        DataOutputStream escritoPrimivos = null;

        System.out.println("Enviando dados para arquivo " + nomeArq);
        try {
            escritorArquivo = new FileOutputStream(nomeArq);
            escritoPrimivos = new DataOutputStream(escritorArquivo);
            escritoPrimivos.writeByte(b);
            escritoPrimivos.writeShort(s);
            escritoPrimivos.writeInt(i);
            escritoPrimivos.writeLong(l);
            escritoPrimivos.writeFloat(f);
            escritoPrimivos.writeDouble(d);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Teste2EscritaLeituraTiposPrimitivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Teste2EscritaLeituraTiposPrimitivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (escritoPrimivos != null) {
                    escritoPrimivos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger("Problema ao Fechar Stream: "+ Teste2EscritaLeituraTiposPrimitivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        leitorPrimitivos();
    }
    
    public static void leitorPrimitivos(){
        String nomeArq = "C:/tipoPrimitivos.dat";
        FileInputStream leitorArquivos = null;
        DataInputStream leitorPrimitivos = null;
        
        try {
            leitorArquivos = new FileInputStream(nomeArq);
            leitorPrimitivos = new DataInputStream(leitorArquivos);
            byte b = leitorPrimitivos.readByte();
            short s = leitorPrimitivos.readShort();
            int i = leitorPrimitivos.readInt();
            long l = leitorPrimitivos.readLong();
            float f = leitorPrimitivos.readFloat();
            double d = leitorPrimitivos.readDouble();
            
            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();           
        }
    }
}
