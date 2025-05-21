public class Ejercicio19TP5 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 5, 2, 3, 4, 5, 6, 5, 8, 9};

        System.out.println("ARREGLO ORIGINAL.");

        int pos;

        for (pos = 0; pos < MAX; pos++) {

            System.out.println("arreglo[" + pos + "] -> " + arreglo[pos]);

        }

        /*System.out.println("Ingrese el valor que desee eliminar:");
        int valor = Utils.leerInt();*/

        corrimiento(arreglo);

        System.out.println("ARREGLO MODIFICADO.");

        int i;

        for (i = 0; i < MAX; i++) {

            System.out.println("arreglo[" + i + "] -> " + arreglo[i]);

        }
    }
    public static void corrimiento(int[] arreglo) {

        int i = 0;

        while (i < MAX) {

            if (arreglo[i] % 2 == 0) {

                int j;
                
                for (j = i; j < MAX - 1; j++) {

                    arreglo[j] = arreglo[j + 1];

                }

                arreglo[MAX - 1] = arreglo[MAX - 1];

            } else {

                i++;

            }
        }
    }
    
}
