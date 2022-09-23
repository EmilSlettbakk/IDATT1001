package Practice3;
import java.util.Scanner;

class Prime{

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Takes input from user and prints answer
    public static void main(String[] args){

        // Get integer input from user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number you want to check if is prime or not: ");
        int number = s.nextInt();

        // Control input before continuing
        if(number<0){
            System.out.println("Number must be positive!");
            System.exit(0);
        }

        /*
        Let user input new numbers to check
        End if input is
         */
        while (number!=0) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number!");
            } else {
                System.out.println(number + " is not a prime number!");
            }
            System.out.println("Enter another number to check or enter 0 to exit: ");
            number = s.nextInt();
        }
    }
}
