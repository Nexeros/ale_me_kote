public class Main {
    public static void main(String[] args) {
        BookDTO book = new BookDTO("Dziady", "Miskiewicz", 0, 1410);
        System.out.println(book);
        BookDTO book1 = new BookDTO("Kroniki Uwm", "Nieznany", 100, 0);
        System.out.println(book1);
        BookDTO book2 = new BookDTO("Biblia", "Tak", 10000, 40);
        System.out.println(book2);

        Address bartAddress = new Address("blotna", 10100, "niewiem");
        Person Bart = new Person("Bart", "Simson", -10, bartAddress);
        System.out.println(Bart);

        Car Alfa = new Car("Alfa", "Benzenegger", 1500);
        System.out.println(Alfa.fuelCost(6.78,78));

        BankAccount myAccount = new BankAccount("1218515635453", 0.45);
        //BankAccount myAccount1 = new BankAccount("");
        System.out.println(myAccount);
        MusicAlbum primoVictoria = new MusicAlbum("Primo Viactoria", "Sabaton", new double[]{5.0, 5.0, 3.0, 5.0});
        primoVictoria.deleteRate(3.0);
        primoVictoria.addRate(5.0);
        System.out.println(primoVictoria);
        RockAlbum newYear = new RockAlbum("New Year", "Abonded", new double[]{3.0, 4.5, 4.8}, "cos");
        System.out.println(newYear);
        Procssor Ryzen5 = new Procssor(3.6, 6, "Advanced Micro Devices");
        Computer myPC = new Computer("None", "None", Ryzen5);
        System.out.println(myPC);

    }
}