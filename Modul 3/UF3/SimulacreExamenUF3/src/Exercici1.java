public class Main {
    public static void main(String[] args) {
        int x = 12, y = 4;
        int resultat;

        ______ {    // try
            resultat = divisio(x, y);
            System.out.println(resultat);
        } ______ (	){  // catch (ArithmeticException ae)
            System.out.println("ERROR: " + ae.getMessage());
        }
    }
    private static int divisio(int x, int y)	ArithmeticException{    // throws
        int resultat = x / y;
        return resultat;
    }
}
