package String;
import java.util.Scanner;

public class ContainsEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto y pulsa enter:"); //Demana a l'usuari que posi un text
        String text = sc.nextLine(); //Llegeix el text que posa l'usuari

        if (!text.isEmpty()){ //Si no hi ha res (equivalent text.lenght>0)
            System.exit(0); //El progama es tanca
        }

        System.out.println("Posa una paraula:"); //Demana a l'usuari que posi un text
        String paraula = sc.nextLine(); //Llegeix la paraula que posa l'usuari

        int position = text.indexOf(paraula); //Guarda la posició de la paraula

        // Mostra si s'ha trobat la paraula o no
        if (position != -1) { //Comprova si la posició té un valor diferent de -1 (la primera paraula es 0)
            System.out.println("La paraula " + paraula + " s'ha trobat en la posició " + position);
        } else {
            System.out.println("La paraula " + paraula + " no s'ha trobat");
        }
    }
}
