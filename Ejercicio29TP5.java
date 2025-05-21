public class Ejercicio29TP5 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 234, 0, 4, 3, 2, 1, 0, 9, 8, 0, 0, 32, 33, 0, 123, 654, 0, 9, 0};
        
        System.out.println("Arreglo original.");
        imprimirarreglo(arreglo);

        int inicio = 0, fin = -1;

        while (inicio < MAX) {

            inicio = obtenerinicio(arreglo, fin + 1);

            if (inicio < MAX) {

                fin = obtenerfin(arreglo, inicio);
                buscardescendente(arreglo, inicio, fin);

            }
        }

        System.out.println("Arreglo modificado.");
        imprimirarreglo(arreglo);
    }
    public static int obtenerinicio(int[] arreglo, int inicio) {

        while (inicio < MAX && arreglo[inicio] == 0) {

            inicio++;

        }
        return inicio;
    }
    public static int obtenerfin(int[] arreglo, int inicio) {

        while (inicio < MAX && arreglo [inicio] != 0) {

            inicio++;

        }
        return inicio - 1;
    }
    
    public static void buscardescendente(int[] arreglo, int inicio, int fin) {

        int tamanio = fin - inicio + 1;

        while (inicio <= fin && fin - inicio + 1 >= tamanio) {

            if (descendente(arreglo, inicio, fin)) {

                eliminardescendente(arreglo, inicio, fin);

                fin -= tamanio;

            } else {

                inicio++;

            }
        }
    }
    public static boolean descendente(int[] arreglo, int inicio, int fin) {

        int i;

        for (i = arreglo[inicio]; i < MAX; i++) {

            if (arreglo[inicio] < arreglo[fin]) {

                return false;
            
            }
        }
        return true;
    }
    public static void eliminardescendente(int[] arreglo, int inicio, int fin) {

         int cantidad = fin - inicio + 1;

        for (int i = 0; i < cantidad; i++) {

            corrimientoIzquierda(arreglo, inicio);

        }
    }
    public static void corrimientoIzquierda(int[] arreglo, int inicio) {

        for (int i = inicio; i < MAX - 1; i++) {

            arreglo[i] = arreglo[i + 1];
        }
        arreglo[MAX - 1] = arreglo[MAX - 1];
    }
    public static void imprimirarreglo(int[] arreglo) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arreglo[i]);
        }
        System.out.println("|");
    }
}
