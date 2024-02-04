package D12_loop_arays;

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


        String[] stdnames1 =new String[3];
//        String stdnames2[]=new String[4];
        System.out.println(stdnames1);
//array arrays to string yardimci clasi ile yazdirilir
        System.out.println(Arrays.toString(stdnames1));
        //ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console'a yazdiriniz

//        int[] notlar = new int[5];
//        System.out.println(Arrays.toString(notlar)); //[0, 0, 0, 0, 0]
//        int[] notlar =new int[S];
//        System.out.println(Arrays.toString(notlar));

//    /ornek: 10 elemanli integers adinda, Integer bir arrray olusturunuz ve console’a yazdiriniz

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));
//[null, null, null, null, null, null, null, null, null, null]

///ornek: 3 elemanli isimler adinda, String bir array olusturunuz ve console’a yazdiriniz

String[]isimler=new  String[3];
        System.out.println(Arrays.toString(isimler));








    }
}
