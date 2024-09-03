
import java.util.Scanner;


public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int result = Sum_of_Digit(num);

        System.out.println("Sum of " +num+ " is : " +result);

    }

    public static int Sum_of_Digit(int n) {
        int sum = 0;
        while (n != 0) {
            int Lastdigit = n % 10;
            sum += Lastdigit;
            n = n / 10; 
        }
        return sum;

    }
}
