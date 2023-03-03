package ejercicio3;

public class Cuadricula {

    private int FILAS = 10;
    private int COLUMNAS = 10;
    private char[][] cuadricula = new char[FILAS][COLUMNAS];



    public Cuadricula() {
        cuadricula = new char[FILAS][COLUMNAS];
        inicializarCuadricula();
    }

    private void inicializarCuadricula() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                cuadricula[i][j] = '%';
            }
        }
    }

    public void depositarBarco(int fila, int columna){
        cuadricula[fila][columna] = 'B';

    }

    public void disparar(int fila, int columna){
        boolean disparar = false;
        if(cuadricula[fila][columna] == 'B'){
            cuadricula[fila][columna] = 'X';
            disparar = true;
        }
        else{
            cuadricula[fila][columna] = 'O';
            disparar = false;
        }
    }


    public void visualizacion() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10 ");
        for (int i = 0; i < FILAS; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < COLUMNAS; j++) {
                if (cuadricula[i][j] == 'B') {
                    System.out.print("X ");
                } else {
                    System.out.print(cuadricula[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

}


