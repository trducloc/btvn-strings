import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.print("Nhập xâu họ tên: ");
        String str = new Scanner(System.in).nextLine();
        String fullName = changeOrderOfName(str);
        System.out.println("Xâu biểu diễn theo cấu trúc tên...họ...đệm: " + fullName);
    }

    public static String changeOrderOfName(String fullName) {
        String[] words = fullName.split("\\s+");
        String name = words[words.length - 1];
        String hoDem = "";
        for (int i = 0; i < words.length - 1; i++) {
            hoDem += words[i] + " ";
        }
        return name + " " + hoDem.trim();
    }
}
