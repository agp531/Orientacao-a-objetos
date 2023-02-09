public class Quadrado implements FormaGeometrica{
    public float lado;

    public float calcularArea(){
        return this.lado * this.lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    
}
