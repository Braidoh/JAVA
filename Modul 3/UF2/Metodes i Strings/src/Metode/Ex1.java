package Metode;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa un numero:"); //Demana a l'usuari que posi un numero
        int numero = sc.nextInt(); //Llegeix el numero que posa l'usuari

        if (numero % 2 == 0) { // El numero es divideix entre 2 i si el seu resultat es 0 vol dir que es par
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }
        sc.close();
    }
}
