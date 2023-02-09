import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExEscritaArquivo {
    
    public static void main(String[] args) throws Exception{
        String nomeArqSaida = "arqSaida.csv";
        BufferedWriter arqGravacao = new BufferedWriter(
            new FileWriter(nomeArqSaida)
        );

        String colunaProduto = "Produto";
        String colunaEstoque = "Estoque";
        String colunaPreco = "Preco";
        String linhaColuna = colunaProduto + ";" + colunaEstoque + ";" + colunaPreco;
        arqGravacao.write(linhaColuna);
        arqGravacao.newLine();


        String nomeProduto = "Mouse";
        String preco = "299.90";
        String estoque = "37";
        String linha = nomeProduto + ";" + estoque + ";" + preco;
        arqGravacao.write(linha);
        arqGravacao.newLine();

        linha = "Notebook;11;3500.50";
        arqGravacao.write(linha);
        arqGravacao.newLine();

        linha = "Cabo Usb;70;19.90";
        arqGravacao.write(linha);
        arqGravacao.newLine();

        arqGravacao.close();

    }
}
