package task_1_8;

public class NegativeElementsToTheBeginning {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
