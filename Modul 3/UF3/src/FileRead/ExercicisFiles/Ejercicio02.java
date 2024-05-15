package FileRead.ExercicisFiles;
import java.io.File;
public class Ejercicio02 { // Mostrar dades de tots els arxius d'una carpeta
    public static void main(String[] args) {
        Ejercicio02 programa = new Ejercicio02();
        programa.inicio();
    }
    private void inicio() {
        File directori= new File ("c:/Users/binif/Downloads");
        File[] fitxer = directori.listFiles(); // Obté tots els arxius i directoris
        if (fitxer != null) { // Comprova si la carpeta no está buida
            for (File file : fitxer) { // Bucle per recórre tots els arxius
                MostrarDades(file); // Mostra les dades de cada arxiu
            }
        }
    }
    private void MostrarDades(File f) {
        System.out.println("**********************************");
        System.out.println("Nom: " + f.getName());
        System.out.println("Tamany: " + f.length()/1024 + " kilobytes"); // Passa els bytes a kilobytes
        System.out.println("Data de modificació: " + f.lastModified());
        if (f.isDirectory()) {
            System.out.println("Es un directori");
        } else {
            System.out.println("Es un fitxer");
        }
    }


}

