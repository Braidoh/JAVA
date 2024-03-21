package String;

import java.util.Scanner;

public class Tarea1Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
        Bienvenido al Mini juego del ahorcado
        Intenta adivinar la película
        F****** ****""");

        String palabraAdivinar = sc.nextLine();

        // Comprobamos si la palabra es vacía
        String palabraMostrada;
        if (palabraAdivinar.isEmpty()) {
            palabraMostrada = "*";
        } else {
            palabraMostrada = "";
        }

        // Mostramos el primer carácter como pista
        System.out.println("La palabra o frase empieza por: " + palabraAdivinar.charAt(0));

        // Bucle principal del juego
        boolean encontrada = false;
        while (!encontrada) {
            // Mostramos la palabra mostrada
            System.out.println("Palabra mostrada: " + palabraMostrada);

            // Pedimos una letra al usuario
            System.out.println("Introduce una letra:");
            String letra = sc.next();

            // Comprobamos si la letra está en la palabra a adivinar
            for (int i = 0; i < palabraAdivinar.length(); i++) {
                if (palabraAdivinar.charAt(i) == letra.charAt(0)) {
                    palabraMostrada += letra;
                    encontrada = true;
                    break;
                }
            }

            // Si la letra no está en la palabra, incrementamos el número de fallos
            if (!encontrada) {
                System.out.println("La letra " + letra + " no está en la palabra.");
            }
        }
        // Mostramos la palabra completa si ha sido adivinada
        System.out.println("¡Enhorabuena! Has adivinado la palabra: " + palabraAdivinar);
    }
}
