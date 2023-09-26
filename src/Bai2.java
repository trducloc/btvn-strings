import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập xâu ký tự: ");
        String s = new Scanner(System.in).nextLine();
        String result = interleaved(s);
        System.out.println("Xâu ký tự sau khi chuyển đổi: " + result);
    }
    public static String interleaved(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}
