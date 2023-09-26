import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.print("Nhập xâu ký tự: ");
        String str = new Scanner(System.in).nextLine();
        String longestWord = findLongestWord(str);
        int position = position(str, longestWord);

        if (!longestWord.isEmpty()) {
            System.out.println("Từ dài nhất là: " + longestWord);
            System.out.println("Xuất hiện ở vị trí: " + (position + 1));
        } else {
            System.out.println("Không tìm thấy từ trong xâu");
        }
    }

    public static String findLongestWord(String str) {
        String[] words = str.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static int position(String str, String word) {
        return str.indexOf(word);
    }
}
