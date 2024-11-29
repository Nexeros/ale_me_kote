public class Adres {
     String ulica;
     int numerDomu;
     int numerMieszkania;
     String miasto;
     int kodPocztowy;

    public Adres(int kodPocztowy, String miasto, String ulica, int numerMieszkania, int numerDomu) {
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.numerMieszkania = numerMieszkania;
        this.numerDomu = numerDomu;
        this.ulica = ulica;
    }

    public Adres(int kodPocztowy, String miasto, String ulica, int numerDomu) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz(){
        System.out.println("\nAdres: " + this.kodPocztowy + this.miasto);
        if (this.numerMieszkania != 0) {
            System.out.println("Mieszkanie: " + this.ulica + this.numerDomu);
        } else {
            System.out.println("Mieszkanie: " + this.ulica + this.numerDomu + this.numerMieszkania);
        }
    }
    public boolean przed(Adres adres1, Adres adres2){
        return adres1.kodPocztowy < adres2.kodPocztowy;
    }

}
