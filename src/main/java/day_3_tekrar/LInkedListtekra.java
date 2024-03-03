package day_3_tekrar;

import java.util.Collections;
import java.util.LinkedList;

public class LInkedListtekra {
    public static void main(String[] args) {


        LinkedList<String> mylist = new LinkedList<>();

        mylist.add("ali");
        mylist.add("fatma");
        mylist.add("ayse");
        mylist.add("azra");
        System.out.println(mylist);
        mylist.addFirst("hassan");
        System.out.println(mylist);
        mylist.addLast("huseyin");
        System.out.println(mylist);
boolean m1=mylist.remove("ayse");
        System.out.println(m1);
        mylist.add(3,"ali");
        System.out.println(mylist);
        mylist.addFirst("ali");
        System.out.println(mylist);
        mylist.removeAll(Collections.singleton("fatma"));
        System.out.println(mylist);
      String s=  mylist.peek();
        System.out.println("s = " + s);
        System.out.println(mylist.pop());
        System.out.println(mylist.element());

    }

}
//        s.peek();
//                s.element();
//                //Not: ikisi de ilk elemani silmeden bize verir.
//                //peek() List bossa ==> null
//                //element() List bossa ==> hata verir.
//                s.poll();
//                s.pop();
//Not: ikisi de ilk elemani bize verir ve sonrasinda siler.
//poll() List bossa ==> null
//pop() List bossa ==> hata verir.        s.peek();
//        s.element();
//        //Not: ikisi de ilk elemani silmeden bize verir.
//        //peek() List bossa ==> null
//        //element() List bossa ==> hata verir.
//        s.poll();
//        s.pop();
//        //Not: ikisi de ilk elemani bize verir ve sonrasinda siler.
//        //poll() List bossa ==> null
//        //pop() List bossa ==> hata verir.