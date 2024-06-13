package cl.PruebaPraxis;

public class Calculadora {
    public static void main(String[] args) {

        System.out.println(sumar(2,4));
        System.out.println(restar(2,4));
        System.out.println(multiplicar(2,4));
        System.out.println(dividir(2,4));


    }

    public static int sumar(int num1, int num2){

        return num1+ num2;
    }

    public static int restar(int num1, int num2){
        return num1-num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1*num2;
    }
    public static int dividir(int num1, int num2){
        return num1/num2;
    }

}
