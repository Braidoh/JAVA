package Metode;
import java.util.Scanner;

public class ExempleMetode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=PrimerNumero(sc); //Primer mètode per demanar el primer numero a sumar
        int num2=SegonNumero(sc);//Segón mètode per demanar el segón número a sumar
        int resultat=SumarNumeros(num1,num2);//Tercer mètode per fer la suma
        PrintarResultat(resultat);//Quart mètode per printar el resultat per pantalla
    }

    // Aquest mètode no retornarà res. Només posa un missatge per pantalla
    private static void PrintarResultat(int resultat) {
        System.out.println("El resultat es "+ resultat);
    }

    // Aquest mètode ens retorna el segon valor que ha introduit el usuari per poder fer la suma
    private static int SegonNumero(Scanner sc) {
        System.out.println("Donem el segón número per sumar");
        return sc.nextInt();
    }

    //Aquest mètode ens retorna el primer valor que ha introduit el usuari per poder fer la suma
    private static int PrimerNumero(Scanner sc) {
        System.out.println("Benvingut, donem el primer número per sumar");
        return sc.nextInt();
    }

    // Aquest mètode rep dos paràmetres i fa la suma corresponent. Ens retorna el valor de la suma
    private static int SumarNumeros(int n1, int n2) {
        return n1+n2;
    }
}