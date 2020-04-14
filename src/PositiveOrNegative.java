import java.util.Scanner;

public class PositiveOrNegative {
    public static void main (String[] args) {
        int num = 0;        //assumes they're not entering decimals
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num > 0 ) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is equal to 0");
        }
    }
}
