import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.sound.midi.Soundbank;

public class SistemaEscolar {
    private Escola e1;
    BufferedReader reader;  
    public static void main(String[] args) throws Exception{
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();
        se.reader = new BufferedReader(
            new InputStreamReader(System.in)
        );
        System.out.println("Informe o nome da Escola: ");
        se.e1.setNome(se.reader.readLine());
        System.out.println("Telefone: ");
        se.e1.setTelefone(se.reader.readLine());
        se.menu();  
    }

    public void menu() throws Exception{
        String opcao = "";
        while(!opcao.equals("4")){
            System.out.println("|--------------------------------|");
            System.out.println("|[1] Cadastrar nova turma        |");
            System.out.println("|[2] Lista as turmas existentes  |");
            System.out.println("|[3] Consultar turma             |");
            System.out.println("|[4] Sair                        |");
            System.out.println("|--------------------------------|");

            opcao = this.reader.readLine();
            switch(opcao){
                case "1":
                    this.cadastrarTurma();
                    break;

                default:
                    break;
            }
        }
    }

   
    


    public void cadastrarTurma() throws Exception{
        Turma t = new Turma();
        System.out.println("[Cadastro de turma]");
        System.out.println("Informe o numero da turma: ");
        t.setNumeroTurma(Integer.parseInt(
            this.reader.readLine()));

        System.out.println("Nome do curso: ");
        t.setNomeCurso(this.reader.readLine());

        System.out.println("Ano: ");
        t.setAno(Integer.parseInt(this.reader.readLine()));

        System.out.println("-------Alunos--------");
        for(int i=0;i<40;i++){
            System.out.println("\nNome do aluno: ");
            String nome = this.reader.readLine();
            if(nome.equals("")){
                break;
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nome);

            System.out.println("\nMatricula");
            aluno.setMatricula(this.reader.readLine());

            System.out.println("\nNota1: ");
            aluno.setNota1(Float.parseFloat(this.reader.readLine()));

            System.out.println("\nNota2: ");
            aluno.setNota2(Float.parseFloat(this.reader.readLine()));

            System.out.println("\nNota3: ");
            aluno.setNota3(Float.parseFloat(this.reader.readLine()));

            System.out.println("\nNota4: ");
            aluno.setNota4(Float.parseFloat(this.reader.readLine()));

            t.setAluno(aluno);
        }
        this.e1.setTurma(t);
    }

}


