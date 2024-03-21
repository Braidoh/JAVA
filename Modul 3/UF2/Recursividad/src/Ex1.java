import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu(sc);
    }

    public static void Menu(Scanner sc) {
        String option;

        do {
            System.out.println("""
                    1. Dividir
                    2. Sumar dígitos
                    3. Sumar los elementos vector
                    4. Multiplicar los elementos de un vector
                    5. Sumar los elementos de una matriz
                    6. Mostrar numero menor de un vector
                    7. salir""");

            option = sc.next();
            switch (option) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opció no vàlida");
            }
        } while (!option.matches("1"));
        Menu(sc);
    }
}





