package day8;
import java.util.*;
public class ArrayListDemo1{
    public static void main(String[] args){
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(1);
        arr.add(9);
        for(Integer a: arr){
        System.out.println(a);
        }
    }
    
}

