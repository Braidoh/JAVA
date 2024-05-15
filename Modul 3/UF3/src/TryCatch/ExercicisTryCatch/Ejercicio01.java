package TryCatch.ExercicisTryCatch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        NumeroAleatori(sc, rand);
    }

    private static void NumeroAleatori(Scanner sc, Random rand) {
        int[] array;
        String option;
        array = new int[rand.nextInt(20)]; //Obté un número aleatorio entre 0 y 19

        for (int j = 0; j < array.length; j++) { //Recorre el array
            array[j] = rand.nextInt(100) ; //Obté un número aleatorio entre 0 y 99
        }

        System.out.println("Aquí està el teu array Integer:"); //
        System.out.println(Arrays.toString(array));
        System.out.print("Posa l'index que vols que mostri: ");
        int selection = sc.nextInt();

        try { // ArrayIndexOutOfBoundsException
            System.out.println(array[100]);
        } catch (ArrayIndexOutOfBoundsException e) { // Agafa l'error de l'array que és fora de rang
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        try { // InputMismatchException
            System.out.println("Posa un número: ");
            int num = sc.nextInt();
            System.out.println("Has posat: " + num);
        } catch (Exception e) {
            System.out.println("InputMismatchException");
        }

        System.out.println("Your selction:["+array[selection] +"]" );

        do {
            System.out.println("Exit application? [Y/N]");
            option = sc.next();
            option = option.toUpperCase();

            switch(option){
                case "Y":
                    sc.close();
                    System.exit(0);
                    break;
                case "N":
                    NumeroAleatori(sc, rand);
                    break;
                default :
                    System.out.println("Entrada no vàlida");
            }
        } while (!option.matches("Y"));
    }
}


