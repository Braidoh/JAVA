package FileRead.ExercicisFiles;
import java.io.File;
public class Ejercicio03 { // Mou fitxers .png de Downloads a fotos y elimina
    public static void main(String[] args) {
        File fotos = new File("c:/Users/binif/Escritorio/fotos");
        if (!fotos.exists()) {
            System.out.println("La carpeta no existeix, creant-la...");
            fotos.mkdir();
        } else {
            System.out.println("La carpeta ja existeix");
        }

        File downloads = new File("c:/Users/binif/Downloads");
        File[] png = downloads.listFiles(); // Llista els fitxers de la carpeta Downloads
        for (File file : png) {
            if (file.getName().endsWith(".png")) { // Si el fitxer acaba en .png
                file.renameTo(new File("fotos/" + file.getName())); // Ho mou a la carpeta fotos
            }
        }
        System.out.println("Ficheros movidos");

        File directori = new File("c:/Users/binif/Escritorio/fotos");
        if (directori.exists()) { // Si existeix la carpeta
            File[] arxiu = directori.listFiles(); // Llista els fitxers de la carpeta
            if (arxiu != null) { // Si la carpeta no està buida
                for (File file : arxiu) {
                    file.delete(); // Elimina el contingut de la carpeta
                }
            }
            directori.delete(); // Elimina la carpeta
        }
    }
}
