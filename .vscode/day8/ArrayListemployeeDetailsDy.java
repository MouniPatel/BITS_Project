package day8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ArrayListemployeeDetailsDy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> emd = new ArrayList<>();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            emd.add(name);
        }
        LinkedHashSet<String> lhs = new LinkedHashSet<>(emd);
        System.out.println("Employee Names Without Duplicates:");
        System.out.println(lhs);
        sc.close();
    }
}