package Practice3;
import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args){

        // Get starting number from user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter starting number for table: ");
        int start = s.nextInt();

        // Get ending number from user
        Scanner e = new Scanner(System.in);
        System.out.println("Enter ending number for table: ");
        int end = e.nextInt();

        // Control input before continuing
        if (end < start) {
            System.out.println("Ending number must be higher than starting number!");
            System.exit(0);
        }

        Scanner r = new Scanner(System.in);
        System.out.println("Enter range of table: ");
        int range = r.nextInt();

        // Control input before continuing
        if (range<=0) {
            System.out.println("Range must be positive!");
            System.exit(0);
        }
        // Set range for multiplication table and print table location
        for(int i=start; i<=end; i++){
            System.out.println("Table: "+i);
            // Multiplies each table number up to 10 times and prints the calculation
            for(int j=1; j<=range; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
