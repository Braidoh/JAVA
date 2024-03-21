import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double euros; //Declarar variable

        Scanner scanner=new Scanner(System.in); //Activa la lectura
        System.out.print("Benvigut al canvi de diners, quants Euros vols canviar (nomès permet de 1€ fins a 1000€)?");
        euros = scanner.nextDouble();

        if (euros >= 1 || euros <= 1000) { //Accepta 1€ que sigui igual o major. Accepta 1000€ igual o menor
            System.out.print("Has ingresat " + euros + "€");
            System.out.print("Què vols canviar?");
            System.out.println("1. Dolàrs");
            System.out.println("2. Lliures esterlines");
            System.out.println("3. Sortir");

            int option = scanner.nextInt(); //llegeix la opció escollida
            switch (option) {
                case 1: //Dolars
                    System.out.println("el canvi es:" + euros * 0.97 + "$");
                case 2: //Lliures esterlines
                    System.out.println("el canvi es:" + euros * 0.88 + "£");
                case 3: //Sortir
                    System.out.println("Adéu!");
                    break;
                default: //Si l'usuari ha posat una altre opció
                    System.out.println("Opció no vàlida");
                    break;
            }
        } else { //Si ha posat un valor inferior a 1€ o major que 1000€
            System.out.println("L'import a de ser entre 1-1000€");
        }
        scanner.close(); //Tanca els processos
    }
}