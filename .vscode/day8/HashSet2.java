package day8;
import java.util.*;
public class HashSet2 {
    public static void main(String[] args) {
    HashSet<Integer>s1=new HashSet<>();
    s1.add(1);
    s1.add(9);
    s1.add(5);
    s1.add(4);
    HashSet<Integer> s2 = new HashSet<>();
    s2.add(9);
    s2.add(6);
    s2.add(7);
    s2.add(4);
    s1.retainAll(s2);
    System.out.println(s1);
    }
}