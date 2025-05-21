public class Ejercicio22TP5 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        
        int[] arreglo = {10, 64, 33, 6, 85, 345, 54, 9875, 7, 3};

        System.out.println("ARREGLO ORIGINAL.");

        int i;

        for (i = 0; i < MAX; i++) {

            System.out.println("arreglo[" + i + "] -> " + arreglo[i]);

        }

        chaupares(arreglo);

        System.out.println("ARREGLO SIN PARES.");

        int j;

        for (j = 0; j < MAX; j++) {

            System.out.println("arreglo[" + j + "] -> " + arreglo[j]);

        }
    }
    public static void chaupares(int[] arreglo) {

        int pos = 0;

        while (pos < MAX) {

            if (arreglo[pos] % 2 == 0) {

                int i;

                for (i = pos; i < MAX - 1; i++) {

                    arreglo[i] = arreglo[i + 1];

                }
                
                arreglo[MAX - 1] = arreglo[MAX - 1];

            } else {

                pos++;

            }
        }
    }
}
