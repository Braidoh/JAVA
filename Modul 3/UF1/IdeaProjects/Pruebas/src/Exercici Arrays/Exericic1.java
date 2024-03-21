//1. Leer 5 números por teclado, guardarlos en un vector y mostrarlos en el mismo orden introducido. (Utilizaremos un bucle para pedir los valores al usuario y guardarlos al vector; y otro bucle para mostrarlos).

import java.util.Scanner;

public class Exericic1 {
    public static void Exericici1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar los números
        int[] numeros = new int[5];

        // Pedir al usuario que ingrese los números y guardarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números en el mismo orden introducido
        System.out.println("Los números ingresados son:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }
}
