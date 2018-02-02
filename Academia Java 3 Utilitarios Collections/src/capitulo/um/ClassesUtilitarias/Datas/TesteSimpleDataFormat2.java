package capitulo.um.ClassesUtilitarias.Datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteSimpleDataFormat2 {

    public static void main(String[] args) {

        String marcara = "'Sao Paulo', EEEE, dd 'de' MMMM 'de' yyyy ";
        SimpleDateFormat formatador = new SimpleDateFormat(marcara);
        SimpleDateFormat formatador2 = new SimpleDateFormat("HH:mm:ss S'ms'");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 9);
        cal.set(Calendar.MONTH, Calendar.AUGUST);
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 22);
        cal.set(Calendar.MILLISECOND, 512);

        Date data = cal.getTime();
        System.out.println("data original  : " + data);

        String textoFormatado = formatador.format(data);
        System.out.println("texto formatado: " + textoFormatado);

        String textoFormatado2 = formatador2.format(data);
        System.out.println("texto format  2: " + textoFormatado2);

    }

}
