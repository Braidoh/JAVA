package Metode;
import java.util.Scanner;

public class Calculadora_Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                MENU:
                1) Suma
                2) Resta
                3) Multiplicacio
                4) División
                5) Exponencial""");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                Suma(sc);
                break;
            case 2:
                Resta(sc);
                break;
            case 3:
                Multiplicacion(sc);
                break;
            case 4:
                Division(sc);
                break;
            case 5:
                Exponencial(sc);
                break;
            default:
                System.out.println("No es vàlid");
                break;
        }
        sc.close();
    }
    public static void Suma(Scanner sc) {
        System.out.println("Posa un numero");
        double numero = sc.nextInt();
        System.out.println("Posa un altre numero");
        double numero2 = sc.nextInt();
        System.out.println( numero + " + " + numero2 + " = " + (numero+numero2));
    }

    public static void Resta(Scanner sc) {
        System.out.println("Posa un numero");
        double numero = sc.nextInt();
        System.out.println("Posa un altre numero");
        double numero2 = sc.nextInt();
        System.out.println( numero + " - " + numero2 + " = " + (numero-numero2));
    }

    public static void Multiplicacion(Scanner sc) {
        System.out.println("Posa un numero");
        double numero = sc.nextInt();
        System.out.println("Posa un altre numero");
        double numero2 = sc.nextInt();
        System.out.println( numero + " x " + numero2 + " = " + (numero*numero2));
    }

    public static void Division(Scanner sc) {
        System.out.println("Posa un numero");
        int numero = sc.nextInt();
        System.out.println("Posa un altre numero");
        int numero2 = sc.nextInt();
        System.out.println( numero + " / " + numero2 + " = " + (numero/numero2));
    }

    public static void Exponencial(Scanner sc) {
        System.out.println("Posa un numero");
        int numero = sc.nextInt();
        System.out.println("Posa el numero exponencial");
        int numero2 =  sc.nextInt();
        System.out.println("El numero exponencial de " + numero +" és "+ (Math.pow(numero, numero2)));
    }
}