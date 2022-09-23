package Practice1;

import java.util.Scanner;

public class HourMinSecToSec {

    public static void main(String[] args) {

        // Get hours
        Scanner tidH = new Scanner(System.in);
        System.out.println("Skriv antall timer: ");
        int hours = tidH.nextInt();

        // Get minutes
        Scanner tidM = new Scanner(System.in);
        System.out.println("Skriv antall minutter: ");
        int minutes = tidM.nextInt();

        // Get seconds
        Scanner tidS = new Scanner(System.in);
        System.out.println("Skriv antall sekunder: ");
        int seconds = tidS.nextInt();

        // Calculate total seconds
        int total = hours * 3600 + minutes * 60 + seconds;

        // Print answer
        System.out.println(hours + " timer, " + minutes + " minutter og " + seconds + " sekunder er lik " + total + " sekunder!");
    }
}
