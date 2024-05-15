package FileRead.ExercicisFiles;
import java.io.*;
public class Car {
    private String marca;
    private String model;
    private int cadira;

    public Car(String inputmarca, String inputmodel, int inputcadira) {
        marca = inputmarca;
        model = inputmodel;
        cadira = inputcadira;
    }

    public String toString() {
        return "Marca: " + marca + ", Model: " + model + ", Cadires: " + cadira;
    }

    public byte[] toByteArray() throws IOException {
        ByteArrayOutputStream dades = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(dades);
        dos.writeUTF(marca);
        dos.writeUTF(model);
        dos.writeInt(cadira);
        return dades.toByteArray();
    }

}
