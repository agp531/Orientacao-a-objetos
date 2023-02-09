public class Utilizador {
    public static void main(String[] args) {
        System.out.println("Relógio de pulso");
        RelogioDePulso rp = new RelogioDePulso();
            System.out.println(rp.getHoras());
            System.out.println(rp.iniciarCronometro());

            //nao é possivel instaciar interfaces 
            // Relogio r = new Relogio();

            //a menos que faça na hora da implementacao dos metodos
           /* Relogio r = new Relogio() {
                public String getHoras(){
                    return "meio dia";
                }*/
            //};//uso mais restrito, obs: INUTIL
        System.out.println("Radio Relogio");
        RadioRelogio rr = new RadioRelogio();
        rr.ligar();
        rr.trocarEstacao(97.7f);
        rr.desligar();
        
    }
}
