package Main;

public class Main {                                                     //Creacion de la clase principal
    public static void main(String[] args) {                            //Metodo principal
        int v1 = 15;
        Calculos cc = new Calculos();//Iniciacion de la clase calculos como cc
        int[] primo=cc.calcularPrimo(v1);
        int[] fib=cc.fibonacci(v1);
        cc.mostrarResultados(fib,v1);
    }
}