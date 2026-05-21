import java.util.Scanner;

public class SumOfDiagonalsInTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Find sums of diagonals
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }

        // Print results
        System.out.println("Sum of Primary Diagonal = " + primaryDiagonalSum);
        System.out.println("Sum of Secondary Diagonal = " + secondaryDiagonalSum);
        sc.close();
    }
}