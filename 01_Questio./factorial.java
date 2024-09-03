import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        System.out.print("Enter a Number for factorial: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = factorial_calculate(number);
        System.out.println("Factorial of " + number + " is: " + result);
        
    }

    public static int factorial_calculate(int n ){

        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }

       return factorial; 
    }
    
 
}
 
