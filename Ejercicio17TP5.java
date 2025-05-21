public class Ejercicio17TP5 {
    public static final int MAX = 10;
    public static void corrimientousuario(int[] arreglo, int numero) {

        int pos;

        for (pos = MAX - 2; pos >= 0; pos--) {

            arreglo[pos + 1] = arreglo[pos];

        }
        arreglo[0] = numero;
    }
    public static void imprimir(int[] arreglo) {

        int pos;
        
        for (pos = 0; pos < MAX; pos++) {
            
            System.out.println("arreglo[" + pos + "] -> " + arreglo[pos]);

        }
    }
    public static void main(String[] args) {
        
        int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Ingrese el valor que desee:");
        int numero = Utils.leerInt();

        corrimientousuario(arreglo, numero);
        imprimir(arreglo);
    }
}
