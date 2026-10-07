package task_1_8;

public class AverageOfTheOdd {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 != 0) {
                sum += arr[j];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NO");
        } else {
            double avg = (double) sum / count;
            System.out.printf("%.2f%n", avg);
        }
    }
}
