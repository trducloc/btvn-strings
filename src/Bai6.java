import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.print("Nhập câu: ");
        String sentence = new Scanner(System.in).nextLine();

        String[] words = separationWords(sentence);
        sortWords(words);
        printWords(words);
    }

    public static String[] separationWords(String sentence) {
        return sentence.split(" ");
    }

    public static void sortWords(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
    }

    public static void printWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println(word);
        }

    }
}
