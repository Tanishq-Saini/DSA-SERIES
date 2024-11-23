public class Largest_in_array {
    public static void main(String[] args) {
        int[] arr = {2,7,11,5};
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        System.out.println("Maximum in Array "+max);
        System.out.println("Minimum in Array "+min);
    }
}
