package Practice2;

public class WeightPriceValue2 {

    public static void main(String[] args) {

        // Product A and B values (Price in NOK and Weight in grams)
        float aPrice = 35.9f;
        float aWeight = 450f;
        float bPrice = 39.5f;
        float bWeight = 500f;
        double aValue = aPrice / aWeight;
        double bValue = bPrice / bWeight;

        if (aValue < bValue){
            System.out.println("Product A is cheapest by " + (bValue * 1000 - aValue * 1000) + "kr per Kg.");
        } if (aValue > bValue){
            System.out.println("Product B is cheapest by " + (aValue * 1000 - bValue * 1000) + "kr per Kg.");
        }else {
            System.out.println("Both products are the same price.");
        }
    }
}
