package day_3_tekrar;

import java.util.Random;
import java.util.Scanner;

public class While_loopOdev {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
// kullanicidan bu sayiyi tahmin etmesini isteyin
// girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
// kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
// Random rnd=new Random();
// int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
//odev!!!! kullaniciya 5 tahmin hakkı verin bulursa tebrik edin(break atmayi unutmayin) bulamazsa exit atip tekrar oynamasini isteyin

        Scanner input=new Scanner(System.in);
        Random rnd=new Random();
        int rndSayi= rnd.nextInt(100);
int girilenSayi;
int tahminSayisi=0;
int kalanTahmin=5;
        System.out.println("tebrikler"+tahminSayisi+". tahminde buldunuz");
        

    }
}
