public class Ejercicio32TP5 {
    public static int MAX = 20;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 0, 4, 2, 9, 0, 1, 6, 7, 4, 0, 0, 0, 3, 7, 2, 6, 0, 0, 0};

        System.out.println("Arreglo original.");
        imprimirarreglo(arreglo);

        System.out.println('\n' + "Ingrese la posición que quiera saber el inicio y fin:");
        int posicion = Utils.leerInt();

        verificarpos(posicion);

        int inicio = 0, fin = -1;
        int iniciopos = 0, finpos = 0;
        boolean encontrado = false;

        while (inicio < MAX) {

            inicio = obtenerinicio(arreglo, fin + 1);

            if (inicio< MAX) {

                fin = obtenerfin(arreglo, inicio);

                encontrado = obtenerposicion(arreglo, inicio, fin, posicion);

                if (encontrado) {

                    iniciopos = inicio;

                    finpos = fin;

                }
            }
        }
        System.out.println("Secuencia encontrada en " + posicion + '\n' + "Inicio: " + iniciopos + '\n' + "Fin: " + finpos);
    }
    public static int verificarpos(int posicion) {

        while (posicion == 0) {

            System.out.println("Posición invalida. Ingrese otra posición:");
            posicion = Utils.leerInt();

        }
        return posicion;
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
    public static boolean obtenerposicion(int[] arreglo, int inicio, int fin, int posicion) {

        boolean encontrado = false;

        //while (inicio <= fin) {

            int i;

            for (i = 0; i < MAX; i++) {

                if (i == posicion) {

                    encontrado = true;

                }
           // }
        }
        return encontrado;
    }
    public static void imprimirarreglo(int[] arreglo) {

        int i;

        for (i = 0; i < MAX; i++) {

            System.out.print(arreglo[i] + "|");
        }
    }
}