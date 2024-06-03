import java.util.Scanner;

public class ConversorMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creació de scanner
        double euro; //Valor de euro = input
        double euroLiure = 0.85; //Conversió euro a lliure esterlina
        double euroDolar = 1.17; //Conversió euro a dolar americà

        System.out.println("""
                Benvingut al conversor de moneda
                Quina moneda vols convertir?
                Opción 1: Convertir euros a dollars.
                Opción 2: Convertir euros a lliures esterlines.
                Opción 3: Sortir.
                Escull una opció:""");

        while (!scanner.hasNextInt()) { //Bucle per si l'usuari introdueix un altre caràcter
            System.out.println("Escull una opció vàlida:");
            scanner.next();
        }

        int opcio = scanner.nextInt(); //Valor de opció
        switch (opcio) {
            case 1: //Euro a dolars americans
                System.out.println("Has triat convertir euros a dòlars americans");
                System.out.println("Introdueix la quantitat en euros: ");
                euro = scanner.nextDouble();
                System.out.println("El canvi és: " + euro * euroDolar + " dòlars");
                break;
            case 2: //Euro a lliures esterlines
                System.out.println("Has triat convertir euros a lliures esterlines");
                System.out.println("Introdueix la quantitat en euros: ");
                euro = scanner.nextDouble();
                System.out.println("El canvi és: " + euro * euroLiure + " lliures esterlines");
                break;
            case 3: //Sortir
                System.out.println("Gràcies per utilitzar el conversor de moneda");
                scanner.close(); //Tanca scanner
                System.exit(0); //Finalitza el programa
                break;
        } scanner.close();
        System.exit(0);
    }
}
