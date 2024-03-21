import java.util.Scanner;

public class Exercici1Arrays {
    public static void main(String[] args) {

        int[] vector = new int[20]; //Introduir vectors
        int suma = 0; //Declaro variable suma
        int mitjabaix = 0; //Declaro variable mitja per debaix
        int mitjadalt = 0; //Declaro variable mitja per a dalt
        double mitja;//Declaro variable mitja

        for (int i : vector) { //Llegir
            System.out.println("Posa un número negatiu");
            Scanner scanner = new Scanner(System.in);
            int numero = scanner.nextInt();

            if (numero < 0) { // Comoprova número
                suma += i; //Calcula suma
                mitja = (double) suma / vector.length; //Calcula mitja
                {
                    if (i < mitja) { //Calcula mitja per debaix
                        mitjabaix++;
                    } else {
                        mitjadalt++; //Calcula mitja per a dalt
                    }
                }

                System.out.print("La suma es " + suma); //Resultat suma
                System.out.println("La mitja es " + mitja); //Resultat mitja
                System.out.println("Hi ha " + mitjabaix + " números per debaix de la mitja."); //Resultat per debaix de la mitja
                System.out.println("Hi ha " + mitjadalt + " números per a dalt de la mitja."); //Resultat per a dalt de la mitja
                System.out.println(i); // Vector resultant

            } else { // Resposta a numero no negatiu
                System.out.println("Posa un número negatiu");
            }
        }
    }
}










