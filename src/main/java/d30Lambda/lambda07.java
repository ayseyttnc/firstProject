package d30Lambda;

import java.util.*;

public class lambda07 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        //  minumum1(nums);
        //  minumum2(nums);
        //  minumum3(nums);
        // minumum4(nums);
        minumum5(nums);


//7)Verilen List’teki “minimum değeri” bulmak için bir method oluşturun

    }//main disi

    public static void minumum1(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min); //2

    }//2.yol

    // sorted(Comparator.reverseOrder()) ifadesi,
// Java Stream API’si içinde bir koleksiyonu ters sıralamak için kullanılır.
//Comparator class, reverseOrder() methoddur.
    public static void minumum2(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).
                reduce((t, u) -> u).get();
        // System.out.println(min);


    }//3.yol

    public static void minumum3(List<Integer> nums) {
        Optional<Integer> min = nums.stream().distinct().sorted().reduce((t, u) -> t);

        if (min.isPresent()) {//min de bir deger varmi anlaminda
            System.out.println(min.get());

        } else {
            System.out.println("liste bos veya deger bulunamadi");

        }

    }//4.yol

    public static void minumum4(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> Math.min(t, u)).get();
        System.out.println(min);
    }//5.yol

    public static void minumum5(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min);

    }




}


