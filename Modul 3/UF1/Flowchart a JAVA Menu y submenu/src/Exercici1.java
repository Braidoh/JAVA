import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.print("Benvingut/da al programa");

            System.out.print("Escull una opció: ");
            System.out.println("1. Lloc preferit");
            System.out.println("2. Salutació");
            System.out.println("3. Comiat");
            System.out.println("4. Sortir");
            option = scanner.nextInt();

            switch (option) {
                case 1: // Lloc preferit
                    submenu(scanner);
                    break;
                case 2: // Salutació
                    System.out.println("Hola bon dia!");
                    return;
                case 3: //Comiat
                    System.out.println("Adéu siau!");
                    System.exit(0);
                case 4: //Sortir
                    System.exit(0);
                default:
                    System.out.println("Escull una opció vàlida");
                    return;
            }
        scanner.close();
    }

    public static void submenu(Scanner scanner) {
        int option2;

            System.out.println("Submenú: Escull lloc preferit:");
            System.out.println("1. Mar");
            System.out.println("2. Muntanya");
            System.out.println("3. Tornar enrere");

            option2 = scanner.nextInt();

            switch (option2) {
                case 1: //Mar
                    System.out.println("Si t’agrada el mar, t’agradarà l’estiu");
                    break;
                case 2: //Muntanya
                    System.out.println("Si t’agrada la muntanya, t’agradarà l’hivern");
                    break;
                case 3: // Torna enrere
                    return;
                default:
                    System.out.println("Escull una opció vàlida");
                    break;
            }
        }
    }

