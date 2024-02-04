package D11_Konu_tekrari_new;

import java.util.Scanner;

public class Genel_Konu_tekrari02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int top=0;
        int k;
        System.out.println("tek sayilar toplNIR VE NEGATIF SAYIDA PROGRAM SONLANIR ");

        while (true){
            System.out.println("lutfen birsayi giriniz");
            k= scan.nextInt();
            if (k<0){
                System.out.println("prorambitt");
                System.out.println(k);
                break;
            }
            if (k%2==1){
               top=top+k;

            }
            System.out.println(top);
        }
//faktoryel hesaplama
        Scanner input=new Scanner(System.in);
        System.out.println("faktoryel sayisi giriniz");
        int f= input.nextInt();
        int sonuc=0;
        while (f>0){
            sonuc+= f;
            f--;
        }
        System.out.println(sonuc);


    }

}
