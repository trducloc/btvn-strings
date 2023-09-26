import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi S1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhập chuỗi S2: ");
        String s2 = new Scanner(System.in).nextLine();
        System.out.print("Nhập vị trí chèn: ");
        int k = new Scanner(System.in).nextInt();

        String result = insertString(s1, s2, k);
        System.out.println("Chuỗi sau khi chèn: " + result);
    }
    public static String insertString(String s1, String s2, int k) {
        StringBuilder sb = new StringBuilder(s2);
        sb.insert(k, s1);
        return sb.toString();
    }
}
