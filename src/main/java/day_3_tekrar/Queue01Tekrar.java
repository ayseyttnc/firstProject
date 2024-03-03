package day_3_tekrar;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01Tekrar {
    public static void main(String[] args) {
        Queue<String> depo=new LinkedList<>();
        depo.add("sut");
        depo.add("peynir");
        depo.add("ekmek");
        depo.add("yag" );
        System.out.println("depo = " + depo);

        String s= depo.remove();
        System.out.println("s = " + s);
        System.out.println("depo = " + depo);

        System.out.println(depo.peek());
        System.out.println("depo = " + depo);

//        depo.clear();
//        System.out.println("depo = " + depo);

        System.out.println(depo.poll());

        PriorityQueue<String> acilsirasi=new PriorityQueue<>();
        acilsirasi.add("mehmet");
        acilsirasi.add("mahmut");
        acilsirasi.add("ekrem");
        acilsirasi.add("oya");
        acilsirasi.add("tansu");
        System.out.println(acilsirasi);

    }

}
