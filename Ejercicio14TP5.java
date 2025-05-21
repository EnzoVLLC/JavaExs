public class Ejercicio14TP5 {
    public static final int MAX = 10;
    public static void main(String[] args) {

        char[] arreglos = {'p', 'y', 'a', 'e', 'p', 'i', 'o', 'f', 'u', 'l'};

        vocales(arreglos);
        consonantes(arreglos);

    }
    public static void vocales(char[] arreglos) {

        System.out.println("VOCALES:");

        int pos;

        for (pos = 0; pos < MAX; pos++) {

            if (arreglos[pos] == 'a' || arreglos[pos] == 'e' || arreglos[pos] == 'i' || arreglos[pos] == 'o' || arreglos[pos] == 'u') {

                System.out.println("arreglo[" + pos + "] -> " + arreglos[pos]);
            
            }
        }
    }
    public static void consonantes(char[] arreglos) {

        System.out.println("CONSONANTES:");

        int j;

        for (j = 0; j < MAX; j++) {

            if (arreglos[j] != 'a' && arreglos[j] != 'e' && arreglos[j] != 'i' && arreglos[j] != 'o' && arreglos[j] != 'u') {
            
                System.out.println("arreglo[" + j + "] -> " + arreglos[j]);

            }
        }
    }
}
