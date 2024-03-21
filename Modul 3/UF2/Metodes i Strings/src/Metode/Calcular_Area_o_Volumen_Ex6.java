package Metode;
import java.util.Scanner;

public class Calcular_Area_o_Volumen_Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                MENU:
                1. Calcular Area
                2. Calcular Volumen""");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                Area(sc);
                break;
            case 2:
                Volumen(sc);
                break;
            default:
                System.out.println("No es vàlid");
                break;
        }
        sc.close();
    }
    public static void Area(Scanner sc) {
        System.out.println("Posa el radi");
        double radio = sc.nextInt();
        System.out.println("Posa l'altura");
        double altura = sc.nextInt();
        double area = 2 * Math.PI * radio * (radio + altura);
        System.out.println("El área del cilindro es de " + area);
    }
    public static void Volumen(Scanner sc) {
        System.out.println("Posa el radi");
        double radio = sc.nextInt();
        System.out.println("Posa l'altura");
        double altura = sc.nextInt();
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cilindro es de " + volumen);
    }
}
