import java.util.Scanner;

//XULETARI ARRAYS 2D
public class Arrays2D {
    public static void main(String[] args) {
        float[][] grades; // Ex: Taules de notes d'assignatura
        int[][] passengers; //Ex:
        boolean[][] access; //Ex:
        char[][] qualifications; //Ex:
        String[][] names; //Ex:

        //Accesing an array 2D
        float[][] grades= {
                {8.7f,9.3f,9.0f,7.5f,6.0f},
                {9.3f,7.0f,9.5f,9.0f,7.5f},
                {5.5f,7.5f,8.2f,8.0f,6.6f},
                {9.0f,7.5f,9.0f,8.5f,7.0f}
        };
        System.out.println(grades[1][2]); //Prints: 9.5

        float[][] grades= {
                {8.7f,9.3f,9.0f,7.5f,6.0f},
                {9.3f,7.0f,9.5f,9.0f,7.5f},
                {5.5f,7.5f,8.2f,8.0f,6.6f},
                {9.0f,7.5f,9.0f,8.5f,7.0f}
        };
        System.out.println(grades[1][2]); //Prints: 7.0

        //Array estàtic
    }
}
