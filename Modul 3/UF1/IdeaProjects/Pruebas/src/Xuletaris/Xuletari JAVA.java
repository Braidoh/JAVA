//INICI DE LA CHULETA
//DECLARA VARIABLES
//ACABA PROCESSOS!
package Xuletaris;
import java.util.Scanner;

//AIXÒ ET DIU LA FUNCIÓ DE CADA COMANDA
public class Comandes { //Aquesta es la clase principal e imprescindible
    public static void main(String[] args) { //AQUEST ÉS EL MÈTODE PRINCIPAL

        //DECLARACIÓ E INICIALITZACIÓ DE VARIABLES
        int a=0; //Així es delcara un INTEGER
        float b=0; //AIXÍ ES DECLARA UN FLOAT (VARIABLE AMB DECIMALS)
        boolean d = false; //AIXÍ DECLARO UN BOOLEAN. NOMÉS POT SER TRUE O FALSE
        String Paraula = "Desperta!"; //AIXÍ DECLARO UN STRING. AIXÒ HO TRACTEM COM UN OBJECTE
        char letra ='a'; //AIXÍ DECLAREM UNA VARIABLE DE TIPUS CHAR
        if (a>=b) //{code}

        .
        boolean b1 = (1 == 1); // TRUE because 1 is equal to 1
        boolean b2 = (2 != 1); // TRUE because 2 is not equal to 1
        boolean b3 = (2 > 1);  // TRUE because 2 is greater than 1
        boolean b4 = (1 < 2);  // TRUE because 1 is less than 2
        boolean b5 = (1 >= 1); // TRUE because 1 is greater than or equal to 1
        boolean b6 = (2 <= 1); // FALSE because 2 is not less than or equal to 1
    }
}



//AIXÒ ÉS UN EXEMPLE DE LES FUNCIONS D'AQUESTS COMANDS
public class FuncionsComanda { //Aquesta es la clase principal e imprescindible
    public static void main(String[] args) {

        boolean isLogin = true;
        float ratio = 37.5f;
        double budget = 13450.99;
        char letter = 'a';
        String greeting = "Hello";
        char character= (char) 97; //ASCII character: a
        int entero= 'a'; //ASCII value: 97

        //El sistema no acceptarà això
        boolean isLogin = 17;
        char me = "l";
    }
}



//AIXÒ SÓN OPERACIONS ARITMÈTIQUES AMB JAVA I LES SEVES CONSEQUÈNCIES
public class OperacionsAritmetiques { //Aquesta es la clase principal e imprescindible
    public static void main(String[] args) {

        int multiplication = 3 * 4; //=12
        int div = 5 / 2; //=2        AIXÒ NO ES FA
        double div = 5 / 2; //=2.0   AIXÒ NO ES FA
        double div  = 5 / 2.0; //=2.5 AIXÍ ES FA
        int aux = 5 % 2; //=1
        int x = 1 + 2; //=3  DIRECTAMENT POSAR EL NUMERO PER NO COMPLICARSE LA VIDA
        int y = 4 - 5; //=-1 DIRECTAMENT POSAR EL NUMERO PER NO COMPLICARSE LA VIDA
        int z = x * y; //=-3 DIRECTAMENT POSAR EL NUMERO PER NO COMPLICARSE LA VIDA
        int a = -1; //FER COM AIXÒ
        int b1 = 2;
        b = a + b1; //1
        long b = a; //CONVERSIÓ PER AMPLIACIÓ
        char a= '4';

//AIXÒ ÉS EXEMPLE 1

        //DECLARACIÓ E INICIALITZACIÓ DE VARIABLES
        double precioMenu = 23.5;
        double pagado = 30;
        double propina = pagado - precioMenu; //=6.5    SI
        double propina = (pagado - precioMenu) * .10; //0.65 NO
        double propina = pagado - precioMenu * .10; //2.35  NO
        //Imprimir pantalla o demanar informació usuari
        System.out.print("Holis");
    }
}

//IF STATEMENT

public class IfStatement { //Aquesta es la clase principal e imprescindible
    public static void main(String[] args) {

        //EXEMPLE 1
        boolean isExpresso = ? //true or false
        if (isExpresso) {
        System.out.println("Get your expresso, please!");
        }

        //EXEMPLE 2
        double temperatureInCelsius = -3;
        if (temperatureInCelsius < 0) {
            System.out.println(“It's very cold. Consider wearing a scarf.”);
        } //It's very cold. Consider wearing a scarf.
        System.out.println(“Have a good day!”); // Have a good day!”);
        }

    //IF AND ELSE
    public static void if-else(String[] args)
    {
        if (condition) {
            //code block
            //will execute ONLY if condition is true
        } else {
            //code block
            //will execute ONLY if condition is false
        }
        //more code

        //EXEMPLE 1
        double temperatureInCelsius = 20;
        if (temperatureInCelsius < 0) {
            System.out.println(“It's very cold. Consider wearing a scarf.”);
        } else {
            System.out.println("It's not that cold. Wear a t-shirt."); // It's not that cold. Wear a t-shirt
        }
        System.out.println(“Have a good day!”); // Have a good day!”);

        //EXEMPLE 2
        double temperatura= 28;
        if (temperatura >25) {
            System.out.println(“Hace calor. No olvides ponerte tus gafas de sol.”);
        }
        System.out.println(“La temperatura ambiente es: “+temperatura+”ºC.”);
        }
    }

//SWITCH STATEMENT

public class Switch { //Aquesta es la clase principal e imprescindible
    public static void main(String[] args) {

        switch (some value to consider) {
            case value 1:
            //code block respond to value 1
                break;
            case value 2:
            //code block respond to value 2
                break;
            default:
            //otherwise, do something else
                break;
        } //more code


        //EXEMPLE 1
        int month = 8;
        String monthString;
        switch (month) {
            case 1: monthString = "January"; break;
            case 2: monthString = "February"; break;
            case 3: monthString = "March"; break;
            case 4: monthString = "April"; break;
            case 5: monthString = "May"; break;
            case 6: monthString = "June"; break;
            case 7: monthString = "July"; break;
            case 8: monthString = "August"; break;
            case 9: monthString = "September"; break;
            case 10: monthString = "October"; break;
            case 11: monthString = "November"; break;
            case 12: monthString = "December"; break;
            default: monthString = "Invalid month"; break;
        }
        System.out.println(monthString); //August
    }
    //EXEMPLE 2
    public static void main(String[] args) {

        int opció = 0;
        Scanner llegiropció = new Scanner(System.in);
        System.out.println("Hola, si us plau, introdueix");
        int opció = llegiropció.nextInt();

        String ScannerhString;
        switch (opció) {
            case 1: ScannerhString = "Escanear"; break;
            case 2: ScannerhString = "Opcions"; break;
            case 3: ScannerhString = "Hola"; break;
            case 4: ScannerhString = "Exit"; ;;break;
            default: ScannerhString = "Opció Invàlida"; break;
        }
        System.out.println(monthString); //August
    }
}

//S'HA DE TANCAR L'ESBIRRO
    import java.util.Scanner;

    public class TancarEsbirro {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Tu código para leer y procesar la entrada aquí.

            // Cierra el objeto Scanner cuando hayas terminado.
            scanner.close();
        }
    }






