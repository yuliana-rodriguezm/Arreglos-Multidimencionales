import java.util.Arrays;

public class Programa2_Ordenacion2D {
    public static void main(String[] args) {

        // Declarar matriz 3x3
        int[][] matriz = {
            {4, 7, 2},
            {9, 3, 6},
            {8, 1, 5}
        };

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        // ordenar
        int filaAOrdenar = 1;
        Arrays.sort(matriz[filaAOrdenar]);

        System.out.println("\nMatriz con la fila " + filaAOrdenar + " ordenada:");
        mostrarMatriz(matriz);
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
