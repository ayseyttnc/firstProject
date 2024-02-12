package D16_ders;

import java.util.Arrays;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {
//        bir list olusrmak icin kisa yol

        List<Integer> mylist= Arrays.asList(1,3,5,9,7);
        System.out.println(mylist);

//        aslist kullanmanin bazi handigaplari vardir arka planda array gibi calismaya baslar
//        bu sekilde list olusturursaniz,listin elemanin sayisini degistiren metodlari kullanamzsiniz

//        mylist.remove(0); HATA
//        mylist.add(5);
//        clear() metodu bir listedeki tum elemanlari silmek icin kullanilir

        mylist.set(0,5);
//        0.indexe 5 koyduk
        System.out.println(mylist);
        System.out.println(mylist.size());

    }
}
