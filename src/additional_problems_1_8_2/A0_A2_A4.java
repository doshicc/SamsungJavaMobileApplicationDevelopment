package additional_problems_1_8_2;

public class A0_A2_A4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (i % 2 == 0) {
                System.out.print(a);
                if (i != n - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
