public class UtilizadorCalculoArea {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.setLado(3.0f);
        System.out.println("Area do quadrado: " + q1.calcularArea());

        Retangulo r1 = new Retangulo();
        r1.setBase(5.2f);
        r1.setAltura(2.5f);        
        System.out.println("Area do Retangulo: " + r1.calcularArea());

        Circulo c1 = new Circulo();
        c1.setRaio(2.4f);
        System.out.println("Area do Circulo: " + c1.calcularArea());
    }
}
