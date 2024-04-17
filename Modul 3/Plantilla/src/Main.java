import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                           ******************************
                           Hola benvingut/da al programa
                           "******************************""");

        menuPrincipal();
        System.out.println("""
                           ******************************
                           Adéu fins la propera!
                           "******************************""");
    }

    public static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcio = 0;

        System.out.println("""                
                "Escull una opció del menú:
                1- Hola
                2- Adéu
                3- Sortir""");

        opcio = sc.nextInt();

        switch (opcio) {
            case 1:
                System.out.println("Hola! Cas 1");
                menuPrincipal(); // Cas recursiu
                break;
            case 2:
                System.out.println("Hola! Cas 2");
                menuPrincipal(); // Cas recursiu
                break;
            case 3: // CASE BASE DE LA RECURSIVITAT
                System.out.println("Sortint del programa... ");
                break;
            default:
                System.out.println("ERROR: Opció no vàlida!");
                menuPrincipal(); // Cas recursiu
                break;
        }
    }
}