import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.stream.Streams;
public class File2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\Users\\nirmalkumar.m\\Documents\\hello world.txt"));

        // Count lines in the file.
        // ... Call count() on the lines Stream.
        String lines = reader.readLine().count();
        System.out.println("Lines: " + lines);

        // Close it.
        reader.close();
    }
}
//Files.readAllLines()