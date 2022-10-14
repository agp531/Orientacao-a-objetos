public class Turma {
    private int numeroTurma;
    private String nomeCurso;
    private int ano;
    private Aluno[] vetAlunos;
    private int qtdAlunos;

    public Turma(){
        this.vetAlunos = new Aluno[40];
        this.qtdAlunos = 0;
    }

    public int getNumeroTurma() {
        return numeroTurma;
    }
    public void setNumeroTurma(int numeroTurma) {
        this.numeroTurma = numeroTurma;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


// ALUNO
    public Aluno getAluno(int posicao){
        return this.vetAlunos[posicao];
    }

    public void setAluno(Aluno a){
        if(this.qtdAlunos < 40){
            this.vetAlunos[this.qtdAlunos] = a;
            this.qtdAlunos++;
        }
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }
       
}
