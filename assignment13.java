import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class assignment13 {
    public static void main(String[] args) {

        String fileName = "student.txt";

        // writing to a file using FileWriter
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Name: Riya Sharma\n");
            writer.write("Age: 20\n");
            writer.write("Course: BCA\n");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println();

        // reading from a file using BufferedReader
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("----- File Content -----");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}