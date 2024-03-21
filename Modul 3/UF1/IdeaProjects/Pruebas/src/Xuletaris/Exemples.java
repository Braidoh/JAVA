package Xuletaris;
import java.util.Scanner;

public class Exemples {
    public static void main(String[] args) {

        //Menu Videojoc
        int option = 3;
        String menu;
        switch (option) {
            case 1: menu = "Play"; break;
            case 2: menu = "Options"; break;
            case 3: menu = "Credits"; break;
            case 4: menu = "Exit"; break;
            default: menu = "Invalid option"; break;
        }
        System.out.println(menu); //Credits
        }

        //Escollir càmera de vigilància
        int cameravista = 2;
        String view;
        switch (cameravista) {
            case 1: view = "Camera 1"; break;
            case 2: view = "Camera 2"; break;
            case 3: view = "Camera 3"; break;
            case 4: view = "Camera 4"; break;
            case 5: view = "Camera 5"; break;
            case 6: view = "Camera 6"; break;
            default: view = "Invalid option"; break;
        }
            System.out.println(view); //Camera 2

            //For dintre de for
            for (i=0, i<=3, i++); {
                for (j=0, j<=2, j++){
                System.out.println("Hello world")
                }
            }

            //Taula de multiplicació amb for
            int num= //... numero introducido por el usuario
            for (int j = 1; j<= num; j++); {
                System.out.println ("La tabla del " + j);
                for (int i = 1; i<=10, i++){
                    System.out.println(i+" "x" "+j+"="+(i*j));
                }
                System.out.println("------------");
            }
    }




