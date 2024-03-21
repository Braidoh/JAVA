package Metode;

import java.util.Scanner;

public class ConversionGrados_Farenheit_Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Indica que quieres convertir:"
                1) Grados a Farenheit
                2) Farenheit a Grados
                """);

        int option = sc.nextInt();
        switch (option) {
            case 1:
                Grados_Farenheit(sc);
                break;
            case 2:
                Farenheit_Grados(sc);
                break;
            default:
                System.out.println("No es vàlid");
                break;
        }
        sc.close();
    }
    public static void Grados_Farenheit(Scanner sc) {
        System.out.println("Posa els graus");
        double celsius = sc.nextInt();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println( celsius + "º C = " + fahrenheit + "º F");
    }
    public static void Farenheit_Grados(Scanner sc) {
        System.out.println("Posa els fahrenheit");
        double fahrenheit = sc.nextInt();
        double celsius = (5.0 /9) * (fahrenheit - 32);
        System.out.println( fahrenheit + "º F = " + celsius + "º C");
    }
}
