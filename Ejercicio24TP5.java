public class Ejercicio24TP5 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 0, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        imprimirsumas(arreglo);
    }
    public static void imprimirsumas(int[] arreglo) {

        int inicio = 0;
        int fin = -1;
        int suma = 0;

        while (inicio < MAX) {

            inicio = iniciosecuencia(arreglo, fin + 1);

            if (inicio < MAX) {

                fin = finsecuencia(arreglo, inicio);
                
                suma = obtenersuma(arreglo, inicio, fin);

                if (suma > 0) {

                    System.out.println("La suma de la secuencia de " + inicio + " a " + fin + " es: " + suma);

                } else if (suma < 0) {

                    System.out.println("La suma de la secuencia de " + inicio + " a " + fin + " no se puede mostrar porque no es mayor a 0.");

                }
            }
        }
    }
    public static int iniciosecuencia(int[] arreglo, int inicio) {

        while (inicio < MAX && arreglo[inicio] == 0) {

            inicio++;

        }
        return inicio;
    }
    public static int finsecuencia(int[] arreglo, int inicio) {

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
