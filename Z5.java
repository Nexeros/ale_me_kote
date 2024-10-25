import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Z5 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<>();
        c.addAll(b);
        c.addAll(a);
        return c;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<>();
        int ii = 0;
        int i = 0;
        for (i = 0; i < a.size() && ii < b.size(); i++) {
            if(i%2 == 0) c.add(a.get(i));
            else c.add(b.get(ii));
            ii++;
        }
        if (i<a.size()) c.addAll(i, a);
        if (ii < b.size()) c.addAll(ii, b);
        return c;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c1 = append(b, a);
        c1.sort(Integer::compareTo);
        return c1;
    }

    public static ArrayList<String> toArrayList(String a) {
        ArrayList<String> c = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            c.add(String.valueOf(a.charAt(i)));
        }

        return c.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    }
    public static ArrayList<Integer> toArrayList(int a) {
        ArrayList<Integer> c = new ArrayList<>();
        String s = String.valueOf(a);
        for (int i = 0; i < s.length(); i++) {
            c.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        return c.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    }
    public static boolean checkChar(ArrayList<String> a, char c) {
        String s = String.valueOf(c);
        for(String b: a){
            if(b.equals(s) ) return true;
        }
        return false;
    }
    public static boolean checkDigit(ArrayList<Integer> a, int c) {
        for(int b: a){
            if(b == c ) return true;
        }
        return false;
    }
    public static int countChar(ArrayList<String> a, char c) {
        int count = 0;
        for(String b: a){
            if(b.equals(String.valueOf(c))) count++;
        }
        return count;
    }
    public static int countDigit(ArrayList<Integer> a, int c) {
        int count = 0;
        for(int b: a){
            if(b == c) count++;
        }
        return count;
    }
    public static ArrayList<ArrayList<String>> uniqueArrayList1(ArrayList<String> b){
        ArrayList<ArrayList<String>> c = new ArrayList<>();

        for(String a: b){
            ArrayList<String> c1 = new ArrayList<>();
            c1.add(a);
            c1.add("0");
            if(!c.contains(c1)) c.add(c1);
        }

        return c;
    }

    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> c = new ArrayList<>();
        for(int d: a){
            ArrayList<Integer> c1 = new ArrayList<>();
            c1.add(d);
            c1.add(0);
            if(!c.contains(c1)) c.add(c1);
        }
        return c;
    }

    public static ArrayList<ArrayList<String>> countArrayList1(ArrayList<String> a) {
        ArrayList<ArrayList<String>> c = new ArrayList<>();
        for(String b: a){
            ArrayList<String> c1 = new ArrayList<>();
            c1.add(b);
            c1.add(String.valueOf(countChar(a, b.charAt(0))));
            if(!c.contains(c1)) c.add(c1);
        }
        return c;
    }
    public static ArrayList<ArrayList<Integer>> countArrayList(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> c = new ArrayList<>();
        for(int d: a){
            ArrayList<Integer> c1 = new ArrayList<>();
            c1.add(d);
            c1.add(countDigit(a, d));
            if(!c.contains(c1)) c.add(c1);
        }
        return c;
    }



    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println(a);
        for (int i = 10; i > 1; i--) {
            b.add(i);
        }
        System.out.println(b);
        System.out.println("Zad1");
        ArrayList<Integer> c1 = append(a, b);
        System.out.println(c1);
        System.out.println("Zad2");
        ArrayList<Integer> c2 = merge(a, b);
        System.out.println(c2);
        System.out.println("Zad3");
        ArrayList<Integer> c3 = mergeSorted(a, b);
        System.out.println(c3);
        System.out.println("Zad4");
        String kot = "Ala ma kota ale kot nie ma ali oblicz mase slonca";
        ArrayList<String> c4 = toArrayList(kot);
        System.out.println(c4);
        System.out.println("Zad4b");
        ArrayList<Integer> c5 = toArrayList(1258741);
        System.out.println(c5);
        System.out.println("Zad5");
        System.out.println(checkChar(c4, 'a'));
        System.out.println("Zad5b");
        System.out.println(checkDigit(c5, 3));
        System.out.println("Zad6");
        System.out.println(countChar(c4, 'a'));
        System.out.println("Zad6b");
        System.out.println(countDigit(c5, 2));
        System.out.println("Zad7");
        ArrayList<ArrayList<String>> c6 = uniqueArrayList1(c4);
        System.out.println(c6);
        System.out.println("Zad7b");
        ArrayList<ArrayList<Integer>> c7 = uniqueArrayList(c2);
        System.out.println(c7);
        System.out.println("Zad8");
        ArrayList<ArrayList<String>> c8 = countArrayList1(c4);
        System.out.println(c8);
        System.out.println("Zad8b");
        ArrayList<ArrayList<Integer>> c9 = countArrayList(c5);
        System.out.println(c9);
        System.out.println("Dziekuje za uwagę");
    }

}
