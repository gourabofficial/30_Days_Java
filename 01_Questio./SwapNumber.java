
import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Swap(a, b);
        System.out.println("Before swaping: a = " + a + " b = " + b);

    }

    public static void Swap(int a, int b) {

        //Swap number xor operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swaping: a = " + a + " b = " + b);

    }
}
