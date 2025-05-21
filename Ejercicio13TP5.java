public class Ejercicio13TP5 {
    public static final int MAX = 10;
    public static void main(String[] args) {

        char[] arreglos = {'a', 'l', 'm', 'h', 'r', 'o', 'u', 't', 'g', 'j'};

        vocales(arreglos);
        consonantes(arreglos);

    }
    public static void vocales(char[] arreglos) {

       System.out.println("VOCALES:");

        int i;
        int pos = 0;

        for (i = 0; i < MAX; i++) {

            if (arreglos[i] == 'a' || arreglos[i] == 'e' || arreglos[i] == 'i' || arreglos[i] == 'o' || arreglos[i] == 'u') {
                
                System.out.println("arreglo [" + pos + "] -> " + arreglos[i]);

                pos++;

            }
        }
    }
    public static void consonantes(char[] arreglos) {

        System.out.println("CONSONANTES:");

        int i;
        int pos = 0;

        for (i = 0; i < MAX; i++) {

                if (arreglos[i] != 'a' && arreglos[i] != 'e' && arreglos[i] != 'i' && arreglos[i] != 'o' && arreglos[i] != 'u') {

                    

                    System.out.println("arreglo [" + pos + "] -> " + arreglos[i]);

                    pos++;

                }
            }
    }
}