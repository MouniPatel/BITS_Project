public class NullPointerHandling {
    @SuppressWarnings("null")
    
    public static void main(String[] args) {

        try {

            String str = null;

            System.out.println(str.length());

        } catch (NullPointerException e) {

            System.out.println("Null Pointer Exception handled");
        }

        System.out.println("Program continues...");
    }
}

