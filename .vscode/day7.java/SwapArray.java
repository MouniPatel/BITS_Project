import java.util.Scanner;
public class SwapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.print("Enter k value: ");
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int temp = arr[i];
            arr[i] = arr[n - k + i];
            arr[n - k + i] = temp;
        }

        System.out.println("Array after swapping:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
} 
