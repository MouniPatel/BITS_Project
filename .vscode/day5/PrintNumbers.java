public class PrintNumbers {
    public static void func(int n){
         if(n == 0) return;
         func(n-2);
          System.out.print(n+ " ");
    }
    public static void main(String[] args){
        func(10);
    }
}
