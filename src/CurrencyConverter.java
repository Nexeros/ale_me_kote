//Zad 5
public class CurrencyConverter implements Converter {

    double euroRate;
    double USDRate;
    String currency;

    public CurrencyConverter(double euroRate, double USDRate, String currency) {
        this.euroRate = euroRate;
        this.USDRate = USDRate;
        this.currency = currency;
    }

    @Override
    public double convertToEuro(double amount) {
        return amount * euroRate;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * USDRate;
    }

    @Override
    public double getConversionRate(String currency) {
        return (currency.equals("USD")) ? this.USDRate : this.euroRate;
    }
}
