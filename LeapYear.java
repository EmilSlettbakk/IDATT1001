package Practice2;

import java.util.Scanner;

public class LeapYear {

    // Constants for calculation
    final static int yearDiv = 4;
    final static int yearDivCond = 100;
    final static int yearHundredDiv = 400;


    public static void main(String[] args) {

        // Get year input
        Scanner s = new Scanner(System.in);
        System.out.println("Type the year you want to check: ");
        int year = s.nextInt();
        s.close();

        // Check if input is a leap year or not
        boolean isLeapYear = ((year % yearDiv == 0) && (year % yearDivCond != 0) || (year % yearHundredDiv == 0));

        // Print answer
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else{
            System.out.println(year + " is not a leap year.");
        }
    }
}


