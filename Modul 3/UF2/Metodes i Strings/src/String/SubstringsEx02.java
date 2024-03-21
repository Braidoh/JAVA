public class SubstringsEx02 {
    public static void main(String[] args) {
        String path = "home/user/index.html";

        // S'encarrega l'extensió del fitxer
        int index = path.lastIndexOf('.'); //Llegeix el punt
        String extension = path.substring(index + 1); //Llegeix les paraules
        System.out.println("L'extensió del fitxer es: " + extension); //Posa l'extensió

        // S'encarrega del nom del fitxer
        index = path.lastIndexOf('/'); //Llegeix la barra
        String nom = path.substring(index + 1, index); //Llegeix las palabras
        System.out.println("El nom del fitxer es: " + nom); //Posa el nom
    }
}