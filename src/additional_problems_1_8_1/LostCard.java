package additional_problems_1_8_1;

public class LostCard {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        long totalSum = (long) n * (n + 1) / 2;
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(totalSum - sum);
    }
}
