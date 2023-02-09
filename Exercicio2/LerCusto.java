import java.io.BufferedReader;
import java.io.FileReader;

public class LerCusto{
    public static void main(String[] args) throws Exception{
        String nomeArquivo = "Exercicio2/custo.csv";
        BufferedReader arqLeitura = new BufferedReader(
            new FileReader(nomeArquivo)
        );

        String linha;
        while((linha = arqLeitura.readLine()) != null ){
            System.out.println(linha);
        }
        arqLeitura.close();
    }
}
