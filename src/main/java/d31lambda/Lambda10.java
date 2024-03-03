package d31lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda10 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("AliX");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Elif");
        mylist.add("Zeynep");
        mylist.add("Mustafa");

        // removeIfLenghtGreaterThanFive(mylist);
        //zorWithF(mylist);
        //zorWithF2(mylist);
        removeIfElementContains(mylist);
    }//main disi
    //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

    //removeIf() metodu, koleksiyonlardaki (özellikle List, Set gibi) elemanları belirli bir koşula göre
    // kaldırmak için kullanılır.removeIf metodu Collection arayüzünde tanımlıdır,
    // stream kullanilmadan cagirilir

    public static void removeIfLenghtGreaterThanFive(List<String> mylist) {
        mylist.removeIf(t -> t.length() > 5);
        System.out.println(mylist);
    }
    //2 ) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.

    //1.yol:

    public static void zorWithF(List<String> mylist) {
        mylist.removeIf(t -> t.charAt(0) == 'Z' || t.charAt(t.length() - 1) == 'f');
        System.out.println(mylist);
    }

    //2.yol
    public static void zorWithF2(List<String> mylist) {
        mylist.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
        System.out.println(mylist);
    }
    //3 ) "X" karakteri iceren elemanları silen bir method oluşturun.
public static void removeIfElementContains(List<String > mylist){
        mylist.removeIf(t-> t.contains("X"));
    System.out.println("mylist = " + mylist);
}



}
