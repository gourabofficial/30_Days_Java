
import java.util.Scanner;

public class palindromChecker {

    public static void main(String[] args) {
        System.out.print("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       boolean result = palindrom(number);
       
        if (result) {
            System.out.println(number +" The number is palindrom");
        } else {
            System.out.println(number +" The number is not palindrom");
        }
    }

    public static boolean palindrom(int num) {
        
        int originalNumber = num;
        int reverseNumber = 0;
        while(num != 0){
            int remainder = num % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            num = num / 10;
        }

        return originalNumber== reverseNumber;  
    }
    

}
