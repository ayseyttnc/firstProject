package d25Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {
//        HashMap<String, Integer> stdAges = new HashMap<>();
//        stdAges.put("ali", 18);
//        stdAges.put("can", 19);
//        stdAges.put("tom", 33);
//        stdAges.put("veli", 63);
//        stdAges.put("ahmet", 41);
//
//////Key'i tekrarli kullandiginizda hata vermiyordu ama bu sekilde yapmak best practice degildir
//
//        stdAges.put("tom", 35);
//        System.out.println(stdAges);
//
//        //1) replace() methodu value’lari key’leri kullanarak update etmeye yarar
////Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
//// kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.
//
//        stdAges.replace("tom", 39);
//        System.out.println(stdAges);
//
////2) replace() methodu eski deger kontrolu yaparak ta calisir
//        stdAges.replace("tom", 21, 45);
//        System.out.println(stdAges);
//        stdAges.replace("tom", 39, 45);
//        System.out.println(stdAges);
////        /3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map’te yoksa Map’e ekler.
//// Key Map’te zaten varsa, metodun hiçbir etkisi olmaz.
//
//        stdAges.putIfAbsent("tom", 77);
//        System.out.println(stdAges);
//
//        //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
////key verirsiniz, size value verir
//
//
//        System.out.println(stdAges.get("tom"));
//        System.out.println(stdAges.getOrDefault("tom", 18));//45 tom map te ,value su geldi
//        System.out.println(stdAges.get("jerry"));//null get map te yoksa null doner
//        System.out.println(stdAges.getOrDefault("jerry", -1)); //jerry mapte yok default deger geldi
//
////5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
////containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
////Boolean return ederler
//
//        boolean b = stdAges.containsValue(19);
//        System.out.println(b);
//        System.out.println(stdAges.containsValue(99));
//
//        System.out.println(stdAges.containsKey("TOM"));
//        System.out.println(stdAges.containsKey("tom"));
//        //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;buyuk kucuk harf duyarliligini ortadan kaldirma
//
//        Map<String, Integer> stdAge2 = new HashMap<>();
//        stdAge2.put("tom", 25);
//        stdAge2.put("jerry".toLowerCase(), 22);
//        System.out.println(stdAge2);
//        boolean cki = stdAge2.containsKey("TOM".toLowerCase());
//        System.out.println(cki);
//
//        //6)remove(“Tom”); methodu key kullanarak entry silmeye yarar
//
//
//        stdAges.remove("tom");
//        System.out.println(stdAges);
//
////remove(“Can”,19); methodu hem key hemde value’yu kontrol eder eslesirse siler yoksa silmez
//
//        stdAges.remove("can", 18);
//        System.out.println(stdAges);//eslesme olmadi silmedi
////ornek 1: Size verilen bir String’deki her kelimenin, o String’de kac defa kullanildigini
////      gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)
////        7:41
////Meshur bir interview sorusu
//
//        String s = "Ali nasilsin Ali.";
//        s = s.replaceAll("\\p{Punct}", "").toLowerCase(Locale.ROOT);
//        System.out.println(s);
//        String[] kelimeler = s.split(" ");
//        System.out.println(Arrays.toString(kelimeler));
//HashMap<String,Integer> myMap=new HashMap<>();//bu map i dongu ile dolduracagiz
//        System.out.println(myMap);//{       } bos map var
//
//        for (String w:kelimeler){
//            Integer gorunum=myMap.get(w);
//            if (gorunum==null){
//                myMap.put(w,1);//map te yoksa w den yani ali den 1 tane koy
//            }else {
//                myMap.put(w,gorunum+1);
//            }
//            System.out.println(myMap);


            //-------------------------------
            //-------------------------ODEV
//ornek 2: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
//           “Hello” ==> H=1, e=1, l=2, o=1
        String str="Hello";


HashMap<Character,Integer> charMap=new HashMap<>();

            for (char c: str.toCharArray()){
                Integer goruntu=charMap.get(c);

                if (goruntu==null){
                    charMap.put(c,1);

                }else {
                   charMap.put(c,goruntu+1);
                }
                System.out.print(charMap);
            }
        }

    }


