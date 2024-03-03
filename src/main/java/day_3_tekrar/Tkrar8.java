package day_3_tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tkrar8 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 7, 10, 20));
        // maksimum1(nums);
        // maksimum2(nums);
        // minumum1(nums);
      //  minumum2(nums);
        enKucukCift(nums);
    }//main disi

    public static void maksimum1(List<Integer> nums) {
        int max = nums.stream().distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    public static void maksimum2(List<Integer> nums) {
        Integer max = nums.stream().
                distinct().
                reduce(Math::max).get();
        System.out.println(max);
    }

    public static void minumum1(List<Integer> nums) {
        int min = nums.stream().distinct().
                reduce(Math::min).get();
        System.out.println(min);
    }

    public static void minumum2(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t, u) -> u).get();
        System.out.println(min);

    }
public static void enKucukCift(List<Integer> nums){
        Integer min=nums.stream().distinct().filter(t -> t>7 && t%2==0).
                sorted().findFirst().get();
    System.out.println(min);
}

}
