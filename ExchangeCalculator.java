package Practice4;
import java.util.Scanner;

public class ExchangeCalculator {

    // Creates list with [x] currencies
    private static Currency[] currency = new Currency[3];

    // Currency list
    public static void main(String[] args) {
        currency[0] = new Currency(10.25f, "USD");
        currency[1] = new Currency(10.27f, "EUR");
        currency[2] = new Currency(0.95f, "SEK");

        System.out.println("Welcome to the exchange calculator!");

        menu();
    }

    // Lets user choose which currency to calculate
    private static void menu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for USD");
        System.out.println("Enter 2 for EUR");
        System.out.println("Enter 3 for SEK");
        System.out.println("Enter 4 to exit");
        int menuInput = s.nextInt();

        // Checks if input is valid
        if (menuInput == 4) {
            System.out.println("Exiting calculator...");
            System.exit(0);
        } else if (menuInput != 1 && menuInput != 2 && menuInput != 3) {
            System.out.println("Please enter a number between 1 and 4!");
            menu();
        } else {
            calculator(menuInput);
        }
    }

    /*
    Lets user choose currency amount
    Calls to calculate method in Currency class to calculate user inputs
     */
    private static void calculator(int currencyType) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter currency amount: ");
        float amount = a.nextFloat();

        if (amount < 0 || amount > 9999999999L) {
            System.out.println("Please enter a valid number!");
            menu();

        } else {
            System.out.println(Currency.calculate(amount, currency[currencyType - 1]));

            System.out.println("Done");
            menu();
        }
    }
}
