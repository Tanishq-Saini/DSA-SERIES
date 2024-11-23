import java.util.Scanner;

public class Fibonnaci {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = 0 , b = 1;
            int sum = 0;
            int n = sc.nextInt();
            System.out.print(a+" "+b+" ");
            int count = 3;
            while(count<=n){
                int temp = b;
                b = b + a;
                a = temp;
                count++;
                System.out.print(b+" ");
            }
        }
    }
