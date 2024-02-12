package Day_04_practise;

import java.util.Arrays;

public class Array_Eleleman_Ekleme {
    public static void main(String[] args) {
        /*

        Belirtilen bir array'e, istenen elemanı ekleyin

        int[] arr = { 1, 4, 23, 12}

        Istenen eleman: 7

 */

        int[]arr={1,4,23,12};
        int sayi=7;
        int[] arr1=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));


        arr1[arr.length-1]=sayi;
        arr=arr1;
        System.out.println(Arrays.toString(arr));

        System.out.println("...............................");

        Integer[] arr2=new Integer[2];

        System.out.println(Arrays.toString(arr2));

    }
}
