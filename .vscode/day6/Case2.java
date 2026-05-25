public class Case2 {
    public void m2(String s){
        System.out.println("string version");
    }
    public void m2(Object o){
        System.out.println("onject version");

    }
    public static void main(String[] args){
        Case2 t = new Case2();
        t.m2(new Object());
        t.m2("Mouni");
        t.m2(null);
    }

}
