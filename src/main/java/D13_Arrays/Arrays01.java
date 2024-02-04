package D13_Arrays;

import javax.xml.datatype.DatatypeFactory;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
    1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
    2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
    bir String dizisi sadece String değerler saklayabilir.
    3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
    Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
    4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
    5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
    6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
    (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
*/

//        array olusturmak
//        tercih edilen birinci
//        /arrayler clas degil object tir
//        arrayler dogrudan yazditrilmaz .arrays yardimci classi kullanilir


        String[] stdnames1 = new String[3];
//        String stdnames2[]=new String[4];
        System.out.println(stdnames1);
//array arrays to string yardimci clasi ile yazdirilir
        System.out.println(Arrays.toString(stdnames1));
        //ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console'a yazdiriniz

//        int[] notlar = new int[5];
//        System.out.println(Arrays.toString(notlar)); //[0, 0, 0, 0, 0]
//        int[] notlar =new int[];
//        System.out.println(Arrays.toString(notlar));

//    /ornek: 10 elemanli integers adinda, Integer bir arrray olusturunuz ve console’a yazdiriniz

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));
//[null, null, null, null, null, null, null, null, null, null]

///ornek: 3 elemanli isimler adinda, String bir array olusturunuz ve console’a yazdiriniz

        String[] isimler = new String[3];

//array e eleman eklemek
        isimler[0] = "Ali Can";
        isimler[2] = "veli han";
        isimler[1] = "ayse hanim";

        isimler[0] = "omer";
        System.out.println(Arrays.toString(isimler));


//bir veriyi gormek icin ise
        System.out.println(isimler[1]);

        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
//      icerdigi karakter sayilari toplamini ekrana yazdirin.

        String[] cities = new String[5];
        cities[0] = "bayburt";
        cities[1] = "sivas";
        cities[2] = "denizli";
        cities[3] = "adana";
        cities[4] = "ankara";
        System.out.println(Arrays.toString(cities));

//        1.yol for loop
        int totalchar = 0;
//araylerdeki parantezsiz lenght dinamik degildir field alan okumasi yapar
        for (int i = 0; i < cities.length; i++) {
//            bu lenght metod string e uygulanir dinamiktir
            totalchar=totalchar+cities[i].length();
        }
        System.out.println(totalchar);
//sonuc 30 olmali
        System.out.println("............");
//        2.yol //for each loop:
////for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
////for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
////variable ismi olarak da genel kabul w’nun kullanilmasidir.

//        for (DataType variable : array collection){
//            calisacak kodlar}

        int sum=0;
        for (String w: cities){
            sum=sum+w.length();

        }
        System.out.println(sum);


    }
}
