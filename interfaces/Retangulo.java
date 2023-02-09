public class Retangulo implements FormaGeometrica{
    public float altura;
    public float base;

    public float calcularArea(){
        return this.base * this.altura;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }

    
}
