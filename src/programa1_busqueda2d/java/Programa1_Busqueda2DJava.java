package programa1_busqueda2d.java;
public class Programa1_Busqueda2DJava {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 8, 3},
                {2, 9, 4},
                {7, 1, 6}
        };

        int valorBuscado = 9;
        int[] posicion = buscarValor(matriz, valorBuscado);

        if (posicion[0] != -1) {
            System.out.println("El valor " + valorBuscado +
                    " se encontro en la posicion [fila: " + posicion[0] +
                    ", columna: " + posicion[1] + "]");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encontró en la matriz.");
        }
    }

    // Método que busca un valor en una matriz 2D
    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                if (matriz[fila][col] == valor) {
                    return new int[]{fila, col}; // devuelve la posición
                }
            }
        }
        return new int[]{-1, -1}; // no encontrado
    }
}

   
    

