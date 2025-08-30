import java.util.Arrays;

public class Programa2_Ordenacion2D {
    public static void main(String[] args) {
        int[][] matriz = {
                {9, 4, 7},
                {3, 8, 1},
                {6, 2, 5}
        };

        int filaAOrdenar = 1;

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        ordenarFila(matriz, filaAOrdenar);

        System.out.println("\nMatriz con la fila " + filaAOrdenar + " ordenada:");
        mostrarMatriz(matriz);
    }

    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]); 
        } else {
            System.out.println("Fila no válida.");
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

