public class Ejercicio23TP5 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 12, 43, 65, 0, 47, 99, 4, 66, 0, 13, 87, 0, 1, 11, 111, 0, 2, 22, 0};

        int[] resultado = imprimirsecuencia(arreglo);

        System.out.println("Inicio: " + resultado[0] + ". Fin: " + resultado[1] + ".");
    }
    public static int[] imprimirsecuencia(int[] arreglo) {

        int ini = -1;
        int fin = -1;
        int i = 0;

        while (i < MAX) {

            if (arreglo[i] != 0) {

                if (ini == -1) {

                    ini = i;

                }

                fin = i;

            } else if (ini != -1) {

                break;

            }

            i++;

        }

        return new int[] {ini, fin};
    }
}
