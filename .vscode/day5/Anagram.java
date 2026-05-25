import java.util.Arrays;

public class Anagram{

    public static void main(String[] args) {

        String str1 = "anagram";
        String str2 = "gram";

        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert strings into character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The given strings are Anagrams");
        } else {
            System.out.println("The given strings are not Anagrams");
        }
    }
}
