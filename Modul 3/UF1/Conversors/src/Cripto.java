import java.util.Scanner;

public class Cripto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creació de scanner
        double euro = scanner.nextDouble(); //Valor de euro = input
        double bitcoin = 32296.53; //Conversió euro a bitcoins
        double ethereum = 1693.80; //Conversió euro a ethereums

        System.out.print("""
            Quants euros vols canviar (nomès permet de 1€ fins a 1000€)?");
            Què vols canviar?
            Opció 1: Bitcoins (BTC)
            Opció 2: Ethereum (ETH)
            Opció 3: Sortir""");

        while (!scanner.hasNextInt()) { //Bucle per si l'usuari introdueix un altre caràcter
            System.out.println("Escull una opció:");
            scanner.next();
        }

        if (euro >= 1 && euro <= 1000) { //Accepta 1€ que sigui igual o major. Accepta 1000€ igual o menys

            int option = scanner.nextInt(); //llegeix la opció escollida
            switch (option) {
                case 1: //Bitcoin
                    System.out.println("Has ingresat " + euro + "€");
                    System.out.println("el canvi es: " + euro / bitcoin + " BTC");
                    break;
                case 2: //Ethereum
                    System.out.println("Has ingresat " + euro + "€");
                    System.out.println("el canvi es: " + euro / ethereum + " ETH");
                    break;
                case 3: //Sortir
                    System.out.println("Has triat sortir");
                    break;
                default:
                    System.out.println("No es vàlid");
                    break;
            }

        } else { //Si ha posat un valor inferior a 1€ o major que 1000€
            System.out.println("L'import a de ser entre 1-1000€");
            return;
        }
        scanner.close();
        System.exit(0);
    }
}
