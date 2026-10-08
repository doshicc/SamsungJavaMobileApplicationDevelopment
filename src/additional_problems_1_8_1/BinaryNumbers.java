package additional_problems_1_8_1;

public class BinaryNumbers {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            System.out.print(n % 2);
            n /= 2;
        }
    }
}
