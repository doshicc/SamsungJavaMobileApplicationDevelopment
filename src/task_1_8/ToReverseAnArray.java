package task_1_8;

public class ToReverseAnArray {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j = n - 1; j >= 0; j--) {
            System.out.print(arr[j]);
            if (j != 0) {
                System.out.print(" ");
            }
        }
    }
}
