import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> zamowienia;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> zamowienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zamowienia = zamowienia;
    }
    public boolean dodajZamowienie(Zamowienie z) {
        return zamowienia.add(z);
    }
    public boolean wyswietlHistorieZamowien(){
        try{
        for(Zamowienie z : zamowienia){
            System.out.println(z.wyswietlZamowienie());
        }
        return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public double obliczLacznyKosztZamowien(){
        try{
            double wynik = 0;
            for(Zamowienie z : zamowienia){
                for(Produkt produkt : z.koszyk){
                    wynik += produkt._cena;
                }
            }
            return wynik;
        } catch (Exception e){
            return 0;
        }
    }
}
