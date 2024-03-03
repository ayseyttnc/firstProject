package day_3_tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lmabda01_tekrar {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 10, 14, 9, 10, 4, 12));
        printElement2(nums);
        ciftleriYazdir(nums);
        tekSayiKare(nums);
        tekKupTekrariz(nums);
        tekrarsizCiftToplam(nums);
        tekrarsizCiftKare(nums);
    }//main disi

    public static void printElement2(List<Integer> nums) {
//        nums.stream().forEach(t -> System.out.println(t + " "));
//


    }

    public static void ciftleriYazdir(List<Integer> nums) {
//        nums.stream().filter(t -> t%2==0).forEach(t -> System.out.print(t + " "));


    }

    public static void tekSayiKare(List<Integer> nums) {
//        nums.stream().filter(t -> t%2 != 0).map(t -> t*t).forEach(t -> System.out.println(t +" "));


    }

    public static void tekKupTekrariz(List<Integer> nums) {
//        nums.stream().distinct().filter(t -> t%2 !=0).map(t -> t*t*t).forEach(t -> System.out.println(t + " "));

    }

    public static void tekrarsizCiftToplam(List<Integer> nums) {
        int toplam = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, Integer::sum);
//        System.out.println(toplam);


    }

    public static void tekrarsizCiftKare(List<Integer> nums) {
        int carpim = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);
    }


}
