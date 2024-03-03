package day_3_tekrar;

import java.util.Arrays;

public class ArrayTekrar {
    public static void main(String[] args) {
//        Soru 4) Asagidaki multi dimensional array'in
//        ic array'lerindeki tum elemanlarin toplamini birer birer bulan
//        ve herbir sonucu yeni bir array'in elemani yapan
//        ve yeni array'i ekrana yazdiran bir program yaziniz
//        Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)


        int[][] arr={{1,2,3}, {4,5}, {6, 7} };
        System.out.println(Arrays.deepToString(arr));
        int[] newarr=new int [arr.length];
int ind=0;
for (int[] w:arr){
   int toplam=0;
    for (int a:w){
        toplam+=a;
    }
    newarr[ind]=toplam;
    ind++;

}
        System.out.println(Arrays.toString(newarr));


    }
}
