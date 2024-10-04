import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
    private static int woda(int a){
        return a*a;
    }
    private static void zad1(){
        System.out.println("Jakub Malinowski");
    }
    private static void zad2(){
        String imie = "Jakub Malinowski";
        System.out.println(imie.length()-1);
    }
    private static void zad3(){
        String kot = "Ala";
        String ala = "ma";
        String ma = "kota";
        String alamakota = kot + " " + ala + " " + ma;
        System.out.println(alamakota);
    }
    private static void zad4a(){
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* *\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* * *\n");
        for(int i = 0; i < 14; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i = 0; i < 15; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i = 0; i < 14; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* * *\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("* *\n");
        for(int i = 0; i < 20; i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
    }
    private static void zad4b(){
        int a = 5;
        int b = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }
            a--;
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            b++;
            System.out.print("\n");
        }
        a = 1;
        b = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }
            a++;
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            b--;
            System.out.print("\n");
        }
    }
    private static void zad5(){
        String ala = "Ala ma kota";
        System.out.println(ala.replace("a", "e"));
    }
    private static void zad6(){
        String ala = "Ala ma kota";
        System.out.println(ala.toUpperCase());
        System.out.println(ala.toLowerCase());
    }
    private static void zad7(){
        System.out.println((int) 'A');
        System.out.println((int) '!');
        System.out.println((int) '@');
        System.out.println((int) '>');
        System.out.println((int) '~');
        System.out.println((int) '\n');
        System.out.println((int) '\b');

    }
    private static void zad8(){
        System.out.println("Duże litery w tablicy ascii: " + (int) 'A' + " - " + (int) 'Z');
        System.out.println("Małe litery w tablicy ascii: " + (int) 'a' + " - " + (int) 'z');
        System.out.println("Liczby w tablicy ascii: " + (int) '0' + " - " + (int) '9');
    }
    private static void zad9(){
        String zdanie = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mino, że jego ... na to nie wskazuje.";
        zdanie = zdanie.substring(0, zdanie.indexOf(".")) + "dziekan" + zdanie.substring(zdanie.indexOf(".") + 3);
        zdanie = zdanie.substring(0, zdanie.indexOf(".")) + "łowcą" + zdanie.substring(zdanie.indexOf(".") + 3);
        zdanie = zdanie.substring(0, zdanie.indexOf(".")) + "wygląd" + zdanie.substring(zdanie.indexOf(".") + 3);
        System.out.println(zdanie);
    }
    private static void zad10(){
        String zdanie = "...to najlepsza książka napisana przez ...";
        zdanie = zdanie.substring(0, zdanie.indexOf(".")) + "Biblia " + zdanie.substring(zdanie.indexOf(".") + 3);
        zdanie = zdanie.substring(0, zdanie.indexOf(".")) + "Boga.";
        System.out.println(zdanie);
    }
    private static void zad11(){
        for(int i = 0; i < 5; i++){
            System.out.print("wodrze");
        }
        System.out.print("\n");
    }
    private static void zad12(){
        System.out.println("Dzisiaj jest " + LocalDate.now() + " godzina " + LocalTime.now());
    }
    private static void zad13(){
        System.out.println(Character.toString((char) 54));
        System.out.println(Character.toString((char) 103));
        System.out.println(Character.toString((char) 241));
        System.out.println(Character.toString((char) 67));
        System.out.println(Character.toString((char) 9999));
        String imie = "Jakub Malinowski";
        System.out.println(Character.toString((char) imie.length()-1));
        System.out.println(Character.toString((char) 174703));
    }
    public static void main(String[] args) {
        System.out.println("\nZad1");
        zad1();
        System.out.println("\nZad2");
        zad2();
        System.out.println("\nZad3");
        zad3();
        System.out.println("\nZad4a");
        zad4a();
        System.out.println("\nZad4b");
        zad4b();
        System.out.println("\nZad5");
        zad5();
        System.out.println("\nZad6");
        zad6();
        System.out.println("\nZad7");
        zad7();
        System.out.println("\nZad8");
        zad8();
        System.out.println("\nZad9");
        zad9();
        System.out.println("\nZad10");
        zad10();
        System.out.println("\nZad11");
        zad11();
        System.out.println("\nZad12");
        zad12();
        System.out.println("\nZad13");
        zad13();
    }
}