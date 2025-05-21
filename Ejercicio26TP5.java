public class Ejercicio26TP5 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 12, 32, 0, 765, 66, 0, 453, 87, 43, 3, 3, 3, 0, 0, 0, 643, 32, 0, 0};

        imprimirarreglomayor(arreglo);
    }
    public static void imprimirarreglomayor(int[] arreglo) {

        int inicio = 0, fin = -1, suma = 0;
        int maximoinicio = 0, maximofin = 0, maxi = 0;

        while (inicio < MAX) {

            inicio = obtenerinicio(arreglo, fin + 1);

            if (inicio < MAX) {

                fin = obtenerfin(arreglo, inicio);

                suma = obtenersuma(arreglo, inicio, fin);

                if (suma > maxi) {

                    maximoinicio = inicio;

                    maximofin = fin;

                    maxi = suma;
                }
            }
        }
        System.out.println("Secuencia de mayor tamaño." + '\n' + "Inicio: " + maximoinicio + '\n' + "Fin: " + maximofin + '\n' + "Tamaño: " + maxi);
    }
    public static int obtenerinicio(int[] arreglo, int inicio) {

        while (inicio < MAX && arreglo[inicio] == 0) {

            inicio++;

        }
        return inicio;
    }
    public static int obtenerfin(int[] arreglo, int inicio) {

        while (inicio < MAX && arreglo[inicio] != 0) {

            inicio++;

        }
        return inicio - 1;
    }
    public static int obtenersuma(int[] arreglo, int inicio, int fin) {
        
        int suma = 0;

        while (inicio <= fin) {

            suma += arreglo[inicio];

            inicio++;
        }
        return suma;
    }
}