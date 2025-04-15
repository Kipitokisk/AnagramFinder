import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnagramFinder {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/sample.txt"))) {
            String word;
            while ((word = reader.readLine()) != null) {
                System.out.println(word);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
