//Zad 5
public class UnitConverter implements Converter {
    double euroRate;
    double USDRate;
    String currency;

    public UnitConverter(double euroRate, double USDRate, String currency) {
        this.euroRate = euroRate;
        this.USDRate = USDRate;
        this.currency = currency;
    }

    @Override
    public double convertToEuro(double amount) {
        return (amount/USDRate)*euroRate;
    }

    @Override
    public double convertToUSD(double amount) {
        return (amount/euroRate)*USDRate;
    }

    @Override
    public double getConversionRate(String currency) {
        return (currency.equals(this.currency)) ? this.USDRate : this.euroRate;
    }
}
