package task_1_8;

public class TheSequence {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int a = 4;
        for (int i = 0; i < n; i++) {
            arr[i] = a;
            a += 3;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
            if (j < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
