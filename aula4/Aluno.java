public class Aluno {
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    //metodo getter
    //serve pra retornar o valor de um atributo
    public String getNome(){
        return this.nome;
        //this faz referencia a um atributo ou metodo declarado no escopo da classe
    }

    //metodo setter 
    //atribui um valor a um atributo
    public void setNome(String nome){
        this.nome = nome;
    }

// MATRICULA 

    public String getMatricula(){
        return this.matricula;
        
    }

   
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }


//NOTA 1

    public float getNota1(){
        return this.nota1;
    }

   
    public void setNota1(float nota1){
        this.nota1 = nota1;
    }

//NOTA 2

    public float getNota2(){
        return this.nota2;
    }

   
    public void setNota2(float nota2){
        this.nota2 = nota2;
    }


//NOTA 3

    public float getNota3(){
        return this.nota3;
    }

   
    public void setNota3(float nota3){
        this.nota3 = nota3;
    }

//NOTA 4

    public float getNota4(){
        return this.nota4;
    }

   
    public void setNota4(float nota4){
        this.nota4 = nota4;
    }

    public float calcularMedia(){
        return (this.nota1 + this.nota2 
            + this.nota3 + this.nota4) / 4;
    }



}
