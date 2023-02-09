import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate {
    public static void main(String[] args) {
        Date agora = new Date();
        System.out.println("Agora: " + agora);

        /*
        SimpleDateFormat
        -----------------------------
        Simbolo	Significado
        y		Ano
        M		Mes
        d		Dia
        H		Hora
        m		Minuto
        s		Segundo	
        E		Dia da semana
    
        https://docs.oracle.com/javase/8/docs/api/java/text/DateFormat.html
        https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html        
        */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(agora);
        System.out.println("Data formatada: " + dataFormatada);

        Date data = new Date();
        DateFormat df = DateFormat.getDateInstance(
            DateFormat.SHORT);
        System.out.println(df.format(data));
        
        df = DateFormat.getDateInstance(
            DateFormat.MEDIUM);
        System.out.println(df.format(data));

        df = DateFormat.getDateInstance(
            DateFormat.LONG);
        System.out.println(df.format(data));

        df = DateFormat.getDateInstance(
            DateFormat.FULL);
        System.out.println(df.format(data));
    }

}