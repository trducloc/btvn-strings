import java.util.Scanner;

public class Bai8 {

    public static void main(String[] args) {
        System.out.print("Nhập chuỗi S1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhập chuỗi S2: ");
        String s2 = new Scanner(System.in).nextLine();

        int position = findFirstAppear(s1, s2);

        if (position != -1) {
            System.out.println("Vị trí xuất hiện đầu tiên của chuỗi S1 trong chuỗi S2 là: " + position);
        } else {
            System.out.println("Không tìm thấy chuỗi S1 trong chuỗi S2.");
        }
    }

    public static int findFirstAppear(String s1, String s2) {
        return s2.indexOf(s1);
    }
}
