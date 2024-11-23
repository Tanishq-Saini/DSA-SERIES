import java.util.Arrays;

public class second_largest {
    public static void main(String[] args) {
        int[] arr = {12,35,10,34,1};
        String s = "Geeks";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());
        int second = largest(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(second);
    }

    public static int largest(int[] arr){
        Arrays.sort(arr);
        int max = arr[0];
        int index = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(index);
        return Double.;
    }
}
