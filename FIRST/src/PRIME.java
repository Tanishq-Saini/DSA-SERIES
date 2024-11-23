import java.util.Scanner;

public class PRIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n <= 1){
            System.out.println("Neither Prime nor composite");
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                System.out.println("Not Prime");
                break;
            }
            c = c + 1;
        }
        System.out.println("The number "+n+" is Prime");
    }
}
