package d24collections;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {


        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no

/*Java'da üç tür set vardır:
1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
bir hücreye yerleştirilir.

HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
null'i eleman olarak kabul ederler */

//    hash code gormek isterek:

        String a = "ali can";
        System.out.println(a.hashCode());
/*2) LinkedHashSet:Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

3) TreeSet:Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
Bu nedenle, TreeSet bir Sorted Set'tir.*/

        //HashSet nasil olusturulur?

        HashSet<String> hs = new HashSet<>();
        System.out.println(hs);
//[] parantez verir icinde hiclik var
        //HashSet’e nasil eleman eklenir?
        hs.add("sinan");
        hs.add("kerem");
        hs.add("tuba");
        hs.add("onur");
        System.out.println(hs);
        hs.add("kerem");
        System.out.println(hs);
//        tekrarli eleman hata vemez uzerine yazar tekrarlanan elemanin

        hs.add(null);
        System.out.println(hs);
//        -----------------------------eleman eklemenin kisa yollari

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("ali", "ayse"));
        System.out.println(hs2);

//        kisitlama
        Set<String> hs3 = Set.of("hasan", "fatma");
        System.out.println(hs3);
//        --------------------------------
        //LinkedHashSet nasil olusturulur?

        LinkedList<Integer> lhs = new LinkedList<>();
        //LinkedHashSet’e eleman nasil eklenir?

        lhs.add(14);
        lhs.add(10);
        lhs.add(19);
        lhs.add(7);
        lhs.add(null);
        System.out.println(lhs);
//        insert sirasi bizim verdigimizsira

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(4);
        ls.add(9);
        ls.add(12);
        ls.add(17);
        System.out.println(ls);

//retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
// (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.

        lhs.retainAll(ls);
        System.out.println(lhs);
        System.out.println(ls);

        lhs.retainAll(ls); //degisiklige ugrayan soldakidir
        System.out.println(lhs); //[14, 19]
        System.out.println(ls); //[14, 19, 17, 11]
//Treeset nasil olusturulur
//        TreeSet<Character> ts=new TreeSet<>();
//        ts.add('g');
//        ts.add('a');
//        ts.add('z');
//        ts.add('r');
//        ts.add('u');
//        ts.add(null);
//
//        System.out.println(ts );
////
        //TreeSet nasil olusturulur?
        TreeSet<Character> ts1 = new TreeSet<>();
        ts1.add('G');
        ts1.add('A');
        ts1.add('Z');
        ts1.add('R');
        ts1.add('U');

//ts.add(null); //HATA-neden null ekleyemiyoruz?
        System.out.println(ts1); //[A, G, R, U, Z] - natural order (A-Z, sayilarda kucukten buyuge)

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
//subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
// oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
// SortedSet türünden bir değişken oluşturmanız gerekir.

//TreeSet<Character> ts1.subSet('G','U'); HATA subset sorted set uretir

//        SortedSet<Character> ss=ts1.subSet('G','U');
//        System.out.println(ss);


//TreeSet nasil olusturulur?
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');

        //ts.add(null); //HATA-neden null ekleyemiyoruz?
        System.out.println(ts); //[A, G, R, U, Z] - natural order (A-Z, sayilarda kucukten buyuge)

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

        //TreeSet<Character> ss = ts.subSet('G', 'U'); HATA-subSet sortedSet uretir

        SortedSet<Character> ss = ts.subSet('G', 'U');
        System.out.println(ss); //[G, R] - G Dahil, U haric

        SortedSet<Character> ss1 = ts.subSet('B', 'H');
        System.out.println(ss1); //[G]












    }
}
