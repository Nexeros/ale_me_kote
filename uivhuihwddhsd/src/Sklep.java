import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Sklep {
    public ArrayList<Produkt> produkty = new ArrayList<>();
    String nazwaSklepu;
    long dataPowstania;

    public Sklep(ArrayList<Produkt> produkty, String nazwaSklepu, long dataPowstania) {
        ZonedDateTime now = LocalDate.now().atStartOfDay(ZoneId.systemDefault());
        long today = now.toInstant().toEpochMilli() * 1000;
        this.produkty = produkty;
        this.nazwaSklepu = nazwaSklepu;
        if(dataPowstania > today) {
            throw new IllegalArgumentException("dataPowstania in future");
        }
        this.dataPowstania = dataPowstania;
    }
    public boolean dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
        return true;
    }
    public void wyswietlOferty() {
        for( Produkt produkt : produkty ) {
            produkt.wyswietlInformacje();
        }
    }
    public Produkt wyszukajProdukt(String nazwaProduktu){
        for( Produkt produkt : produkty ) {
            if(Objects.equals(produkt._nazwa, nazwaProduktu)){
                return produkt;
            }
        }
        return null;
    }
    public void zakupy(Produkt produkt) {

    }
}
