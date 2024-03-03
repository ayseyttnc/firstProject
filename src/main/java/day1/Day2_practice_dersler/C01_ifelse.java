package day1.Day2_practice_dersler;

import java.util.Scanner;

public class C01_ifelse {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı isteyin,
            - Sayıların ikisi de pozitif ise sayıların toplamını yazdırın.
            - İkisi de negatif ise sayıların çarpımını yazdırın.
            - İkisi farklı işaretlere sahip ise sayılarla işlem yapılamadığını yazdırın.
            - Sayılarda sıfıra eşit olan var ise yutan eleman yazdırın.
 */
        Scanner input=new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz");
        int sayi1= input.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        int sayi2= input.nextInt();
        if (sayi1>0 && sayi2>0 ){
            System.out.println(sayi1+sayi2);
        
        } else if (sayi1<0 && sayi2<0) {
            System.out.println(sayi1*sayi2);
            
        } else if (sayi1>0  &&sayi2<0) {
            System.out.println("sayilarla islem yapilamiyor");
//sayi1*sayi2<0
            
        }else {
            System.out.println("yutan eleman");
        }
    }
}
/*
        SHIFT + 7: /
        0'ın sağındaki tuş: *
 */