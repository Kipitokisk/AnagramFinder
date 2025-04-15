import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AnagramFinder {
    public static void main(String[] args) {
        Map<String, List<String>> groups = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String word;
            while ((word = reader.readLine()) != null) {
                String key = getKey(word);
                groups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (List<String> group: groups.values()) {
            System.out.println(String.join(" ", group));
        }

    }

    public static String getKey(String word) {
        char[] arr = word.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
