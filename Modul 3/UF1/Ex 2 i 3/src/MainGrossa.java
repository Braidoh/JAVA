import java.util.Scanner;
public class MainGrossa {
    public static void main(String[] args) { // He posat el mètode principal perquè funcioni
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        /* Numero entero
        5 cifras
        00000...99999*/

        exit = false;
        int value = 0;
        final int VALUE_MIN = 00000;
        final int VALUE_MAX = 99999;

        do {
            System.out.println("Escribe tu décimo" + i"");
            if (input.hasNextInt()) {
                value = input.NextInt();
                if (exit) {
                    int num = value;
                    int digitos = 0;
                    while (num != 0) {
                        num = num / 10;
                        digitos++;
                    }
                    if (digitos != 5) {
                        exit = false;
                    }else{
                        a
                    }
                }
            }
            input.NextLine();
            if (!exit) {
                System.out.println("ERROR!");
            }
        }while (!exit)
    }
    System.out.println("Tus decimos son:");
    for(int)


        //Hacer el sorteo
        int[] decimosPremiados = new


    for(int i=0;i<decimosPremiados.lenght;i++) {
        System.out.printl(decimosPremiados[i]+" ");
    }

    //He ganado?
    for (int i=0<misNumeros.lenght;i++) {
        for (int j=0<demosPremiados<length;j++){
            if(misNumeros[i]==decimosPremiados[j]){
                System.out.printl("Premiado!"+misNumeros[i]);
            }
        }
    }





}
