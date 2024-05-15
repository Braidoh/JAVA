package TryCatch.ExercicisTryCatch;

import java.io.*;
import java.nio.file.*;


public class Brut {
    public static void main(String[] args) {
        try {
            System.out.println("Introdueix la ruta del fitxer origen:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sourcePath = reader.readLine();


            System.out.println("Introdueix la ruta del fitxer destí:");
            String destinationPath = reader.readLine();


            String content = readFile(sourcePath);
            writeFile(destinationPath, content);


            System.out.println("El programa ha acabat sense incidències.");
        } catch (NoSuchFileException e) {
            System.out.println("El fitxer origen no existeix.");
        } catch (FileAlreadyExistsException e) {
            System.out.println("El fitxer destí ja existeix.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String readFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("El archivo fue creado exitosamente.");
            } else {
                throw new NoSuchFileException(path);
            }
        }


        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line.toUpperCase()).append("\n");
            }
        }


        return content.toString();
    }


    public static void writeFile(String path, String content) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            throw new FileAlreadyExistsException(path);
        } else {
            if (file.createNewFile()) {
                System.out.println("El archivo fue creado exitosamente.");
            }
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        }
    }
}
