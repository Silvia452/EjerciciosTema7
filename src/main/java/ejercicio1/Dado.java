package ejercicio1;

//EJERCICIO 1
//
public class Dado {
    private int ultimaCara;
    private int caras;

    public Dado() {
    }

    public Dado(int caras) {
        this.caras = caras;
    }

    public int getUltimaCara() {
        return ultimaCara;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int tirarDado(){

        int numero = (int) (Math.random() * caras + 1); //genera un numero aleatorio entre 1 y el numero de caras del dado
        return numero;

    }

    public static void main(String[] args) {
        Dado dado6 = new Dado(6);
        Dado dado10 = new Dado(10);
        Dado dado12 = new Dado(12);

        int sumaCaras = 0;
        int cont = 0;

        do {
            System.out.println("\nTirada nº:  " + cont);
            System.out.println("Tirada 1: " + dado6.tirarDado());
            System.out.println("Tirada 2: " + dado10.tirarDado());
            System.out.println("Tirada 3: " + dado12.tirarDado());
            sumaCaras = dado6.tirarDado() + dado10.tirarDado() + dado12.tirarDado();
            cont++;

        }while (sumaCaras < 20);
        System.out.println("Suma: " + sumaCaras);


    }


}
