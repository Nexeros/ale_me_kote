import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Z4 {
    public static List<Integer> GenerujTablice (int n, int minWartosc, int maxWartosc) {
        List<Integer> tablica = new ArrayList<Integer>();
        for(int c = 0; c < n; c++) {
            tablica.add(ThreadLocalRandom.current().nextInt(minWartosc, maxWartosc+1));
        }
        return tablica;
    }
    public static void wypiszTablice(int[][] tablica, int n, int m) {
        for(int c = 0; c < n; c++) {
            for(int d = 0; d < m; d++) {
                if(tablica.length > c && tablica[c].length > d) {
                    System.out.print(tablica[c][d] + " ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int counted(int[] tab, int n){
        int count = 0;
        for(int c: tab){
            if(c == n) count++;
        }
        return count;
    }

    public static int ileNieparzystych(int[] tab){
        int count = 0;
        for(int c: tab){
            if(c%2!=0) count++;
        }
        return count;
    }
    public static int ileParzystych(int[] tab){
        int count = 0;
        for(int c: tab){
            if(c%2==0) count++;
        }
        return count;
    }
    public static int ileDodatnich(int[] tab){
        int count = 0;
        for(int c: tab){
            if(c>0) count++;
        }
        return count;
    }
    public static int ileUjemnych(int[] tab){
        int count = 0;
        for(int c: tab){
            if(c<0) count++;
        }
        return count;
    }
    public static int ileZerowych(int[] tab){
        int count = 0;
        for(int c: tab){
            if(c==0) count++;
        }
        return count;
    }
    public static int ileMaxymalnych(int[] tab){
        Arrays.sort(tab);
        return counted(tab, tab[tab.length-1]);
    }
    public static int ileMinimalnych(int[] tab){
        Arrays.sort(tab);
        return counted(tab, tab[0]);
    }
    public static int ileUnikalnych(int[] tab){
        int counting = 0;
        for(int c: tab){
            if(counted(tab, c) == 1) counting++;
        }
        return counting;
    }
    public static int sumaDodatnich(int[] tab){
        int sum = 0;
        for(int c: tab){
            if(c>0) sum+=c;
        }
        return sum;
    }
    public static int sumaUjemnych(int[] tab){
        int sum = 0;
        for(int c: tab){
            if(c<0) sum+=c;
        }
        return sum;
    }
    public static int sumaDOdwrotnosci(int[] tab){
        int sum = 0;
        for(int c: tab){
            if(c!= 0) sum+=(1/c);
        }
        return sum;
    }
    public static double sredniaArytmetyczna(int[] tab){
        int sum = 0;
        int l = tab.length;
        for(int c: tab){
            sum+=c;
        }
        return sum/(double)l;
    }
    public static double sredniaGeometryczna(int[] tab){
        int ilo = 1;
        int l = tab.length;
        for(int c: tab){
            ilo*=c;
        }
        return Math.pow(ilo, 1/(double)l);
    }
    public static double sredniaHarmoniczna(int[] tab){
        double sum = 0;
        int l = tab.length;
        for(int c: tab){
            if(c!=0)sum+=(1/(double)c);
        }
        if(sum!=0) return (double)l/sum;
        else return 0;
    }
    public static double[] funkcjaLiniowa(int[] tab, int a, int b){
        double[] r = new double[tab.length];
        for(int i = 0; i<tab.length; i++){
            r[i] = tab[i]*a + b;
        }
        return r;
    }
    public static double[] funkcjaKwadratowa(int[] tab, int a, int b, int c){
        double[] r = new double[tab.length];
        for(int i = 0; i<tab.length; i++){
            r[i] = tab[i]*(Math.pow(a, 2)) + b*a + c;
        }
        return r;
    }
    public static double[] funkcjaWykladnicza(int[] tab, int a){
        double[] r = new double[tab.length];
        for(int i = 0; i<tab.length; i++){
            r[i] = Math.pow(a, tab[i]);
        }
        return r;
    }

    public static double[] funkcjaSignum(int[] tab){
        double[] r = new double[tab.length];
        for(int i = 0; i<tab.length; i++){
            if(tab[i]<0) r[i] = -1;
            else if(tab[i]>0) r[i] = 1;
            else r[i] = 0;
        }
        return r;
    }



    public static void main(String[] args) {
        System.out.println("Hello world!");
        //for(int i : GenerujTablice(10, 5, 10)) {
        //    System.out.println(i);
        //}
        //int[][] tab = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //wypiszTablice(tab, 10, 10);
        List<Integer> list = GenerujTablice(10, 0, 10);
        int[] tab1 = new int[list.size()];
        for(int i = 0; i < list.size(); i++) tab1[i] = list.get(i);
        for(int a: tab1) System.out.print(a + " ");
        System.out.println("Zad3");
        System.out.println("Nieparzyste: " + ileNieparzystych(tab1));
        System.out.println("Parzyste: " + ileParzystych(tab1));
        System.out.println("Dodatnie: " + ileDodatnich(tab1));
        System.out.println("Ujemne: " + ileUjemnych(tab1));
        System.out.println("Zerowe: " + ileZerowych(tab1));
        System.out.println("Maxymalne: " + ileMaxymalnych(tab1));
        System.out.println("Minimalne: " + ileMinimalnych(tab1));
        System.out.println("Unikalne: " + ileUnikalnych(tab1));
        System.out.println("Zad4");
        System.out.println("Suma dodatnich: " + sumaDodatnich(tab1));
        System.out.println("Suma ujemnych: " + sumaUjemnych(tab1));
        System.out.println("Suma odwrotności: " + sumaDOdwrotnosci(tab1));
        System.out.println("Srednia arytmetyczna: " + sredniaArytmetyczna(tab1));
        System.out.println("Średnia geometryczna: " + sredniaGeometryczna(tab1));
        System.out.println("Średnia harmoniczna: " + sredniaHarmoniczna(tab1));

    }

}