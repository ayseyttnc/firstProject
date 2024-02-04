package D14_Array_Arraylist;

import java.util.Arrays;

public class Arrays_04 {
    public static void main(String[] args) {
        //Orn
        //ek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
//     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr={0,2,3,0,12,0};
        int[] yeniarr=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(yeniarr));
//        w aldik yeni arr nin ilk indexine koyduk
        int ilkindex=0;
        for (int w: arr){
            if (w!=0){
                yeniarr[ilkindex]=w;
                ilkindex++;
            }
        }
        System.out.println(Arrays.toString(yeniarr));

        System.out.println("''''''''''''''''''");

//Arraylerin esit olup olmadigi nasil anlasilir?
        int[] a = new int[3];
        a[0] = 2;
        a[1] = 1;
        a[2] = 3;


        int[] b = new int[3];
        b[0] = 2;
        b[1] = 1;
        b[2] = 3;

//        /iki arrayin ayni olabilmesi icin, ayni index te ayni elemanlarin bulunmasi gerekir

       boolean result= Arrays.equals(a,b);
        System.out.println("result = " + result);


    }
}
