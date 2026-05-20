import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        n = sc.nextInt();

        System.out.println("First " + n + " natural numbers are:");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}