package Practice1;

import java.util.Scanner;

public class InchesToCm {

    public static void main(String[] args) {

        // convert inches to cm
        Scanner s = new Scanner(System.in);

        System.out.println("Skriv ønsket tommer å konvertere.");

        double inches = s.nextDouble();
        double centimeters = inches * 2.54;

        s.close();

        System.out.println(inches + " tommer er lik " + centimeters + "cm");
    }
}
