package day8;
import java.util.*;
public class HashMapCharArray {
    public static void main(String[] args) {
        String s = "Programming";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
    
}
