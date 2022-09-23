package Practice2;

public class WeightPriceValue {

    public static void main(String[] args) {

        // Product A and B values (Price in NOK and Weight in grams)
        float aPrice = 35.9f;
        float aWeight = 450f;
        float bPrice = 39.5f;
        float bWeight = 500f;
        double aValue = aWeight / aPrice;
        double bValue = bWeight / bPrice;

        // Print the answer
        if (aValue < bValue){
            System.out.println("Product A is cheapest.");
        }else if (aValue > bValue){
            System.out.println("Product B is cheapest.");
        } else{
            System.out.println("Both products are the same price.");
        }
    }
}
