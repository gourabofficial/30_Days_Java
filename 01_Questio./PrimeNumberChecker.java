
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter the number to check if it is prime or not: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        } 
        if (count == 2) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    
    }
    
}
