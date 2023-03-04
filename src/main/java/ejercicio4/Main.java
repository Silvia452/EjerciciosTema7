package ejercicio4;

import java.util.Scanner;

public class Main {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        Cuadricula cuadriculaJugador = new Cuadricula();
        Cuadricula cuadriculaMaquina = new Cuadricula();
        System.out.println("Bienvenido al juego de la batalla naval");
        System.out.println("Introduzca el barco que desea colocar: ");
        System.out.println("Introduce la columna (entre 1 y 10):");
        int colJugador = sn.nextInt();
        System.out.println("Introduce la fila (entre 1 y 10):");
        int filaJugador = sn.nextInt();
        cuadriculaJugador.depositarBarco(filaJugador, colJugador);
        System.out.println("¡Estupendo!, se ha añadido correctamente el barco");
        System.out.println("Ahora espere a que la máquina coloque su barco");
        int colMaquina = (int) (Math.random() * 10);
        int filaMaquina = (int) (Math.random() * 10);
        cuadriculaMaquina.depositarBarco(filaMaquina, colMaquina);
        System.out.println("¡La máquina ha colocado su barco!");
        System.out.println("Ahora empieza el juego");
        try{
            do{
                System.out.println("Introduzca la columna donde desea disparar:");
                int colDisparoJugador = sn.nextInt();
                System.out.println("Introduzca la fila donde desea disparar:");
                int filaDisparoJugador = sn.nextInt();
                boolean barcoHundido = cuadriculaMaquina.disparar(filaDisparoJugador, colDisparoJugador);
                cuadriculaMaquina.visualizacion();
                if(barcoHundido){
                    System.out.println("¡Has hundido el barco!");
                    break;
                }
                else{
                    System.out.println("¡Has fallado!");
                }
                System.out.println("Ahora le toca a la máquina");
                int colDisparoMaquina = (int) (Math.random() * 10);
                int filaDisparoMaquina = (int) (Math.random() * 10);
                boolean barcoHundidoMaquina = cuadriculaJugador.disparar(filaDisparoMaquina, colDisparoMaquina);
                cuadriculaJugador.visualizacion();
                if(barcoHundidoMaquina){
                    System.out.println("¡La máquina ha hundido tu barco!");
                    break;
                }
                else{
                    System.out.println("¡La máquina ha fallado!");
                }
            }while(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("¡Gracias por jugar!");


    }
}
