import java.util.Scanner;
public class PowerOfFour {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if (n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0) {
                System.out.println(n + " is Power of 4");
            } else {
                System.out.println(n + " is Not Power of 4");
            }
        }

        sc.close();
    }
}
