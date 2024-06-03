//Bini Ferrer Anechina

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Defineix valor scanner

        double euros=0;
        double bitcoin = 32296.53;
        double ethereum = 1693.80;
        String option;

        do {
            System.out.print("Quants euros vols canviar (nomès permet de 1€ fins a 1000€)?");
            if (sc.hasNextDouble()) { //Si l'usuari ha posat un número
                euros = sc.nextDouble(); //Activa la lectura de euros
                if (euros < 1 || euros > 1000)  //Si ha posat un valor inferior a 1€ o major que 1000€
                    System.out.println("L'import a de ser entre 1-1000€");
            } else { //Si l'usuari ha posat un format diferent
                System.out.println("Introdueix un número vàlid.");
                sc.next();
            }
        } while (euros < 1 || euros > 1000);
        System.out.println("Has ingresat " + euros + "€");

        do { // Bucle per si posa una altre cosa
            System.out.println("""
                    Quina moneda vols canviar?
                    1. Bitcoins (BTC)
                    2. Ethereum (ETH)
                    3. Sortir""");

            option = sc.next(); //llegeix la opció escollida
            switch (option) {
                case "1": //Bitcoin
                    System.out.println("el canvi es: " + euros / bitcoin + " BTC");
                    break;
                case "2": //Ethereum
                    System.out.println("el canvi es: " + euros / ethereum + " ETH");
                    break;
                case "3": //Sortir
                    System.out.println("Has triat sortir");
                    sc.close(); //Tanca els processos
                    break;
            }
        } while (!option.matches("3")); //Si l'usuari posa 3, surt del bucle i finalitza el programa
    }
}

//Bini Ferrer Anechina