import java.util.Scanner;
public class Case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n > 0 && (n & (n - 1)) == 0) {
                System.out.println(n + " is Power of 2");
            } else {
                System.out.println(n + " is Not Power of 2");
            }
        }

        sc.close();
    }
}