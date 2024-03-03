package day1.Day2_practice_dersler;

import java.util.Scanner;

public class C03_turnary {
    public static void main(String[] args) {
        /*
        1. Kullanıcıdan bir sayı alın.
        2. Ternary kullanarak,
            - Girilen sayı çift ise konsola "Çift Sayı" yazdırın.
            - Girilen sayı tek ise, sayıyı 3 arttırarak konsola yazdırın.
// */
//        expresion?(tue);(false);
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

//        1.yol
//        object her data yi ataya biliri
        Object sonuc = sayi % 2 == 0 ? "cift sayi" : sayi + 3;
        System.out.println("sonuc = " + sonuc);

//2.yol
        System.out.println(sayi % 2 == 0 ? "cift sayi" : sayi + 3);


    }
}
