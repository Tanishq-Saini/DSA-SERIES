import java.util.Arrays;
import java.util.Scanner;

public class SUM_IN_ARRAY {
    public static void main(String[] args) {
        int[] arr = {2,7,11,5};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] index = Sum(arr , target);
        System.out.println(Arrays.toString(index));
    }
    public static int[] Sum(int[] arr,int target){
        for(int i = 0 ; i <= arr.length ; i++){
            for(int j = i+1 ; j <= arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
