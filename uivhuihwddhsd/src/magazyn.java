import java.util.ArrayList;

public class magazyn {
    ArrayList<Produkt> Magazyn = new ArrayList();


    public magazyn(Produkt produkt) {
        this.Magazyn.add(produkt);
    }
    public void showMagazyn() {
        for(Produkt produkt : Magazyn) {
            produkt.wyswietlInformacje();
        }
    }
}
