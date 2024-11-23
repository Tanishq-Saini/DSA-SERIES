import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextInt();
        float faren = ((float) (1 * c * 9) /5) + 32;
        System.out.println("In Farenheit "+faren);
        c = ((faren) - 32) * 5 / 9;
        System.out.println("In Celcius "+c);
    }
}
