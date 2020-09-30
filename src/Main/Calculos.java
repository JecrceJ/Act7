package Main;

public class Calculos extends Main {
    public int[] calcularPrimo(int v1) {
        int[] primo = new int[v1];
        System.out.print("Numeros primos: ");
        for (int x = 2; x <= v1; x++) {
            if (is(x)) {
                System.out.print(x + " ");
            }
        }
    return primo;
    }
    public boolean is(int numero) {
        if (numero==0 || numero==1 || numero==4) {
            return false; }
        for (int x=2; x<numero/2; x++) {
            if (numero%x==0)
                return false; }
        return true; }

    public int[] fibonacci(int v1){
        int o,n1,n2;
        o=0;
        n1=1;
        int[] fib= new int[v1];
        for (int i=0; i<v1; i++) {
            n2=o;
            o=n1+o;
            n1=n2;
            fib[i]=n1;
        }
        return fib;
    }
    public void mostrarResultados(int[] fib, int v1){
        System.out.println(" ");
        System.out.print("Sucesion de Fibonacci: ");
        for (int i=0; i<v1; i++){
            System.out.print(fib[i]+" ");
        }
    }
}