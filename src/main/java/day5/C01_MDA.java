package day5;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
                /*

                Bir array oluşturun.

                Devamında, her bir elemanı, iç array elemanlarının toplamına eşit olan tek boyutlu yeni bir array haline getirin.

                Örn:

                int[][] arr = { {3,4}, {7,2}, {9,5} }
                -->
                { 7, 9, 14 }

         */
        int[][] arr = { {3,4}, {7,2}, {9,5} };
        System.out.println(Arrays.deepToString(arr));
        int[] brr=new int[arr.length];
        int idx=0;
//        birincisi dis array ikincisi ic array elemanlari
        for (int [] w: arr){
            int toplam=0;
            for (int  a : w) {
                toplam +=a;
            }
            brr[idx]=toplam;
            idx++;
        }
        System.out.println(Arrays.toString(brr));


        int[][] arr1 = { {3,4}, {7,2}, {9,5} };
        int[] brr1=new int[arr.length];

//        for (int i = 0; i <arr1.length ; i++) {
//            toplam1=0;
//            for (int j = 0; j < arr1[i].length; j++) {
//                toplam1 +=arr[i][j];
//            }
//            brr1[i]=toplam1;
//        }
//        System.out.println(Arrays.toString(brr1s));

    }
}
