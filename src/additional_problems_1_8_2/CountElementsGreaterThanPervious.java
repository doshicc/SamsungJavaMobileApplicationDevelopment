package additional_problems_1_8_2;

public class CountElementsGreaterThanPervious {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int a = scanner.nextInt();
        int b;

        for (int i = 0; i < n - 1; i++) {
            b = scanner.nextInt();
            if (b > a) {
                count++;
            }
            a = b;
        }
        System.out.print(count);
    }
}
