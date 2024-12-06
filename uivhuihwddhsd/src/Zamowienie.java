import java.util.ArrayList;
import java.util.*;

public class Zamowienie {
    Map<Integer, String> statusy = new HashMap<Integer, String>();
    ArrayList<Produkt> koszyk = new ArrayList<>();
    int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<Produkt> getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(ArrayList<Produkt> koszyk) {
        this.koszyk = koszyk;
    }

    public Map<Integer, String> getStatusy() {
        return statusy;
    }

    public void setStatusy(Map<Integer, String> statusy) {
        this.statusy = statusy;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zamowienie that = (Zamowienie) o;
        return status == that.status && Objects.equals(statusy, that.statusy) && Objects.equals(koszyk, that.koszyk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusy, koszyk, status);
    }
}
