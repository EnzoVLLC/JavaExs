public class Ejercicio28TP5 {
    public static final int MAX = 20;
    public static final int MAXP = 20;
    public static final int SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arr = { 0, 106, 100, 69, 0, 50, 45, 0, 36, 0, 32, 21, 0, 12, 6, 0, 670, 32, 21, 0 };
        int[] patron = { 0, 32, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        int ini = 0;
        int fin = -1;
        int iniP = 0;
        int finP = -1;

        System.out.println("Arreglo original:");
        mostrarArr(arr);

        // buscar patron
        if (iniP < MAXP) {
            iniP = buscarIniP(patron, finP + 1);// iniP=1
            if (iniP < MAXP) {
                 finP = buscarFinP(patron, iniP);// finP=2
            }
        }

        while (ini < MAX) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arr, ini);
                buscarSecuencia(arr, patron, ini, fin, iniP, finP);
            }
        }

        System.out.println("Resultado final:");
        mostrarArr(arr);
    }

    public static void buscarSecuencia(int[] arr, int[] patron, int ini, int fin, int iniP, int finP) {
        int tamanioP = finP - iniP + 1;
        while (ini <= fin && fin - ini + 1 >= tamanioP) {
            if (patronCoincide(arr, patron, ini, iniP, tamanioP)) {
                eliminarSecuencia(arr, ini, fin);
                fin -= tamanioP;
            } else {
                ini++;
            }
        }
    }

    public static boolean patronCoincide(int[] arr, int[] patron, int ini, int iniP, int tamanioP) {
        for (int i = 0; i < tamanioP; i++) {
             if (arr[ini + i] != patron[iniP + i]) {
                return false;
            }
        }
        return true;
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        int cantidad = fin - ini + 1;
        for (int i = 0; i < cantidad; i++) {
            corrimientoIzquierda(arr, ini);
        }
    }

    public static void corrimientoIzquierda(int[] arr, int pos) {
        for (int i = pos; i < MAX - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[MAX - 1] = SEPARADOR; // limpiar el último elemento
    }

    public static int buscarIni(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }
     public static int buscarFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static int buscarIniP(int[] patron, int pos) {
        while (pos < MAXP && patron[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFinP(int[] patron, int pos) {
        while (pos < MAXP && patron[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void mostrarArr(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i]);
        }
        System.out.println("|");
    }
}
