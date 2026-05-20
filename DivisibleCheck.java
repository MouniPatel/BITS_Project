import java.util.Scanner;
public class DivisibleCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("zoom");
        }
        else if (num % 3 == 0) {
            System.out.println("zip");
        }
        else if (num % 5 == 0) {
            System.out.println("jap");
        }
        else {
            System.out.println("It is not divisible by 3 and 5");
        }

        sc.close();
    }
}