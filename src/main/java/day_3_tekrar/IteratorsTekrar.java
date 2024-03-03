package day_3_tekrar;

import java.util.*;

public class IteratorsTekrar {
    public static void main(String[] args) {


        List <String> myList=new ArrayList<>();
        myList.add("tom");
        myList.add("tom");
        myList.add("jane");
        myList.add("ali");

        Iterator<String> myItr=myList.iterator();
        while (myItr.hasNext()){
            String el=myItr.next();
            if (el.equals("tom")){
                myItr.remove();
                break;
            }
        }
        System.out.println(myList);



        List<String> yourList=new ArrayList<>(Arrays.asList("tom","ali","omer"));
        System.out.println(yourList);

        ListIterator<String> yourListItr=yourList.listIterator();
        System.out.println(yourListItr);

        while (yourListItr.hasNext()){
            yourListItr.next();


        }

        while (yourListItr.hasPrevious()) {
            String el = yourListItr.previous();

            System.out.println(el +"<--");

        }

    }
}