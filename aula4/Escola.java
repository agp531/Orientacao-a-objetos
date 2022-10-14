public class Escola {
    private String nome;
    private String telefone;
    private Turma[] vetTurmas;
    private int qtdTurmas;

    public Escola(){
        this.vetTurmas = new Turma[20];
        this.qtdTurmas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public Turma getTurma(int posicao){
        return this.vetTurmas[posicao];
    }

    public void setTurma(Turma t){
        if(this.qtdTurmas < 40){
            this.vetTurmas[this.qtdTurmas] = t;
            this.qtdTurmas++;
        }
    }

    public int getQtdTurmas(){
        return this.qtdTurmas;
    }

    
}
