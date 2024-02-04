package D13_Arrays;

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
    }
}
