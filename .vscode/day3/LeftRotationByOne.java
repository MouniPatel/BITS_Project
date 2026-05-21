import java.util.Arrays;
public class LeftRotationByOne {
    public static void solution(int[] arr){
        int first = arr[0];
        for(int i = 0; i < arr.length-1;i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1]= first;

    }   
    public static void main(String[] args) {
        int[] arr = {-1,0,2,4,8,10};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
