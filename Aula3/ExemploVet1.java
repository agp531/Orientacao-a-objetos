import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploVet1 {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)); 
            
        //declara um vetor de int já atribuindo valores
        int[] vetVal = {4, 7, 5, 8, 1, 3};
        System.out.println(vetVal[4]);

        //declara um vetor de String com 12 posições
        String[] meses = new String[12];
         meses[0] = "Janeiro";
         meses[1] = "Fevereiro";
         meses[2] = "Março";
         meses[3] = "Abril";
         meses[4] = "Maio";
         meses[5] = "Junho";
         meses[6] = "Julho";
         meses[7] = "Agosto";
         meses[8] = "Setembro";
         meses[9] = "Outubro";
         meses[10] = "Novembro";
         meses[11] = "Dezembro";

         System.out.println("Informe o numero do mes");
         int num = Integer.parseInt(reader.readLine());
         System.out.println(meses[num - 1]);

    }
}


