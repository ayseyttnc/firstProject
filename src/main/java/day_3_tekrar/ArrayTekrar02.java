package day_3_tekrar;

import org.testng.annotations.Test;

public class ArrayTekrar02 {


    @Test
    public void test1() {
//        Soru 5) Asagidaki multi dimensional array'in
//        ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
//        bir program yaziniz {{1,2,3}, {4,5}, {6}}
//        */

        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};
        System.out.println(arr);
        int carpim = 1;
        for (int[] w : arr) {
            carpim *= w[w.length - 1];
        }
        System.out.println(carpim);


        System.out.println("lllllllllllllllllllllllllllll");

//        soru 6) bir multi-dimensional array olusturun ve
//                outer indexlerin inner indexlerini tek tek kontrol edip
//                en buyuk degerlerini yazdırın

        int[][] arr4 = {{2, 3, 4, 12}, {5, 8}};
        System.out.println(arr4);


        for (int[] ic : arr4) {
            int max = ic[ic.length - 1];
            for (int deger : ic) {
                if (max > deger) {
                    deger = max;

                }
            }
            System.out.println("max =  " + max);
        }
//        soru 7) Verilen bir multi dimensional array'in
//        inner indexindeki elementlerinin ortalamasından
//        büyük elementleri yazdıran bir kod yazınız.

        int[][] arr5 = {{12, 3, 9}, {6, 21, 3}};
        double toplam = 0;
        int elemanSayisi = 0;
        for (int i = 0; i < arr5.length; i++) {

            for (int j = 0; j < arr5[i].length; j++) {

                toplam += arr5[i][j];
                elemanSayisi++;


                System.out.println("toplam"+toplam);
            }
            double ortalama = toplam/ elemanSayisi;
            System.out.println("ortalama:" +ortalama);
        }

    }
}

