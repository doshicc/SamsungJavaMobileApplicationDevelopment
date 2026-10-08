package additional_problems_1_8_2;

public class LargestElementInArray {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int a, m = 0;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (i == 0) {
                m = a;
            }
            if (m < a) {
                m = a;
            }
        }
        System.out.print(m);
    }
}
