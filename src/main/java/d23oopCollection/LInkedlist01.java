package d23oopCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LInkedlist01 {
    public static void main(String[] args) {
        /*Collections (koleksiyonlar), Object'leri depolamak ve işlemek için kullanılan
bir class'lar ve interface'ler kümesidir.

—Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
        Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
        Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
        Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
        Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

—Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
        Verileri verimli bir şekilde depolamak
        Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
        Verileri güvenli bir şekilde depolamak*/
//----------------------------------------------------
        /*Java da Array'ler neden eksik kaldi da Collection'lar gelistirildi?

Java'da array'ler eksik kaldı çünkü:

Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata yapmaya müsaittir.
Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.

Collections, bu dezavantajları çözmek için tasarlanmıştır.*/

//        ArrayList<String> list1 = new ArrayList<>();
////        List<String> list2 = new ArrayList<>();
//        Object list4=new List();
//        //List<String> list4 = new List(); HATA,interface'ler constructor tarafinda kullanilamazlar
//-------------------------------------------------------------------


/*LinkedList: Bağlı bir listedir.

LinkedList'ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
LinkedList'in içinde bulunan node'ların konumunu temsil eder.

ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

1)Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
başlayarak ilerlemeyi gerektirir. Yani ArrayList'e gore erisim yavastir.
ArrayList'lerde get(index) ile hizli erisiriz. Ama LinkedList'ler en bastan istenen eleman mi diye
tek tek bakar.

2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/

        LinkedList<String> mylist = new LinkedList<>();
        //1-add() : listeye bir eleman ekler
        mylist.add("ali");
        mylist.add("veli");
        mylist.add("ayse");
        mylist.add("fatma");
//insertion order:bizim ekleme siramiza gore sona ekliyor
        System.out.println(mylist);
//extra bilgi..............kisa yolla
//        boyut degistirlir
        LinkedList<String> linklist=new LinkedList<>(Arrays.asList("eleman1","eleman2","eleman3"));
        System.out.println(linklist);
        LinkedList<String> linkedList2=new LinkedList<>(List.of("eleman1","eleman2","eleman3"));
//        System.out.println(linkedList2);
        List<String> immutablelist=List.of("eleman1","eleman2","eleman3");
//        boyut degistirilmez
//        immutablelist.add("serkan");
//        System.out.println(immutablelist) ; HATA


        //2- add(int index, E element); belirtilen konuma bir oge ekler

        mylist.add(1, "zeynep");
        System.out.println(mylist);

        //3- addFirst(E e): Listenin basina oge ekler
        mylist.addFirst("hasan");
        System.out.println(mylist);
        mylist.addLast("husayin");
        System.out.println(mylist);

//5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur

        boolean m1 = mylist.remove("ali");
        System.out.println(mylist);
        System.out.println(m1);

//6)removeFirstOccurrence() metodu,
// belirtilen bir öğeyi LinkedList içinde
//bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
//Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
//Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        mylist.add("yusuf");
        mylist.add(3, "yusuf");
        System.out.println(mylist);

        mylist.removeFirstOccurrence("yusuf");
        System.out.println(mylist);
//        --------- extra bilgi
        mylist.removeAll(Collections.singleton("yusuf"));
        System.out.println(mylist);

        //7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
//sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
//Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
//Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

mylist.removeLastOccurrence("fatma");
        System.out.println(mylist);

        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
// Bu metod, elemanı koleksiyondan kaldırmaz.
// Bu metod, koleksiyon boşsa null dondurur)


String s=mylist.peek();
        System.out.println(s);


//9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
// Bu metod, koleksiyon boşsa null döndürür.
        System.out.println(mylist.poll());

        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
// Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
// bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir

        System.out.println(mylist.element());


        System.out.println(mylist.poll());

        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
// Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)

        System.out.println(mylist.pop());
        System.out.println("mylist = " + mylist);


    }
}
