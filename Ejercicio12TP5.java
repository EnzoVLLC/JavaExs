public class Ejercicio12TP5 {
    public static final int MAXA = 4;
    public static final int MAXB = MAXA - 1;
    public static void main(String[] args) {
        
        int[] A = {3, 6, 31, 9};
        int[] B = {0, 2, 3};

        suma(A, B);
    }
    public static void suma(int[] A, int[] B) {

        int suma = 0;
        int i;

        for (i = 0; i < MAXB; i++) {

            int indice = B[i];

            if (indice >= 0 && indice < MAXA) {

                suma += A[indice];
            
            } else {

                System.out.println("Índice fuera de rango.");

            }
        }
        System.out.println("La sumatoria da como resultado: " + suma);
    }
}
