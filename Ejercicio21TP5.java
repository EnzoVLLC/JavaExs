public class Ejercicio21TP5 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        
        int[] arreglo = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        
        System.out.println("ARREGLO ORIGINAL.");

        int i;

        for (i = 0; i < MAX; i++) {

            System.out.println("arreglo[" + i + "] -> " + arreglo[i]);

        }

        System.out.println("Valor a ingresar:");
        int valor = Utils.leerInt();

        espacio(arreglo, valor);
        corrimiento(arreglo, valor);

        System.out.println("ARREGLO MODIFICADO.");

        int j;

        for (j = 0; j < MAX; j++) {

            System.out.println("arreglo[" + j + "] -> " + arreglo[j]);

        }
    }
    public static void espacio(int[] arreglo, int valor) {

        if (valor > arreglo[0] || valor < arreglo[MAX - 1]) {

            System.out.println("No hay espacio para " + valor + ".");
        }
    }
    public static void corrimiento(int[] arreglo, int valor) {

        int pos;
        for (pos = MAX - 2; pos >= 0; pos--) {
            
            if (valor >= arreglo[pos]) {

                arreglo[pos + 1] = arreglo[pos];
            }
        }
    }
}
