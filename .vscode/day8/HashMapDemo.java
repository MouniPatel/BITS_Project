package day8;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer>map = new HashMap<>();
        map.put("Mouni",99);
        map.put("Kiran",86);
        map.put("Sai",79);
        map.put("Akshitha",87);
        for(String c : map.keySet()){
            if(map.get(c)==86)
            System.out.println(c);
        }
    }
}
