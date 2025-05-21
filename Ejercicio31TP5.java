public class Ejercicio31TP5 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 15, 16, -17, -18, 0};

        System.out.println("Arreglo original.");
        imprimirarreglo(arreglo);

        int fin = MAX - 1;

        while (fin >= 0 && arreglo[fin] == 0) {

            fin--;

        }

        if (fin < 0) {

            return;

        }

        int inicio = fin;

        while (inicio >= 0 && arreglo[inicio] != 0) {

            inicio--;

        }

        inicio++;

        int maxinicio = inicio, maxfin = fin, max = 0;

            while (maxinicio < maxfin) {

                    
                max = arreglo[maxinicio];

                    
                arreglo[maxinicio] = arreglo[maxfin];

                    
                arreglo[maxfin] = max;

                    
                maxinicio++;
                    
                maxfin--;
            
            }
        System.out.println('\n' + "Arreglo modificado.");
        imprimirarreglo(arreglo);
    }
    public static void imprimirarreglo(int[] arreglo) {

        int i;

        for (i = 0; i < MAX; i++) {

            System.out.print(arreglo[i] + "|");

        }
    }
}
