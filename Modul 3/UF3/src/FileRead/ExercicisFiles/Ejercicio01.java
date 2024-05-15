package FileRead.ExercicisFiles;
import java.io.File;

public class Ejercicio01 { // Dades Fitxers
    public static void main(String[] args) {
        Ejercicio01 programa = new Ejercicio01();
        programa.inicio();
    }
    public void inicio() {
        File directoryAbsPath= new File ("c:/Temp");
        File fileAbsPath = new File ("c:/Temp/data.txt");
        File directoryRelativePath = new File("Temp");
        File fileRelativePath = new File("Temp/data.txt");
        showPaths(directoryAbsPath, false);
        showPaths(fileAbsPath, false);
        showPaths(directoryRelativePath, true);
        showPaths(fileRelativePath, true);
    }
    public void showPaths(File f, boolean relativePath) {
        System.out.println("**********************************");
        if (relativePath) System.out.println("La ruta es " + f.getAbsolutePath());
        System.out.println("Su padre es " + f.getParent());
        System.out.println("Su nombre es " + f.getName());
    }
}

