package D15ArrayList_Metodcreation.Day3_yeni;

import java.util.Scanner;

public class C05_Do_While_loops {
    public static void main(String[] args) {
        do {
            System.out.println("merhaba");
        }while (5>6);

//        kullanicidan pozitif tam sayilar isteyin
//        sifir girdisi alindiginda dongu durdurulacak
//        dongu durduruldugunda toplam girilen sayi adedinin sayilarin toplamin print edin
//        kullanicinegatif girerse bu mumkun degildir deyin
//        negatif sayi  girilirsa bu sayiyi , sayi adedine veya toplama  eklenmesin
//        girilen x sayinin toplami y

        Scanner input=new Scanner(System.in);

        int sayac=0;
        int toplam=0;

        do {
            System.out.println("pozitif bir tam sayi giriniz");
            int sayi= input.nextInt();
            if (sayi==0){
                break;

            } else if (sayi<0) {
                System.out.println("negatif sayi girilemez");

            }else {
                sayac++;
                toplam+=sayi;
            }
        }while (true);
        System.out.println("girilen"+ sayac+"sayinin toplami"+toplam);


    }
}


