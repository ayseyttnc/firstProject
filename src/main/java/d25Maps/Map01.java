package d25Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {
    public static void main(String[] args) {
//        maps
//        /1) Map’ler sozluk gibidir. Aciklamalidir. orn: Ali = 13 .Map’ler collections degildir. Ordan miras almaz
//2) Sol taraf yani key’ler tekrarsizdir. Value tarafi tekrarli olabilir.
//3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
//4) Map’in elemanlarina komple ‘entry set’ (giris elemani) denir.

//map nasil olusturulur
//        put ():bir key value ciftini map a ekler
//        1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("ali can", 13);
        myMap.put("veli han", 18);
        myMap.put("ayse kaya", 15);
        myMap.put("fatma yilmaz", 19);
        myMap.put("ali can", 25); //key tekrarli kullanilirsa son value aktif olur(override )ustune yazar
        System.out.println(myMap);

//keySet(): Map’teki tüm key’lerin bir set’ini döndürür.Set’in sırası rastgeledir.

        Set<String> keyTarafi = myMap.keySet();
        System.out.println(keyTarafi);

//Sadece ‘value’ degerlerini nasil alabiliriz?

//Sadece ‘value’ degerlerini nasil alabiliri
//values():Map’teki tüm value’ların bir collection’ını döndürür.Collection’ın sırası rastgeledir.

//Collections<Integer> valuetarafi= myMap.values();
        Collection<Integer> valueTarafi = myMap.values(); //Collection yerine baska birsey yazilabilir mi? (List? Set?) ODEV
        System.out.println(valueTarafi); //[19, 25, 18, 15]

//get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir
        Integer yas = myMap.get("ali can");
        System.out.println(yas);
        Integer yas1 = myMap.get("ali Can");
        System.out.println(yas1);
//............................

        //Ornek 1: myMap’deki kisilerin yaslarinin ortalamasi nedir?

        int toplam = 0;
        Collection<Integer> yaslar = myMap.values();
        System.out.println(yaslar);
        for (Integer w : yaslar) {

            toplam = toplam + w;
        }
        System.out.println(toplam / yaslar.size());

        System.out.println("----------------------");

        //entrySet() metodu, HashMap’in tüm degerlerini içeren bir Set döndürür.
// Dongu gibi ayri satirlarda yazdirir.Cunku Loop’lar direkt Map’ler ile kullanilamaz.
//Bu yuzden ozel method gelistirilmis. Set’in icinde Map yapisi saklanir.

        System.out.println(myMap);
        Set<Map.Entry<String, Integer>> myEntrySet = myMap.entrySet();
        System.out.println(myEntrySet);
        for (Map.Entry<String, Integer> w : myEntrySet) {
            System.out.println(w);
        }
///Ornek 2: Verilen Map’deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
//Java’da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
// hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.

        HashMap<String,Integer> kisiler =new HashMap<>();
        kisiler.put("ali",3);
        kisiler.put("can",5);
        kisiler.put("ayse",2);

        int sum=0;
        Set<Map.Entry<String,Integer>> mySet=kisiler.entrySet();
        System.out.println(mySet);

        for (Map.Entry<String,Integer> w: mySet){
            sum=sum+w.getKey().length()+w.getValue();
            System.out.println(sum);

        }



    }
}
