package Metode;
import java.util.Scanner;

public class Metode_Longitud_Cadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paraula = Pregunta(sc);
        int resultat = Calcular(paraula);
        Resultat(resultat);
    }

    private static void Resultat(int resultat) {
        System.out.println("La longitud de la cadena és: " + resultat);
    }

    private static int Calcular(String paraula) {
        return paraula.length();
    }

    private static String Pregunta(Scanner sc) {
        System.out.println("Posa una paraula per calcular la seva longitud");
        return sc.next();
    }
}
