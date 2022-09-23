package Practice5;


public class FractionCalculator {

    private Double numerator, denominator, numResult, denomResult;
    private String result, output;

    //Constructor input that satisfy conditions
    public FractionCalculator(double numerator,double denominator){
        if (denominator == 0){
            throw new IllegalArgumentException("Denominator can not be equal to 0!");
        } else{
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    //Constructor for denominator == 0
    public FractionCalculator(double numerator){
        this.numerator = numerator;
        this.denominator = 1.0;
    }

    //Method for fraction addition saves result in this.result and this.output
    public void addition(FractionCalculator a){
        double numResult = (this.numerator * a.denominator) + (a.numerator * this.denominator);
        double denomResult = this.denominator * a.denominator;
        String result = numResult + "/" + denomResult;
        this.numResult = numResult;
        this.denomResult = denomResult;
        this.result = result;
        this.output = "(" + this.numerator + "/" + this.denominator + ") + (" + a.numerator + "/" + a.denominator + ")";
    }

    //Method for fraction subtraction saves result in this.result and this.output
    public void subtraction(FractionCalculator a) {
        double numResult = (this.numerator * a.denominator) - (a.numerator * this.denominator);
        double denomResult = this.denominator * a.denominator;
        String result = numResult + "/" + denomResult;
        this.numResult = numResult;
        this.denomResult = denomResult;
        this.result = result;
        this.output = "(" + this.numerator + "/" + this.denominator + ") - (" + a.numerator + "/" + a.denominator + ")";
    }

    //Method for fraction multiplication saves result in this.result and this.output
    public void multiplication(FractionCalculator a) {
        double numResult = this.numerator * a.numerator;
        double denomResult = this.denominator * a.denominator;
        String result = numResult + "/" + denomResult;
        this.numResult = numResult;
        this.denomResult = denomResult;
        this.result = result;
        this.output = "(" + this.numerator + "/" + this.denominator + ") * (" + a.numerator + "/" + a.denominator + ")";
    }

    //Method for fraction division saves result in this.result and this.output
    public void division(FractionCalculator a) {
        double numResult = this.numerator * a.denominator;
        double denomResult = this.denominator * a.numerator;
        String result = numResult + "/" + denomResult;
        this.numResult = numResult;
        this.denomResult = denomResult;
        this.result = result;
        this.output = "(" + this.numerator + "/" + this.denominator + ") / (" + a.numerator + "/" + a.denominator + ")";
    }

    //Gets calculation and result and returns it ready to print
    public String getResult(){
        return this.output + " = " + this.result;
    }

    //Main method for giving values and executing calculations
    public static void main(String[] args){

        //Set values for first and second fractions
        FractionCalculator a, b;
        try {
            a = new FractionCalculator(22, 13);
        } catch(IllegalArgumentException e){
            System.out.println(e);
            a = new FractionCalculator(1);
        }
        try {
            b = new FractionCalculator(34, 6);
        } catch(IllegalArgumentException e){
            System.out.println(e);
            b = new FractionCalculator(1);
        }
        // Runs addition calculation and prints answer
        a.addition(b);
        System.out.println(a.getResult());
        // Runs subtraction calculation and prints answer
        a.subtraction(b);
        System.out.println(a.getResult());
        // Runs multiplication calculation and prints answer
        a.multiplication(b);
        System.out.println(a.getResult());
        // Runs division calculation and prints answer
        a.division(b);
        System.out.println(a.getResult());
    }
}
