package D10_Konu_tekrar;

import java.util.Scanner;

public class Practice_ders_ifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayiyi yazdirin");
        int sayi1 = scan.nextInt();

        System.out.println("ikinci sayiyi yazdiriniz");
        int sayi2 = scan.nextInt();
            System.out.println(sayi1 * sayi2);
        System.out.println("ayse local");
        System.out.println("okjhgtfrf");
        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println(sayi1 + sayi2);
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println(sayi1 * sayi2);
        } else if (sayi1 > 0 && sayi2 < 0) {
            System.out.println("sayilarla islem yapilamamaktadir");

        } else {
            System.out.println("yutan eleman");
        }

        System.out.println("..................");

        Scanner input= new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= input.nextInt();




    }


}

