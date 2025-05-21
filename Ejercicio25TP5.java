public class Ejercicio25TP5 {
    public static final int MAX = 20;
    public static void main(String[] args) {
        
        int[] arreglo = {0, 342, 243, 65, 87, 0, 12, 0, 53, 1212, 83, 0, 2, 0, 555, 88, 13, 0, 0, 0};

        imprimirsecuencia(arreglo);
    }
    public static void imprimirsecuencia(int[] arreglo) {

        int inicio = 0, fin = -1, secu = 0;
        
        int anteinicio = 0, antefin = 0, secu2 = 0;

        while (inicio < MAX) {

            inicio = obtenerinicio(arreglo, fin + 1);

            if (inicio < MAX) {

                fin = obtenerfin(arreglo, inicio);

                secu = obtenersecuenia(arreglo, inicio, fin);

                if (secu > secu2) {
                    
                    anteinicio = inicio;

                    antefin = fin;

                    secu2 = secu;
                }
            }
        }
        System.out.println("ÚLTIMA SECUENCIA." + '\n' + "Inicio: " + anteinicio + '\n' + "Fin: " + antefin);
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
    public static int obtenersecuenia(int[] arreglo, int inicio, int fin) {

        int secu = 1;

        while (inicio <= fin) {

            secu *= inicio;

            inicio++;

        }
        return secu;
    }
} 