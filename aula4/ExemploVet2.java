import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploVet2 {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)); 
        
         System.out.println("Informe o numero do mes");
         int num = Integer.parseInt(reader.readLine());

         Meses meses = new Meses();
         String mes = meses.getNomeMes(num);
         if(mes.equals("")){
             System.out.println("Valor inválido");
         }else{
            System.out.println("O mês é: "+ mes);
         }
    }
}

