public class Exemplo4{
    

    public static void main(String [] args ) {
        Integer valor1, valor2 , res;
        OperacoesMatematicas opMat = new OperacoesMatematicas();        
    

        if (args.length < 2){
            System.out.println("O programa precisa de 2 parametros");
            System.exit(0);//encerra a execução do programa
        }

        valor1 = Integer.parseInt(args[0]);
        valor2 = Integer.parseInt(args[1]);

        System.out.println("Primeiro teste");
        if(valor1 < 5){
            res = opMat.multiplicar(valor1, valor2);
            System.out.println(valor1 + " * " +valor2+ " = "+ res);
        }else{
            res = opMat.somar(valor1, valor2);
            System.out.println(valor1 + " + " +valor2+ " = "+ res);
        }

        //operadores logicos: && -> AND, || -. OR, ! -> NOT
        //operadores relacionais: == -> Igual, != -> diferente, = -> Atribuição
        System.out.println("Segundo teste");
        if((valor1 > valor2) && (valor2 != 0)){
            res = opMat.subtrair(valor1, valor2);
            System.out.println(valor1 + " - " + valor2 + " = "+ res);
        }else if((valor1 == valor2) || (valor1 > 10)){
            res = opMat.multiplicar(valor1, valor2);
            System.out.println(valor1 + " * " + valor2 + " = "+ res);
        }else{
            System.out.println("Nenhum criterio atendido...");
        }

        int val = 4;
        switch(val){
            case 1:
            case 2:
                System.out.println("1 ou 2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("outro valor");
                break;
        }

        String resp = "S";
        switch (resp.toUpperCase()) {
            case "S":
                System.out.println("SIM"); 
                break;
        
            case "N":
                System.out.println("NÃO"); 
                break;
            default:
                System.out.println("outro valor");
        }

    }
}

        
    