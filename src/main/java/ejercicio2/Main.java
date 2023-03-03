package ejercicio2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void switchOptions(ArrayList clientes) throws InputMismatchException {
        boolean repeat=false;
        do {
            try { //MENU PRINCIPAL
                repeat=false;
                System.out.println("¿Qué quiere hacer?:\n"
                        + "1º Mostrar clientes.\n"
                        + "2º Crear clientes.\n"
                        + "3º Salir \n");

                int choice = scanner.nextInt();
                if (choice <1||choice>3)
                    throw new OutofRangeException("Error. Tienes que introducir un número entre 1 y 3"); //Excepcion introducida para comprobar que los valores esten entre 0 y 3
                Menu(choice, clientes);
            } catch (InputMismatchException exc3) {
                scanner.nextLine();
                System.out.println("Error. Tienes que introducir un número."); //Excepcion introducida para comprobar que el valor introducido sea un numero, si no se volvera a pedir un valor
                repeat=true;
            } catch (OutofRangeException e) {
                throw new RuntimeException(e);
            }
        } while(repeat);

    }

    public static void Menu(int option, ArrayList clientes){
        switch(option){
            case 1:
                mostrarClientes(clientes);
                switchOptions(clientes);
                break;
            case 2:
                addCliente(clientes);
                switchOptions(clientes);
                break;
            case 3:
                System.out.println("¡Hasta pronto!");
                break;

        }
    }

    public static void addCliente(ArrayList clientes){

    try{
        String intro = scanner.nextLine();
        System.out.println("Introduce el nombre del cliente: ");
        String nombre = scanner.nextLine();

        Cliente cliente1 = new Cliente();
        cliente1.setNombre(nombre);

        clientes.add(cliente1);
        System.out.println("Cliente nº" + clientes.size() + " añadido "+ cliente1.getNombre() );

    }
    catch (Exception e){ System.out.println("Error al añadir cliente"); }
    }

    public static void mostrarClientes(ArrayList clientes){

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("\n " + clientes.get(i).toString());
        }
    }


    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        switchOptions(clientes);

    }


}
