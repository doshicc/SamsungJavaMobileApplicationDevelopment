package task_1_8;

public class NumberEqualToX {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int res = -1;
        for (int j = 0; j < n; j++) {
            if (arr[j] == x) {
                res = j + 1;
                break;
            }
        }
        if (res == -1) {
            System.out.println("NO");
        } else {
            System.out.println(res);
        }
    }
}