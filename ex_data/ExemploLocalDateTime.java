import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ExemploLocalDateTime {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        System.out.println(data);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        //formatar
        DateTimeFormatter formato = 
            DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm");
        String dataFormatada = dataHora.format(formato);
        System.out.println(dataFormatada);

        //calcular
        LocalDateTime hoje = LocalDateTime.now();
        LocalDateTime amanha = hoje.plusDays(6);
        System.out.println("Hoje: " + hoje);
        System.out.println("Amanha: " + amanha);

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro =
            agora.plusDays(5).plusHours(3).plusMinutes(2);
        System.out.println("agora: " + agora);
        System.out.println("futuro: " + futuro);

        //criar uma data especifica
        DateTimeFormatter formatoData = 
            DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate minhaData = LocalDate.parse("21/02/2023",formatoData);
        System.out.println(minhaData.format(formatoData));
    }

    
}
