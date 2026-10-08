package additional_problems_1_8_2;

public class NumbersOfDistinctElementsInMonotonrArea {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;
        int a = scanner.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int b = scanner.nextInt();
            if (a != b) {
                res++;
            }
            a = b;
        }
        System.out.print(res);
    }
}
