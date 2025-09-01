package programa1_busqueda2d.java;
public class Programa1_Busqueda2DJava {
    public static void main(String[] args) {
int[][] matriz = {
                {5, 8, 3},
                {2, 1, 4},
                {7, 9, 6}
        };
        //Valor que vamos a buscar
        int valorBuscado = 6;

        //Rastrear la posición
        int filaEncontrada = -1;
        int columnaEncontrada = -1;

        outer: //romper el ciclo externo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
                    filaEncontrada = i;
                    columnaEncontrada = j;
                    break outer; //detiene la búsqueda
                }
            }
        }

       // Muestra los resultados
        if (filaEncontrada != -1) {
            System.out.println("El valor " + valorBuscado +
                    " se encontró en la posición [fila: " +
                    filaEncontrada + ", columna: " + columnaEncontrada + "]");
        } else {
            System.out.println("El valor " + valorBuscado +
                    " no se encontró en la matriz.");
        }
    }
}
