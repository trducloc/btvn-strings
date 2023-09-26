import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập xâu ký tự: ");
        String s = new Scanner(System.in).nextLine();
        String result = normalizeStrings(s);
        System.out.println("Xâu ký tự sau khi chuyển đổi: " + result);
    }

    public static String normalizeStrings(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split("\\s+");

        for (int i = 0; i < str.length; i++) {
            String c = str[i];
            if (!c.isEmpty()) {
                String firstChar = c.substring(0, 1);
                String restOfString = c.substring(1);
                sb.append(firstChar.toUpperCase());
                sb.append(restOfString.toLowerCase());
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
