import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {
        System.out.print("Nhập chuỗi S1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhập chuỗi S2: ");
        String s2 = new Scanner(System.in).nextLine();

        String result = removeString(s1, s2);

        System.out.println("Chuỗi sau khi loại bỏ: " + result);
    }
    public static String removeString(String s1, String s2) {
        return s2.replace(s1, "");
    }
}
