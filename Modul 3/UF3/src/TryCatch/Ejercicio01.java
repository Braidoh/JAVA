package TryCatch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] array;
        array = new int[rand.nextInt(20)]; //Obté un número aleatorio entre 0 y 19

        for (int j = 0; j < array.length; j++) { //Recorre el array
            array[j] = rand.nextInt(100) ; //Obté un número aleatorio entre 0 y 99
        }

        boolean no = true;
        while(no){
            System.out.println("Here is our Integer Array:");
            System.out.println(Arrays.toString(array));
            System.out.print("Enter the index you want to display: ");
            int selection = sc.nextInt();

            try { // ArrayIndexOutOfBoundsException
                System.out.println(array[100]);
            } catch (ArrayIndexOutOfBoundsException e) { // Agafa l'error de l'array que és fora de rang
                System.out.println("ArrayIndexOutOfBoundsException");
            }

            try { // InputMismatchException
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                System.out.println("You entered: " + num);
            } catch (Exception e) {
                System.out.println("InputMismatchException");
            }

            System.out.println("Your selction:["+array[selection] +"]" );
            System.out.println("Exit application?: yes or no");
            String option = sc.next();
            switch(option){
                case "yes":
                    no = false;
                    break;
                case "no":
                    break;
                default :
                    System.out.println("please enter again ");
            }
        }
    }
}

