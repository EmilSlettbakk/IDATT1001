package Practice4;

public class Currency {

    private float exchangeRate;
    private String currencyName;

    // Conductor for gathering user chosen currency and the exchange rate for chosen currency
    public Currency(float rate, String name){
        exchangeRate = rate;
        currencyName = name;
    }

    // Calculates amount of NOK from chosen currency using exchange rate
    public static String calculate(float amount, Currency currency){
        float sum;
        sum = currency.exchangeRate * amount;
        java.util.Formatter f = new java.util.Formatter();
        f.format("%.2f", sum);
        return amount + " " + currency.currencyName + " equals to " + sum + " NOK.";
    }
}
