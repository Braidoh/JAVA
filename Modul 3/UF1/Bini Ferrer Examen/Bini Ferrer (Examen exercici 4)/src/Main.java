//Bini Ferrer Anechina

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Declarar variables
        double euros;
        double bitcoin = 32296.53;
        double ethereum = 1693.80;

        Scanner scanner=new Scanner(System.in); //Defineix valor scanner
        System.out.print("Quants euros vols canviar (nomès permet de 1€ fins a 1000€)?");
        euros = scanner.nextDouble(); //Activa la lectura de euros

        if (euros >= 1 && euros <= 1000) { //Accepta 1€ que sigui igual o major. Accepta 1000€ igual o menor
            System.out.print("Has ingresat " + euros + "€");
            System.out.println("Què vols canviar?");
            System.out.println("1. Bitcoins (BTC)");
            System.out.println("2. Ethereum (ETH)");
            System.out.println("3. Sortir");

            int option = scanner.nextInt(); //llegeix la opció escollida
            switch (option) {
                case 1: //Bitcoin
                    System.out.println("el canvi es: " + euros / bitcoin + " BTC");
                    break;
                case 2: //Ethereum
                    System.out.println("el canvi es: " + euros / ethereum + " ETH");
                    break;
                case 3: //Sortir
                    System.out.println("Has triat sortir");
                    break;
                default: //Si l'usuari ha posat una altre opció
                    System.out.println("Opció no vàlida");
                    return;
            }
        } else { //Si ha posat un valor inferior a 1€ o major que 1000€
            System.out.println("L'import a de ser entre 1-1000€");
        }
        scanner.close(); //Tanca els processos
    }
}

//Bini Ferrer Anechina