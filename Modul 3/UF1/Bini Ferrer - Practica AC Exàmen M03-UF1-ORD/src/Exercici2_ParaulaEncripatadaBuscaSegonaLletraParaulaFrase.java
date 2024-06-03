import java.util.Scanner;

public class Exercici2_ParaulaEncripatadaBuscaSegonaLletraParaulaFrase {
    public static void main(String[] args) {

        // Declaració de variables
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[7];
        StringBuilder encriptat = new StringBuilder();

        // Introdueix 7 paraules
        System.out.println("Escriu les 7 paraules totes seguides:");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = sc.next();
        }

        // Creem la paraula encriptada
        for (String palabra : palabras) {
            encriptat.append(palabra.charAt(1));
        }

        // Mostrem la paraula encriptada
        System.out.println("La paraula encriptada es: " + encriptat);
    }
}
