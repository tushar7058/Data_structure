import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("The spiral order matrix is :");

        int rowstart = 0;
        int rowend = m - 1;

        int columnstart = 0;
        int columnend = n - 1;

        // to print spiral order
        while (rowstart <= rowend && columnstart <= columnend) {
            // 1
            for (int col = columnstart; col <= columnend; col++) {
                System.out.print(matrix[rowstart][col] + " ");
            }
            rowstart++;

            // 2
            for (int row = rowstart; row <= rowend; row++) {
                System.out.print(matrix[row][columnend] + " ");
            }
            columnend--;

            // 3
            for (int col = columnend; col >= columnstart; col--) {
                System.out.print(matrix[rowend][col] + " ");
            }
            rowend--;

            // 4
            for (int row = rowend; row >= rowstart; row--) {
                System.out.print(matrix[row][columnstart] + " ");
            }
            columnstart++;

            System.out.println();
        }
    }
}
