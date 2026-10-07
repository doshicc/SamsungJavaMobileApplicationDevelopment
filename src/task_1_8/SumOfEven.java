package task_1_8;

public class SumOfEven {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int res = 0;
        boolean flag = false;
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0) {
                res += arr[j];
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("NO");
        } else {
            System.out.println(res);
        }
    }
}
