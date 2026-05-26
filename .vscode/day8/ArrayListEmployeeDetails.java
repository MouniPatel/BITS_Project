package day8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public class ArrayListEmployeeDetails {
    public static void main(String[] args) {
        ArrayList<String> emd = new ArrayList<>();
        emd.add("Mounika");
        emd.add("Roopa");
        emd.add("Roopa");
        LinkedHashSet<String>lhs = new LinkedHashSet<>(emd);
        System.out.println(lhs);
    }
    
}
