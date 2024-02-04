import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int km, yas, tip;
        Scanner scan = new Scanner(System.in);
        System.out.println("mesafeyi giriniz:");
        km = scan.nextInt();
        System.out.println("yasinizi giriniz:");
        yas = scan.nextInt();
        System.out.println("ucak tipini giriniz(1=tek gidis ,2=tgidis-donus");
        tip = scan.nextInt();
        double fiyat, indirim, donus;
        fiyat = km * 0.1;

        if (yas >= 12 && yas <= 24) {
            indirim = fiyat * 0.50;

        } else if (yas > 65) {
            indirim = fiyat * 30;
        } else {
            indirim = 0;
        }
        if (tip == 2) {
            donus = fiyat * 0.20;
        } else {
            donus = 0;
        }

        fiyat = fiyat - indirim - donus;
        System.out.println(fiyat);
    }

}

