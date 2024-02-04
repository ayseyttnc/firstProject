package Day2_practice_dersler;

import java.util.Scanner;

public class C02_nestedif {
    public static void main(String[] args) {
        /*

        1. Kullanıcıdan bir sayı girmesini isteyin.
            - Numara sıfırdan küçük ise, konsola "Negatif" yazdırın.
            - Numara sıfırdan büyük ise,
                + Numara 10'dan küçük ise konsola "Rakam" yazdırın.
                + Numara 10'dan büyük ise konsola "Pozitif Sayı" yazdırın.

 */

        Scanner sacanner=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= sacanner.nextInt();

        if (sayi<0){
            System.out.println("negatif");}
            else if (sayi==0){
        System.out.println("sifir.");}

else {
            if (sayi<10) {
                System.out.println("rakam");
            }
            else {
                System.out.println("pozitif");
            }
        }
//ek syntax bilgisi
        if (sayi<10)
            System.out.println();
        else
            System.out.println("pozitif");
//        suslu parantez olamdan da olur tek bir satir suslu parantez gerekmiyor
//        ama birden sfazla satirda suslu parantez gerekiyor if in sinirlarini belirtmek icin


    }


    }

