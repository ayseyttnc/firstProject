package day_3_tekrar;

import java.util.ArrayList;
import java.util.Arrays;

public class Tekraro8 {
    public static void main(String[] args) {
        int[][] numbr = {{5, 4}, {2, 7}};
        int toplam_elaman = 0;
        for (int[] w : numbr) {
            toplam_elaman = toplam_elaman + w.length;

        }
        System.out.println(toplam_elaman);

        int[] newarr = new int[toplam_elaman];
        System.out.println(Arrays.toString(newarr));

        int idx = 0;

        for (int[] w : numbr) {
            for (int k : w) {
                newarr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newarr));

        System.out.println(".......................");

        int[][] ages = {{3, 5}, {1, 2, 3}};
        int ekkucuk = ages[0][0];
        int enbuyuk = ages[0][0];

        for (int[] w : ages) {
            for (int k : w) {
                ekkucuk = Math.min(ekkucuk, k);
                enbuyuk = Math.max(enbuyuk, k);
            }
        }
        System.out.println(ekkucuk);
        System.out.println(enbuyuk);
        System.out.println(ekkucuk + enbuyuk);

        ArrayList<Integer>  list=new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(13);
        list.add(1);
        System.out.println(list);

        for (Integer w:list){
            if (w%2!=0){
                list.set(list.indexOf(w),11 );
            }
        }
        System.out.println(list);
    }}









