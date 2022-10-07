import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LerDados {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)); 
            //System.in = teclado
            //InputStreamReade = captura um fluxo de entrada de dados
            //BufferedReader = buffer de leitura
        String linha = "";
        System.out.println("Digite alguma coisa ou S para sair");
        while(!linha.toUpperCase().equals("S")){
            linha = reader.readLine();
            System.out.println("Digitou: "+linha);
        }
    }
}
