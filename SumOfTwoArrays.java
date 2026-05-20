import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int sum[] = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum of two arrays:");

        for (int i = 0; i < n; i++) {
            System.out.print(sum[i] + " ");
        }
    }
}