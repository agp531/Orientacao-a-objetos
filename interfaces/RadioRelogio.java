public class RadioRelogio implements Radio,Relogio{
    private String horarioAtual;

    public String getHoras(){
        this.horarioAtual = "horario atual .... ";
        return horarioAtual;
    }  

    public void ligar(){
       System.out.println("Radio ligado");
    }

    public void desligar(){
        System.out.println("Radio desligado");
    }

    public void trocarEstacao(float frequencia){
        System.out.println("Trocando a frequencia para " + String.valueOf(frequencia));
    }
}
