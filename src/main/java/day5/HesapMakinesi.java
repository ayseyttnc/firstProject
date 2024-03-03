package day5;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        /*
        4 işlem yapabilen bir hesap makinesi yazınız.

        - Kullanıcıdan yapılacak işlemi semboller ile alınız. ( +, -, *, / )
        - Kullanıcıdan 2 sayı girdisi isteyiniz.
        - Sonucu ekrana yazdırınız.
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("islem turunu belirtiniz (+ ,- * /)");
        char islemturu=scanner.next().charAt(0);
        if (islemturu=='+'||islemturu=='-'|| islemturu=='*'|| islemturu=='/'){
            System.out.println("1.sayiyi giriniz");
            double sayi1=scanner.nextDouble();
            System.out.println("2.sayiyi giriniz");
                    double sayi2=scanner.nextDouble();
                    if (!(islemturu=='/'&& sayi2==0)){
                        hesapla(sayi1,sayi2,islemturu);
                    }
        }else {
            System.out.println("gecersiz islem turu.");
        }

    }

    public static void hesapla (double sayi1,double sayi2, char islemturu){
        switch (islemturu){
            case'+':
                System.out.println("toplam :"+ (sayi1+sayi2));
            case'-':
                System.out.println("cikarma:"+ (sayi1-sayi2));
            case'*':
                System.out.println("carpma"+(sayi1*sayi2));
            case '/':
                System.out.println("bolme"+sayi1/sayi2);
        }
    }
}
