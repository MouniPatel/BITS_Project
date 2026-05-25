import java.util.Scanner;
public class Case1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t,i;
        for(i = 0; i < n; i++){
            t = sc.nextInt();
            if((t&1)==0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }
        sc.close();
    }
}
    

