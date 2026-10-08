package additional_problems_1_8_2;

public class EvenElements {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int a;

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.print(a);
                if (i != n - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
