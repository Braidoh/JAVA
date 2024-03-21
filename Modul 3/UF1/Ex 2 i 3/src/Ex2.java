import java.util.Scanner; // Importo el mòdul Scanner per validar el Scanner

public class Ex2 { //He posat la clase Ex2 perquè s'executi el codi

    public static void main(String[] args) { // He posat el mètode principal perquè funcioni
        Scanner input = new Scanner(System.in);
        boolean valorCorrecte; //He tret el valor false perquè no ho necessita
        int opcio; //He tret el valor 0 perquè no ho necessita

        do {
            System.out.print("Escriu un valor enter 1-4: ");
            valorCorrecte = input.hasNextInt(); //Poso input.hasNextInt()
            if (!valorCorrecte) { // Poso !valorCorrecte
                System.out.println("ERROR: No enter!");
            } else {
                opcio = input.nextInt(); // Poso input.nextInt()
                if (opcio < 1 || opcio > 4) {
                    System.out.println("ERROR: Valor fuera de rango!");
                    valorCorrecte = false;
                }
            }
            input.nextLine(); // Poso nextLine()
        } while (!valorCorrecte); // Poso !valorCorrecte
        input.close();
        System.exit(0);
    }
}
