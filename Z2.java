import java.lang.Math;
import java.util.Scanner;

class MathOperations{
    public static double calculateFirstExpression(){
        return (int)(((Math.sqrt(7)-1)/2)+(Math.pow(3,3)%2));
    }
    public static double calculateBd(int yr, int day, int mth){
        return (double) yr /(day*mth);
    }
    public static double calculateThirdExpression(){
        return ((3 + Math.sqrt(3))/((Math.sqrt(5)/2)/3) + 1);
    }
    public static double modOp(){
        return 144%5%3;
    }
    public static double nameOp(String surname, String name){
        return (((surname.length())%(name.length()) + 1)/Math.pow(2, (double) 1/4));
    }
}
public class Z2 {
    private static int woda(int a){
        return a*a;
    }

    private static final Scanner sc = new Scanner(System.in);
    private static String getUserInput(String message){
        System.out.print(message);
        return sc.nextLine();
    }

    private static int getUserNumber(String message){
        System.out.print(message);
        try {
            return sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Must be a number, I used instead default 69");
            return 69;
        }
    }

    private static void zad1(){
        System.out.println("23.0+76: " + (23.0 + 76));
        System.out.println("41*2.0+3: " + (41*2.0+3));
        System.out.println("5-33: " + (5-33));
        System.out.println("109%3: " + (109%3));
        System.out.println("50/2: " + (50/2));
        System.out.println("4|2: " + (4|2));
        System.out.println("3^5: " + (3^5));
        System.out.println("7&9: " + (7&9));
    }

    private static void zad2(){
        System.out.println((int) MathOperations.calculateFirstExpression());
        System.out.println((int) MathOperations.calculateBd(2004, 29, 9));
        System.out.println((int) MathOperations.calculateThirdExpression());
        System.out.println((int) MathOperations.modOp());
        System.out.println((int) MathOperations.nameOp("Malinowski", "Jakub"));
    }

    private static void zad3(){
        String a = getUserInput("Enter 1st word: ");
        String b = getUserInput("Enter 2nd word: ");
        System.out.println(a + " " + b);
    }

    private static void zad4(){
        int a = getUserNumber("Enter 1st number: ");
        int b = getUserNumber("Enter 2nd number: ");
        System.out.println("Sum: " + (a + b));
        System.out.println("Diff: " + (a - b));
        System.out.println("Prod: " + (a * b));
        if(b!=0) {
            System.out.println("Div: " + (a / b));
        } else {
            System.out.println("Not allowed");
        }
    }

    private static void zad5(){
        int a = getUserNumber("Enter number: ");
        System.out.println("Inced by 140: " + (a+140));
        System.out.println("Deced by 31: " + (a-31));
        System.out.println("Multiplied by 7: " + (a*7));
        System.out.println("Div by 13: " + (a/13));
        System.out.println("Modulo 7: " + (a%7));
        System.out.println("Div by 4 int part: " + ((int)(a/4)));
        System.out.println("To power of 45: " + (Math.pow(a, 45)));
        System.out.println("AND with 67: " + (a&67));
        System.out.println("OR with 59: " + (a|59));
        System.out.println("XOR with 23: " + (a^23));
        System.out.println("Shift left by 5: " + (a<<5));
        System.out.println("Shift right by 6: " + (a>>6));
    }
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Good luck");
        if(args.length==0) {
            System.out.println("\nZad1");
            zad1();
            System.out.println("\nZad2");
            zad2();
            System.out.println("\nZad3");
            zad3();
            System.out.println("\nZad4");
            zad4();
            System.out.println("\nZad5");
            zad5();
        } else {
            for (String arg : args) {
                switch (arg.toLowerCase()) {
                    case "zad1":
                        System.out.println("\nZad1");
                        zad1();
                        break;
                    case "zad2":
                        System.out.println("\nZad2");
                        zad2();
                        break;
                    case "zad3":
                        System.out.println("\nZad3");
                        zad3();
                        break;
                    case "zad4":
                        System.out.println("\nZad4");
                        zad4();
                        break;
                    case "zad5":
                        System.out.println("\nZad5");
                        zad5();
                        break;
                    default:
                        System.out.println("Invalid argument: " + arg);
                        break;
                }
            }
        }
    }
}