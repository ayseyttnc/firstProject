package d29iterators_lambda;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        //guvenli silme yapacaksak bu loop u kullanabiliriz

      /*
        1-  Iterator'ler loop'larin yaptigi ayni isi yapar
        2)  Iterator'lerde sonsuz loop olusma ihtimali yoktur(for each gibi)
        3)  Iterator'ler ile loop'lar arasinda performans farki yoktur
        4)  Iterator'ler bir collection'dan eleman silme ve bir collection'daki elemani degistirme
        konusunda daha basarilidir
        5) Iki tip iterator vardir:
            a) Iterator:
            Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir
            b) ListIterator:
            Bu eleman silebilir, ekleyebilir ve degistirebilir

            Not:
            Iterator, sadece soldan saga (ilk elemandan son elemana) calisir
            ListIterator iki yonlu calisabilir
         */
        List<String> myList = new ArrayList<>();
        myList.add("tom");
        myList.add("jim");
        myList.add("fatma");
        myList.add("clara");
        myList.add("mustafa");
        myList.add("tom");
        System.out.println(myList);

        //myList uzerinde bir Iterator olusturalim
//hasNext() : Koleksiyonun bir sonraki elemaninin olup olmadigini kontrol eder(boolean)
//next() : Pointer'i bir sonraki elemanin onune konumlandirir ve pointer'in atladigi elemani verir
//remove() : Pointer'in atladigi elemani siler

        //**specific bir elemani iterator ile nasil silebiliriz? (Tom’u silelim)


        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()) {//en basa konumlanan pointer dan sonra eleman varmi diye bakar
//            myItr.next();//pointer i bir snraki (2.elemanin onune alir ve atladigi elemani verir
//            myItr.remove();//next () in verdigi elemani siler

            String el = myItr.next();
            if (el.equals("tom")) {
                myItr.remove();
                break; //eger iki tane tom var ise 2, tom kalir break oldugu icin break olmasaydi butun tolari silerdi

            }

        }
        System.out.println(myList);
        System.out.println("---------------------------------");


        //ListIterator

        List<String> yourList = new ArrayList<>(Arrays.asList("ali", "can", "aliye"));
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();
        System.out.println(yourListItr);

//1) set(E e): Koleksiyonun geçerli elemanını değiştirir.
//has next true false uretir
        while (yourListItr.hasNext()) {
            String el = yourListItr.next();
            yourListItr.set(el + "*");

        }

        System.out.println(yourList);

//2)elemanlari sondan basa dogru yazdirin
        List<String> yourList2 = new ArrayList<>(Arrays.asList("ali", "can", "aliye"));
        System.out.println(yourList2);
        ListIterator<String> listiyr2 = yourList2.listIterator();
//bu loop pointer i en saga almak icin yazildi

//        while (listiyr2.hasNext()){
//            listiyr2.next();

//elemanlari sondan basa dogru yazdirin

//            while(listiyr2.hasPrevious()){ //onceki eleman varmi diye kontrol ettik
//         String el=       listiyr2.previous(); //privious pointer i sasgdan sola alir
//                System.out.println(el + "<---");
//
//
//

    }






        }















