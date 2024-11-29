import java.util.ArrayList;
public class KoszykZakupowy {
    ArrayList<Produkt> produkty;
    ArrayList<Produkt> koszyk = new ArrayList<>();
    public KoszykZakupowy(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
    }
    public boolean dodajProdukt(String nazwa, int ile) {
        try{
            boolean wynik = false;
            for(Produkt produkt : produkty){
                if(produkt._nazwa.equals(nazwa) && produkt.UsunZMagazynu(ile)){
                    Produkt produkt2 = new Produkt(produkt._nazwa, produkt._cena, ile);
                    koszyk.add(produkt2);
                    if(produkt._iloscNaMagazynie == 0) produkty.remove(produkt);
                    wynik = true;
                }
            }
            return wynik;

        } catch (Exception e) {
            return false;
        }
    }
    public boolean wyswietlzawartoscKoszyka(){
        try {
            for (Produkt produkt : koszyk) {
                System.out.println("Nazwa: " + produkt._nazwa);
                System.out.println("Cena: " + produkt._cena);
                System.out.println("Ilosc: " + produkt._iloscNaMagazynie);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public double obliczCalkowitaWartosc(){
        try {
            double wynik = 0;
            for (Produkt produkt : koszyk) {
                wynik += produkt._cena;
            }
            return wynik;
        } catch (Exception e) {
            return 0;
        }
    }
}
