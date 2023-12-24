import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Я\\kolvo.txt";
        int lineKolvo = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineKolvo++;
                int charCount = line.length();
                int wordCount = line.trim().split("\\s+").length;

                System.out.println("Количество строк: " + lineKolvo);
                System.out.println("\nСтрока " + lineKolvo + ":");
                System.out.println("Количество символов: " + charCount);
                System.out.println("Количество слов: " + wordCount);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}