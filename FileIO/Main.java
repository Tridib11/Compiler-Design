import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "input.txt";
        int lineCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of characters: " + charCount);
    }
}
