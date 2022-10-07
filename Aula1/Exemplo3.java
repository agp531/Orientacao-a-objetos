public class Exemplo3 {
    public static void main(String[] args){
        int resultado;
        OperacoesMatematicas opMat = new OperacoesMatematicas();
        resultado = opMat.somar(5,8);  opMat.subtrair(5,8); opMat.dividir(5,8);
        System.out.println(" 5+8 = " + resultado);
        resultado = opMat.multiplicar(5,8);
        System.out.println(" 5*8 = " + resultado);
        resultado = opMat.subtrair(5,8);
        System.out.println(" 5-8 = " + resultado);

        float resultado2 = opMat.dividir(10,2);
        System.out.println(" 10/2 = " + resultado2);
    }
}
