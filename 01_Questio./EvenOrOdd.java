
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for checking: ");
        int number = sc.nextInt();

        if ((number & 1) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
