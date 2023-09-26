import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.print("Nhập xâu S1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhập xâu S2: ");
        String s2 = new Scanner(System.in).nextLine();

        String result = removeSubstring(s1, s2);
        System.out.println("Xâu S1 sau khi loại bỏ xâu S2: " + result);
    }
    public static String removeSubstring(String s1, String s2) {
        while (s1.contains(s2)) {
            s1 = s1.replaceFirst(s2, "");
        }
        return s1;
    }
}
