package D13_tekrar;

import java.util.Arrays;

public class Arrays_Konu_Tekrari1 {
    public static void main(String[] args) {
        String[] std1 = new String[3];
        System.out.println(std1);
        System.out.println(Arrays.toString(std1));

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));

        String[] isimler = new String[3];
        isimler[0] = "alican";
        isimler[1] = "ali";
        isimler[2] = "can";
        System.out.println(Arrays.toString(isimler));

        System.out.println(".............");

        String[] sehirler = new String[3];
        sehirler[0] = "a";
        sehirler[1] = "b";
        sehirler[2] = "ab";

        System.out.println(Arrays.toString(sehirler));
        int sum = 0;
        for (String w : sehirler) {
            sum += w.length();
        }
        System.out.println("sum = " + sum);

        System.out.println("666666666666666666666");

        int[] ages = new int[4];
        ages[0] = 13;
        ages[1] = 16;
        ages[2] = 23;
        ages[3] = 15;
        System.out.println(ages);

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length - 1]);

        System.out.println("...................");

        int[] sayilar = {2, 3, 4, 8, 9,};
        System.out.println(Arrays.toString(sayilar));

        for (int w : sayilar) {
            if (w < 5) {
                System.out.println(w + " ,");
            }

        }

        int[] num = {1, 3, 5, 7};

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.binarySearch(num, 3));
        System.out.println(Arrays.binarySearch(num, 1));
        System.out.println(Arrays.binarySearch(num, 5));
        System.out.println(Arrays.binarySearch(num, 7));

        String[] alf = {"a,b,c,d"};

        Arrays.sort(alf);
        System.out.println(Arrays.toString(alf));
        System.out.println(Arrays.binarySearch(alf, "a"));
        System.out.println(Arrays.binarySearch(alf, "b"));
        System.out.println(Arrays.binarySearch(alf, "c"));
        System.out.println(Arrays.binarySearch(alf, "d"));


        System.out.println("............");
        String s = "java is easy .learn java earn money";
        String[] word = s.split(" ");

        System.out.println(Arrays.toString(word));
        System.out.println(word.length);

        int[] arr={0,2,5,0,6};
        int[] yeniarr=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(yeniarr));

        int ilk_index=0;
        for (int w:arr) {
            if (w != 0) {
                yeniarr[ilk_index] = w;
                ilk_index++;
            }
        }
            System.out.println(Arrays.toString(yeniarr));

    }
}