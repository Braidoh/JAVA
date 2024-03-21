package String;

import java.util.Scanner;

public class Tarea2Ex10 {
    public static void main(String[] args) {
        // Declaramos el array de nombres
        String[] nombres = {"Paula", "Santiago", "Pascual", "Jorge", "Saúl", "Enrique"};

        // Tarea #1: Mostrar los nombres de la clase
        System.out.println("Nombres de la clase:");
        for (int i = 0; i < nombres.length; i++) {
            // Si estamos en el último elemento, no imprimimos la coma final
            if (i == nombres.length - 1) {
                System.out.println(nombres[i]);
            } else {
                System.out.print(nombres[i] + ", ");
            }
        }

        // Tarea #2: Cambiar un nombre
        System.out.println("\nIntroduce la posición del nombre a cambiar:");
        Scanner sc = new Scanner(System.in);
        int posicion = sc.nextInt();

        if (posicion < 0 || posicion >= nombres.length) { // Comprobamos si la posición es válida
            System.out.println("La posición introducida no es válida.");
        } else {
            // Mostramos el nombre actual
            System.out.println("El nombre actual en la posición " + posicion + " es: " + nombres[posicion]);
            System.out.println("Introduce el nuevo nombre:"); // Solicitamos el nuevo nombre

            String nuevoNombre = sc.next();
            nombres[posicion] = nuevoNombre; // Cambiamos el nombre

            System.out.println("Nombres de la clase actualizados:");
            for (int i = 0; i < nombres.length; i++) { // Mostramos el contenido del array
                if (i == nombres.length - 1) { // Si estamos en el último elemento, no imprimimos la coma final
                    System.out.println(nombres[i]);
                } else {
                    System.out.print(nombres[i] + ", ");
                }
            }
        }
    }
}
