package additional_problems_1_8_1;

public class Factorial {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        System.out.println(res);
    }
}
