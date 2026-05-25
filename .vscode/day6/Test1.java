public class Test1 {

    private int a = 10;
    public int b = 20;
    int c;
    protected int d;

    public int printA(){
       return this.a;
    }
    public void setA(int a){
    this.a = a;
    }
        public static void main(String[] args) {
            Test1 t = new Test1();
            t.setA(10);
            t.printA();
            System.out.println(t.d);
        
        }
    }