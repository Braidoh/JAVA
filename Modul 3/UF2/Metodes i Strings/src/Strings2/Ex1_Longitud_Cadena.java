package Strings2;
import java.util.Scanner;

public class Ex1_Longitud_Cadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paraula = sc.next();
        int longitud = paraula.length();
        System.out.println("La longitud de la cadena és: " + longitud);
    }
}