package day8;
import java.util.*;
public class ArrayListMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //T no.of Test Cases;
        int t = sc.nextInt();
        for(int j = 0; j < t; j++){
            //SizeOfArrayList;
        int ArrLisSize = sc.nextInt();
        //ArrayList Declaration;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<ArrLisSize; i++){
            int val = sc.nextInt();
            arr.add(val);
        }
        System.out.println(Collections.max(arr));
    }
    sc.close();

    }
    
}
