import java.util.ArrayList;
import java.util.*;

public class Zamowienie {
    Map<Integer, String> statusy = new HashMap<Integer, String>();
    ArrayList<Produkt> koszyk = new ArrayList<>();
    int status;
    public Zamowienie(int status, ArrayList<Produkt> koszyk) {
        statusy.put(1, "Nie zrealizowane");
        statusy.put(2, "W trakcie realizacji");
        statusy.put(3, "Zrealizowane");
        this.status = status;
        this.koszyk = koszyk;
    }
    public boolean ustawStatus(int status) {
        return this.status == status;
    }
    public boolean ustawStatus(String status) {
        for (Map.Entry<Integer, String> entry : statusy.entrySet()) {
            if (entry.getValue().equals(status)) {
                this.status = entry.getKey();
                return true;
            }
        }
        return false;
    }
    public boolean wyswietlZamowienie(){
        try {
            System.out.println("Status: " + this.status + " " + statusy.get(this.status));
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
}
