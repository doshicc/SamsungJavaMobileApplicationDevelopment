package additional_problems_1_8_2;

public class PositiveCount {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int a;

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a > 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}
