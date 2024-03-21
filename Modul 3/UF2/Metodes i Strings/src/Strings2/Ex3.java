package Strings2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String paraula = sc.next();
        if (paraula.length() < 2) { // Comprovem si la longitud de la cadena és inferior a 2
            System.out.println("");
        }
        String primers = paraula.substring(0, 2); // Agafa els primers 2 caràcters de la cadena
        String ultims = paraula.substring(paraula.length() - 2); // Agafa els 2 últims caràcters de la cadena
        System.out.println(primers + ultims);
    }
}
