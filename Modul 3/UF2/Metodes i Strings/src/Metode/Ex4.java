package Metode;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Posa el preu de venta:");
        double venta = sc.nextInt();
        sc.close();
        double resultado = calcula_bonificacion(venta);

        System.out.println("La bonificación para una venta de " + venta + " es de " + resultado);
    }
    public static double calcula_bonificacion(double venta) {
        double bonificacion;

        if (venta < 20000) {
            bonificacion = 7000 + 0.02 * venta;
        } else if (venta <= 50000) {
            bonificacion = 15000 + 0.03 * venta;
        } else {
            bonificacion = 20000 + 0.12 * venta;
        }
        return bonificacion;
    }
}


