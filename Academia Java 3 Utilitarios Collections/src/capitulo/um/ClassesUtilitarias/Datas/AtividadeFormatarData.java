package capitulo.um.ClassesUtilitarias.Datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AtividadeFormatarData {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_MONTH, 3);
        cal.set(Calendar.YEAR, 1997);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 57);
        cal.set(Calendar.SECOND, 0);

        Date data = cal.getTime();
        System.out.println("data atual: " + data);

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH'h'mm'm'ss's'");
        String dataFormatada = formatador.format(data);
        System.out.println("Data formatada: " + dataFormatada);

        Locale local = Locale.ITALIAN;
        DateFormat dataformat = DateFormat.getDateInstance(DateFormat.FULL, local);
        String data2 = dataformat.format(data);
        System.out.println("Date Format: " + data2);

    }
}
