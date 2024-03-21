package Metode;

import java.util.Scanner;

public class MetodeEx3Primers_Ultims {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String paraula = sc.next();
        String resultat = primersIultims(paraula); // Obtenim els primers 2 i els darrers 2 caràcters de la cadena
        System.out.println(resultat);
    }
    public static String primersIultims(String cadena) {
        if (cadena.length() < 2) { // Comprovem si la longitud de la cadena és inferior a 2
            return "";
        }
        String primers = cadena.substring(0, 2); // Agafa els primers 2 caràcters de la cadena
        String ultims = cadena.substring(cadena.length() - 2); // Agafa els 2 últims caràcters de la cadena
        return primers + ultims;
    }
}
