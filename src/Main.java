import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,aci ;
        double cevre , alan ,alan2;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Lutfen dairenin yari capini giriniz:");
        r=inp.nextInt();
        alan= pi * r* r;
        cevre=2* pi*r;
        System.out.println("lutfen merkez aci olcusunu girin :");
        aci=inp.nextInt();
        System.out.println("Dairenin Alani = " + alan);
        System.out.println("Dairenin Cevresi = " +cevre);
        alan2=(pi*(r*r)*aci)/360;
        System.out.println("Yaricapi " + r + " olan "+ aci + " merkez acili daire diliminin alani = " +alan2);



    }
}
