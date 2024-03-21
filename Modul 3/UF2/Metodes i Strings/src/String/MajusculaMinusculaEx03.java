import java.util.Scanner;

public class MajusculaMinusculaEx03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Posa un text:"); //Demana a l'usuari que posi un text
        String text = scanner.nextLine(); //Llegeix el text que posa l'usuari

        String majuscula = text.toUpperCase(); // Upper: Converteix el text a majúscules
        String minuscula = text.toLowerCase(); // Lower: Converteix el text a minúscules

        // Posa el text en majúscules i en minúscules
        System.out.println("En majúscules: " + majuscula);
        System.out.println("En minúscules: " + minuscula);
    }
}

