package additional_problems_1_8_2;


public class DoubleFlip {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        int left = a;
        int right = b;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        left = c;
        right = d;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);

        }
    }
}

