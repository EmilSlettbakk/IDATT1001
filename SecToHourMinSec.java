package Practice1;

import java.util.Scanner;

/**
 * This class represents...
 * @author emilslettbakk
 * @version 1.0
 */
public class SecToHourMinSec {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        final int MINUTE_IN_HOUR = 60;
        final int SECOND_IN_MINUTE = 60;
        int second;
        int minute;
        int hour;

        System.out.print("Enter seconds: ");
        second = console.nextInt();

        minute = second / SECOND_IN_MINUTE;
        second -= minute * SECOND_IN_MINUTE;

        hour = minute / MINUTE_IN_HOUR;
        minute -= hour * MINUTE_IN_HOUR;

        System.out.println("The time is: " + hour + ":" + minute + ":" + second);

    }
}

