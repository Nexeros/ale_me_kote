import java.util.ArrayList;
public class Z6 {
    public static void main(String[] args) {
        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(new Produkt("koks", 105.4, 100));
        produkty.add(new Produkt("mial", 15.45, 10));
        produkty.add(new Produkt("olej", 1005.44, 1000));
        produkty.add(new Produkt("papier", 5.99, 10000));
        produkty.add(new Produkt("migdaly", 25.99, 100));
        KoszykZakupowy koszyk = new KoszykZakupowy(produkty);
        koszyk.dodajProdukt("koks", 10);
        koszyk.dodajProdukt("mial", 15);
        koszyk.dodajProdukt("olej", 100);
        koszyk.wyswietlzawartoscKoszyka();
        System.out.println(koszyk.obliczCalkowitaWartosc());
        Zamowienie zamowienie = new Zamowienie(1, koszyk.koszyk);
        zamowienie.ustawStatus(2);
        zamowienie.wyswietlZamowienie();
        zamowienie.ustawStatus("Zrealizowane");
        zamowienie.wyswietlZamowienie();
    }
}
