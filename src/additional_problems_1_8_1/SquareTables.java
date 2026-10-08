package additional_problems_1_8_1;

public class SquareTables {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        int[][] vasyaTable = new int[n][n];
        int[][] petyaTable = new int[n][n];

        int number = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                vasyaTable[row][col] = number;
                number++;
            }
        }

        number = 1;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                petyaTable[row][col] = number;
                number++;
            }
        }

        boolean first = true;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (vasyaTable[row][col] == petyaTable[row][col]) {
                    if (!first) {
                        System.out.print(" ");
                    }
                    System.out.print(vasyaTable[row][col]);
                    first = false;
                }
            }
        }
    }
}
