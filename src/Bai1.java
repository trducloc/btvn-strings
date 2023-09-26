public class Bai1 {
    public static void main(String[] args) {
        listReverseNumber();
    }
    public static boolean isReverseNumber(String n) {
        int length = n.length();
        for (int i = 0; i < length / 2; i++) {
            if (n.charAt(i) != n.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void listReverseNumber() {
        for (int i = 100000; i <= 1000000; i++) {
            String n = String.valueOf(i);
            if (isReverseNumber(n)) {
                System.out.println(n);
            }
        }
    }
}
