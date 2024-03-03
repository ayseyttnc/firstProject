package day_3_tekrar;

import java.util.*;

public class Set_01tekrar {
    public static void main(String[] args){
        String a="ali can";
        System.out.println(a.hashCode());

        HashSet<String> hs=new HashSet<>();
        System.out.println(hs);

        hs.add("sinan");
        hs.add("kerem");
        hs.add("  ");
        hs.add("mehmet");
        System.out.println(hs);

        hs.add("ahmet");
        hs.add(null);
        System.out.println(hs);

        HashSet<String> hs2=new HashSet<>(Arrays.asList("ali","ayse"));
        System.out.println(hs2);

        Set<String> hs3=Set.of("hasan","fatma");
        System.out.println(hs3);

        LinkedList<Integer> lhs=new LinkedList<>();
        lhs.add(3);
        lhs.add(9);
        lhs.add(23);
        lhs.add(12);
        System.out.println(lhs);

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(3);
        ls.add(23);
        ls.add(25);
        ls.add(2);
        System.out.println(ls);

        lhs.retainAll(ls);
        System.out.println(lhs);
        System.out.println(ls);

        TreeSet<Character> ts1=new TreeSet<>();
        ts1.add('G');
        ts1.add('A');
        ts1.add('Z');
        ts1.add('R');
        ts1.add('U');
        System.out.println("ts1 = " + ts1);

        SortedSet<Character> ss=ts1.subSet('G','U');
        System.out.println(ss);

        SortedSet<Character> ss1=ts1.subSet('B','H');
        System.out.println(ss1);

        TreeSet<String> ts3=new TreeSet<>();
        ts3.add("ahmet");
        ts3.add("mehmet");
        ts3.add("ayse");
        System.out.println(ts3);

        SortedSet<String> ss2=ts3.subSet("ahmet","ayse");
        System.out.println(ss2);


    }
}
