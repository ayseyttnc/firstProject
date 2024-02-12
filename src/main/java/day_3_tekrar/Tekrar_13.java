package day_3_tekrar;

import java.util.Arrays;

public class Tekrar_13 {
    public static void main(String[] args) {
//        int[] arr={1,4,23,12};
//        int sayi=7;
//        int[] arr1=new int[arr.length+1];
//        for (int i = 0; i < arr.length ; i++) {
//            arr1[i]=arr[i];
//        }
//        System.out.println(arr1);
//
//        arr1[arr.length-1]=sayi;
//        arr=arr1;
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(".................");
//
//        Integer[] arr2=new Integer[2];
//
//        System.out.println(Arrays.toString(arr2));


        String cumle="kullanicdan ,? alinan cumle";
        String[] kelimeler=cumle.split("");
        Object regex;
        String s = "";
        String enuzunkelime=kelimeler[0];
        for (String w: kelimeler){
            if (w.length()>enuzunkelime.length()){
                enuzunkelime=w;
            }
        }
        System.out.println(enuzunkelime);

    }
}
