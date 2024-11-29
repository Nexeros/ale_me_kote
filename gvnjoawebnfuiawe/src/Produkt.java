public class Produkt {
    String _nazwa;
    double _cena;
    int _iloscNaMagazynie;
    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        _nazwa = nazwa;
        _cena = cena;
        _iloscNaMagazynie = iloscNaMagazynie;
    }
    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + _nazwa);
        System.out.println("Cena: " + _cena);
        System.out.println("Ilosc na Magazynie: " + _iloscNaMagazynie);
    }
    public boolean DodajDoMagazynu(int ilosc){
        try{
            this._iloscNaMagazynie += ilosc;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
    public boolean UsunZMagazynu(int ilosc) {
        try {
            if (_iloscNaMagazynie > ilosc) {
                _iloscNaMagazynie-=ilosc;
                return true;
            }
            return false;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
