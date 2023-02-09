import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {


    /* Documentacao oficial do java
    https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
    https://docs.oracle.com/javase/8/docs/api/java/util/GregorianCalendar.html
    */
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("Agora: " + agora);
        Calendar vencimento = agora;
        vencimento.add(Calendar.DATE, 7);
        System.out.println("Vencimento: " + vencimento);
        vencimento.add(Calendar.MONTH, 1);
        System.out.println("Novo vencimento: " + vencimento);

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Ano: "+ gc.get(Calendar.YEAR));
        System.out.println("Mês: "+ gc.get(Calendar.MONTH));
        System.out.println("Dia do mês: "+ gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana: "+ gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do ano: "+ gc.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana do mês: "+ gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Dia da semana no mês: "+ gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Hora: " + gc.get(Calendar.HOUR));
        System.out.println("AM/PM?: " + gc.get(Calendar.AM_PM));
        System.out.println("Hora do dia: " + gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: " + gc.get(Calendar.MINUTE));
        System.out.println("Segundo: " + gc.get(Calendar.SECOND));

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println((df.format(gc.getTime())));

        //criando uma data especifica
        GregorianCalendar data = new GregorianCalendar();
        data.set(Calendar.YEAR,2023);
        data.set(Calendar.MONTH,Calendar.MAY);
        data.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(df.format(data.getTime()));

        data.set(2025,10,5);
        System.out.println(df.format(data.getTime()));

        String dNasc = "02/03/2010";
        String[] vetDtNasc = dNasc.split("/");
        data.set(Calendar.YEAR,Integer.parseInt(vetDtNasc[2]));
        data.set(Calendar.MONTH,Integer.parseInt(vetDtNasc[1])-1);
        data.set(Calendar.DAY_OF_MONTH,Integer.parseInt(vetDtNasc[0]));
        System.out.println(df.format(data.getTime()));



    }
}
