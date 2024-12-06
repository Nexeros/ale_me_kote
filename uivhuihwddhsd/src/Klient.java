import java.util.ArrayList;
import java.util.Objects;

interface klient_{
    public String getImie();
    public void setImie(String imie);
    public String getNazwisko();
    public void setNazwisko(String nazwisko);
    public ArrayList<Zamowienie> getZamowienia();
    public void setZamowienia(ArrayList<Zamowienie> zamowienia);
    public boolean dodajZamowienie(Zamowienie z);
    public boolean wyswietlHistorieZamowien();
    public double obliczLacznyKosztZamowien();
}

public class Klient extends Osoba implements klient_ {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> zamowienia;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public ArrayList<Zamowienie> getZamowienia() {
        return zamowienia;
    }

    public void setZamowienia(ArrayList<Zamowienie> zamowienia) {
        this.zamowienia = zamowienia;
    }

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> zamowienia) {
        super(imie, nazwisko);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient klient = (Klient) o;
        return Objects.equals(imie, klient.imie) && Objects.equals(nazwisko, klient.nazwisko) && Objects.equals(zamowienia, klient.zamowienia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, zamowienia);
    }
}
