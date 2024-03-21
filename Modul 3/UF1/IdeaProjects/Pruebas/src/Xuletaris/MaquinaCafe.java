package Xuletaris;
import java.util.Scanner;

public class MaquinaCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioCafe = 0.50; // Precio del café

        while (true) {
            System.out.println("¿Qué producto desea?");
            System.out.println("1. Café");
            System.out.println("2. Cortado");
            System.out.println("3. Café con leche");
            System.out.println("4. Salir");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Por favor, introduzca una moneda de al menos 0.50 €:");
                    double moneda = input.nextDouble();
                    if (moneda >= precioCafe) {
                        double cambio = moneda - precioCafe;
                        System.out.println("Preparando su café. Su cambio es de " + cambio + " €.");
                    } else {
                        System.out.println("Importe insuficiente. Su dinero será devuelto. Por favor, introduzca al menos 0.50 €.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar la máquina de café. Hasta luego.");
                    input.close(); //Tanca el programa
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida (1-4).");
                    break;
            }
        }
    }
}