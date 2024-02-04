package Day2_practice_dersler;

import java.util.Scanner;

public class C04_nested_turnary {
    public static void main(String[] args) {
        /*

        1. Kullanıcıdan iki sayı alın.
        2. Ternary kullanarak,
            - Sayılar birbirine eşit ise, konsola "Sayılar birbirine eşit" yazdırın.
            - Sayılar birbirine eşit değil ise, büyük olan sayının karesini ekrana yazdırın.

 */
        Scanner scan=new Scanner(System.in);
        System.out.printf("birinci sayi giriniz");
        int sayi1= scan.nextInt();

        System.out.printf("ikinci sayi giriniz");
        int sayi2= scan.nextInt();


        Object sonuc=sayi1==sayi2? ("sayilar birbirne esittir"): (sayi1>sayi2)? (sayi1*sayi1):(sayi2*sayi2);
        System.out.println(sonuc);



    }
}
