public class Main {
    public static void main(String[] args) {
        System.out.println("Goodbye world!");
        //Zad 1
        System.out.println("\nZad 1");
        Car auto = new Car("Dodge", "Chellenger", 3);
        System.out.println(auto);
        //Zad 2
        System.out.println("\nZad 2");
        Hammer piotr = new Hammer("Piotr", 1543);
        piotr.use();
        System.out.println(piotr);
        Screwdriver krzysztof = new Screwdriver("Krzysztof", 2021);
        krzysztof.use();
        System.out.println(krzysztof);
        Saw antoni = new Saw("Antoni", 2020);
        antoni.use();
        System.out.println(antoni);
        //Zad 3
        System.out.println("\nZad 3");
        Sensor at12b3 = new TemperatureSensor(1945.987, "Error");
        System.out.println(at12b3);
        System.out.println(at12b3.readValue());
        System.out.println(at12b3.getStatus());
        at12b3.reset();
        System.out.println(at12b3);
        Sensor ap10a1 = new PressureSensor(1014.35, "Working");
        System.out.println(ap10a1);
        System.out.println(ap10a1.readValue());
        System.out.println(ap10a1.getStatus());
        ap10a1.reset();
        System.out.println(ap10a1);
        //Zad 4
        System.out.println("\nZad 4");
        Triple anything = new Triple("Anything", 1014.35, "Working");
        System.out.println(anything.getFirst());
        System.out.println(anything.getSecond());
        System.out.println(anything.getThird());
        //Zad 5
        System.out.println("\nZad 5");
        Converter kantor = new CurrencyConverter(4.45, 3.98, "Peso");
        System.out.println(kantor.convertToEuro(1000));
        System.out.println(kantor.convertToUSD(2000));
        System.out.println(kantor.getConversionRate("USD"));
        System.out.println(kantor.getConversionRate("EUR"));
        Converter liczydloPanaMietka = new UnitConverter(4.45, 3.98, "USD");
        System.out.println(liczydloPanaMietka.convertToEuro(1000));
        System.out.println(liczydloPanaMietka.convertToUSD(2000));
        System.out.println(liczydloPanaMietka.getConversionRate("USD"));
        System.out.println(liczydloPanaMietka.getConversionRate("EUR"));
        //Zad 6
        System.out.println("\nZad 6");
        System.out.println(isEqualOrNull("Dodge", "Chellenger"));
        System.out.println(isEqualOrNull(5, 5));
        System.out.println(isEqualOrNull(null, "Chellenger"));
        System.out.println(isEqualOrNull(null, null));

    }
    //Zad 6
    public static <T> Boolean isEqualOrNull(T first, T second){
        if(first == null && second == null) return true;
        if(first == null || second == null) return false;
        return first.equals(second);
    }
}