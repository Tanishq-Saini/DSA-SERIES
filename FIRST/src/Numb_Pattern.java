import java.util.Scanner;

public class Numb_Pattern {
    public static void main(String[] args) {
/*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
