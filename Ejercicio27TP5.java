public class Ejercicio27TP5 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 2, 2, 1, 0, 5, 0, 0, 44, 32, 90, 0, 0, 0, 55, 3, 0, 3, 2, 0};

        imprimirareglo(arreglo);
        
    }
    public static void imprimirareglo(int[] arreglo) {

        System.out.println("ARREGLO ORIGINAL.");

        int i;

        for (i = 0; i < MAX; i++) {

            System.out.print(arreglo[i] + "|");

        }
        
        System.out.println('\n' + "Ingrese el tamaño de secuencia que desee eiminar:");
        int numero = Utils.leerInt();

        obternernumero(numero);

        int inicio = 0, fin = -1, suma = 0;

        while (inicio < MAX) {

            inicio = obtenerinicio(arreglo, fin + 1);

            if (inicio < MAX) {

                fin = obtenerfin(arreglo, inicio);

                suma = obtenersuma(arreglo, inicio, fin, numero);

                if (suma >= numero) {

                    int j;

                    for (j = arreglo[inicio]; j < MAX; j++) {

                        arreglo[j - 1] = arreglo[j];

                    }
                }
            }
        }
            System.out.println("ARREGLO MODIFICADO.");

            int pos;

            for (pos = 0; pos < MAX; pos++) {

                System.out.print(arreglo[pos] + "|");
            }
    }
    public static int obternernumero(int numero) {

        while (numero == 0) {

            System.out.println("0 no es valido. Ingrese otro tamaño de secuencia que desee eliminar.");
            numero = Utils.leerInt();

        }
        return numero;
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
    public static int obtenersuma(int[] arreglo, int inicio, int fin, int numero) {

        int suma = 0;

        while (inicio <= fin) {

            suma += arreglo[inicio];

            inicio++;
        
        }
        return suma;
    }
}
