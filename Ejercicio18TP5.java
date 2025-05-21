public class Ejercicio18TP5 {
    public static final int MAX = 10;
    public static boolean busquedadenumero(int[] arreglo, int numero, boolean vof) {

        int pos = 0;

        while (pos < MAX) {

            if (arreglo[pos] == numero) {

                return true;

            } else {

                vof = false;

            }
            
            pos++;
        }
        return false;
    }
    public static int corrimento(int[] arreglo, int numero) {

        int i;
        int j;

        for (i = 0; i < MAX; i++) {

            if (arreglo[i] == numero) {

                for (j = arreglo[i]; j < MAX; j++) {

                    arreglo[j - 1] = arreglo[j];

                }
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        
        int[] arreglo = {0, 1, 2, 7, 4, 5, 6, 7, 8, 9};

        System.out.println("Ingrese el número que desee:");
        int numero = Utils.leerInt();
        
        boolean vof = false;

        if (busquedadenumero(arreglo, numero, vof)) {

            corrimento(arreglo, numero);
            int pos;

            for (pos = 0; pos < MAX; pos++) {

                System.out.println("arreglo[" + pos + "] -> " + arreglo[pos]);

            }
        } else {

            System.out.println("No existe.");

        }
        
    }
}
