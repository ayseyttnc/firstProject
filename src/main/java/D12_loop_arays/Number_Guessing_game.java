package D12_loop_arays;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_game {
    public static void main(String[] args) {
//        /Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.
//   scanner ve random classlarindan object uretelim

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

//        0 ile 100 arasinda rast gele sayi uretelim
        int rastgelesayidegiskeni=random.nextInt( 101);
        System.out.println(rastgelesayidegiskeni);
// random class da 20 ile 100 arasi nasil secilir ODEV
//        kullanicinin kac defa tahmin yaptigini takip etmek icin bir sayac olusturlim
        int denemeSayisi=0;

//        kullanicin yaptigi tahmini saklamak icin bir degisken olusturalim
        int tahminEdilen;

//        kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin boolean degisken olusturalim

        boolean tahminDogrumu=false;

//        oyunun aciklamasini yazdiralim

        System.out.println("0 ile 100 arasinda bir sayi tahmin etmeye calisin");
//dogru tahmin yapilincay kadar donguyu devm ettirelim

        do {
//            kullanicidan bir tahmin aliyoruz
            System.out.println("tahmininizi yapiniz");
            tahminEdilen = scanner.nextInt();
//            sayaci kac tahminde bilecek
            denemeSayisi++;
//            sayi kullanicinin tahmininden buyukse ip ucu verdik

            if (tahminEdilen < rastgelesayidegiskeni) {
                System.out.println("sayi daha buyuk :");

            } else if (tahminEdilen > rastgelesayidegiskeni) {
                System.out.println("sayi daha kucuk");

            } else {
                tahminDogrumu = true;
            }

        } while (!tahminDogrumu) ;
scanner.close();


    }
}
