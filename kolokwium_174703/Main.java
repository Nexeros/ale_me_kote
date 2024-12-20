import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Elf elfAdam = new Elf("Adam", 12, "dbhfis");
        Elf elfBob = new Elf("Bob", 12, "dbhfis");
        elfBob.przedstawSie();
        ArrayList<Elf> elfs = new ArrayList<>();
        elfs.add(elfAdam);
        elfs.add(elfBob);
        Fabryka fabryka = new Fabryka(elfs, -170, 52);
        Elf elfpiotr = new Elf("Piotr", 12, "dbhfis");
        fabryka.dodajPracownika(elfpiotr);
        System.out.println(fabryka.toString());
        Renifer reniferAdam = new Renifer("Adam", 270);
        Renifer reniferBob = new Renifer("Bob", 370);
        ArrayList<Renifer> renifers = new ArrayList<>();
        renifers.add(reniferAdam);
        renifers.add(reniferBob);
        Sanie sanie = new Sanie(renifers);
        System.out.println(sanie.toString());
        System.out.println(sanie.najwolniejszyRenifer().toString());
        System.out.println(sanie.sumaPredkosci());
    }
}