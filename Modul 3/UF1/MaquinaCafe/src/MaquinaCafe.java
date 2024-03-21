import java.util.Scanner;

public class MaquinaCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioCafe = 0.50;

        System.out.println("""
                ¿Qué producto desea?
                Opción 1: Café
                Opción 2: Cortado
                Opción 3: Café con leche
                Opción 4: Salir
                Escoge una opción:""");

        while (!input.hasNextInt()) {
            System.out.println("Escoge una opción:");
            input.next();
        }

        int option = input.nextInt();

        switch (option) {
            case 1:
            case 2:
            case 3:
                preparaCafe(input, precioCafe);
                break;
            case 4:
                System.exit(0);
        }
        input.close();
    }

    public static void preparaCafe(Scanner input, double precioCafe) {
        System.out.println("Debes insertar al menos 0,50 €.");
        double moneda = input.nextDouble();
        if (moneda >= precioCafe) {
            System.out.println("Preparando su café.");
            System.out.println("Cambio: " + (moneda - precioCafe) + " euros");
        } else {
            System.out.println("Importe insuficiente. Su dinero será devuelto. Por favor, introduzca al menos 0,50 €.");
        }
    }
}
