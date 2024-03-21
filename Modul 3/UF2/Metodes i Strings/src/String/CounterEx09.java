import java.util.Scanner;

public class CounterEx09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String text = sc.nextLine();

        int paraula = 1; // Conta paraules
        for (int i = 0; i < text.length(); i++) { //S'executa les vegades que facin falta fins arribar al final del text
            if (text.charAt(i) == ' ') { //Detecta l'espai del text
                paraula++; //Suma +1 al contador paraula
            }
        }

        int vocal = 0; // Conta les vocals
        for (char c : text.toCharArray()) {// Mira els caràcters del text i assigna la variable c
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { //Nomès ho fa amb a,e,i,o,u
                vocal++; //Suma +1 al contador paraula
            }
        }

        System.out.println("El texto tiene " + paraula + " palabras."); //Numero de paraules
        System.out.println("El texto tiene " + vocal + " vocales."); //Numero de vocals
    }
}

