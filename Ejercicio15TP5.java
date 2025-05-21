public class Ejercicio15TP5 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Elija la posición del corrimiento:");
        int corrimiento = Utils.leerInt();

        corrimientoderecha(arreglo, corrimiento);
        imprimirarreglo(arreglo);
    }
    public static void corrimientoderecha(int[] arreglo, int corrimiento) {

        int pos;

        for (pos = MAX - 2; pos >= corrimiento; pos--) {

            arreglo[pos + 1] = arreglo[pos];

        }
    }
    public static void imprimirarreglo(int[] arreglo) {

        int pos;

        for (pos = 0; pos < MAX; pos++) {

            System.out.println("arreglo[" + pos + "] -> " + arreglo[pos]);
        }
    }
}
