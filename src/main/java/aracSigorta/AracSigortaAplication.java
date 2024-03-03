package aracSigorta;

import java.util.Scanner;

public class AracSigortaAplication {
    /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
 */

    public static void main(String[] args) {
//        1uygulamayi baslatan bir method
        start();
    }

    public static void start() {
//2.kullanicidan bilgi alacaz

        Scanner input = new Scanner(System.in);
        boolean isAgain = false;
//        3.tekrar tekrar menu gosterilsin

        do {

            System.out.println("zorunlu arac sigorta primi hesaplama");
            System.out.println("tarife donemi seciniz");
            System.out.println("1.haziran 2024");
            System.out.println("2.aralik 2024 ");
            int donem = input.nextInt();
            String donemBilgi = donem == 1 ? "haziran 2024" : "aralik2024";
//            tarife donemi dogru girlirsa isleme devam etsin hatali ise forma gonderme islemi yap
//            if (donem==1||donem==2){
//                4.

//tarife donemi dogru girilirse isleme devam et hatali ise uyari verip tekrar forma gonderme islemi yap
            if (donem == 1 || donem == 2) {
                //4. bir arac objesi olusturalim
                Arac arac = new Arac(); //default

                System.out.println("arac tipini seciniz");
                System.out.println("otomobil,kamyon,motosiklet,otobus");
                arac.type = input.next().toLowerCase();
                arac.primHesapla(donem);
                //prim=0 ise hatali giris yapmis yeni islem yapsin
                //prim >0 ise hesaplama islemi basarilidir

                if (arac.prim > 0) {
                    System.out.println("------------");
                    System.out.println("arac tipi:" + arac.type);
                    System.out.println("tarife donemi" + donemBilgi);
                    System.out.println("aracinizin bilgi donem sigort PRIMI" + arac.prim);
                    System.out.println("yeni islem 1,cikis icin 0 seciniz");
                    int select = input.nextInt();
                    isAgain = select == 1 ? true : false;
                } else {
                    System.out.println("hesaplama islemi basarisiz,tekrar deneyiniz");
                    System.out.println("yeni islem icin 1,cikisin icin 0 seciniz");
                    int select = input.nextInt();
                    isAgain = select == 1 ? true : false;

                }
            } else {//hatali giriste
                System.out.println("Hatali giriş!!!");
            }
        } while (isAgain);

    }

}
