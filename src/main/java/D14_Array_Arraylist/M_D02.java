package D14_Array_Arraylist;

import java.util.Arrays;

public class M_D02 {
    public static void main(String[] args) {
        //Ornek 1: Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.
// int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        int[][] numbers = {{5, 4}, {2, 3, 2}};

        //1.adim: Iki boyutlu bir Array’de kac eleman oldugunu bulan kodu yazalim
//2.adim: Tek boyutlu Array’i, iki boyutlu Array’in eleman sayisini kullanarak olusturalim
//3.adim: Iki boyutlu Array’deki elemanlari tek boyutlu Array’e transfer edelim

        int toplamelemansayi=0;
        for (int[]w: numbers){
            toplamelemansayi=toplamelemansayi+w.length;
        }
        System.out.println(toplamelemansayi);

        int[] newarr=new int[toplamelemansayi];
        System.out.println(Arrays.toString(newarr));

        int idx=0;

        for (int[] w:numbers){
            for (int k: w){
                newarr[idx]=k;
                idx++;
            }

        }
        System.out.println(Arrays.toString(newarr));
    }
}
