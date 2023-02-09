public class Circulo implements FormaGeometrica {
    public float raio;
    public float pi;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public float calcularArea(){
        this.pi = 3.14f;
        return this.raio * this.raio * this.pi;
    }

}
