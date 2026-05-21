public class StringBufferConstructors {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        sb.append("12345678912345678");
        System.out.println(sb.capacity() + " " +sb.length());

    }
}
