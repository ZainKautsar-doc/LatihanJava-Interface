import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Nama saya yayaantoo");
            writer.newLine();
            writer.write("semoga harimu sehat selalu");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}