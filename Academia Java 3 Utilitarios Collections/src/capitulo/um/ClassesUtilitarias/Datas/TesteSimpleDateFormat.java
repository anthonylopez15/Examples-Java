package capitulo.um.ClassesUtilitarias.Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteSimpleDateFormat {

    public static void main(String[] args) {

//        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dataOriginal = new Date();

        System.out.println("data original: " + dataOriginal);
        String textoFormatado = formatador.format(dataOriginal);
        System.out.println("texto formatada: " + textoFormatado);

//        String textoParaConverter = "11/07/2014";
        String textoParaConverter = "2014-07-11 17:58:13";
        Date dataConvertida = null;

        try {
            dataConvertida = formatador.parse(textoParaConverter);
            System.out.println("data convertida: " + dataConvertida);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }

}
