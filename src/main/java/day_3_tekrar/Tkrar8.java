package day_3_tekrar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tkrar8 {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 7, 10, 20));

        List<String> myList = new ArrayList<>();
        myList.add("ali");
        myList.add("AYSE");
        myList.add("vELI");
        myList.add("john");
//      aHaric(myList);
        List<String> donusList = bestenBuyuk(myList);
        System.out.println(myList);
        // maksimum1(nums);
        // maksimum2(nums);
        // minumum1(nums);
        //  minumum2(nums);
//        enKucukCift(nums);
//        System.out.println("ayse branchi");
        bestenAz(myList);
        tAlBuyuk(myList);
    }//main disi

    public static void aHaric(List<String> mylist) {
        mylist.stream().filter(t -> !t.startsWith("a")).
                forEach(t -> System.out.println(t + " "));
    }

    public static List<String> bestenBuyuk(List<String> mylist) {
        return mylist.stream().filter(t -> t.length() > 5).map(String::toUpperCase).collect(Collectors.toList());

    }

    public static void bestenAz(List<String> mylist) {
        mylist.stream().distinct().filter(t -> t.length() < 5).map(String::toLowerCase).sorted().forEach(t -> System.out.println(t + " "));
    }

    public static void tAlBuyuk(List<String> mylist) {
        mylist.stream().distinct().map(String::toUpperCase).sorted().forEach(t -> System.out.println(t + " "));
    }

    public static void kucuktenBuyuk(List<String> mylist) {
        mylist.stream().
                distinct().
                map(String:: toUpperCase).
                sorted(Comparator.comparing(String::length)).
                forEach(t -> System.out.println(t + " "));
    }


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

    public static void enKucukCift(List<Integer> nums) {
        Integer min = nums.stream().distinct().filter(t -> t > 7 && t % 2 == 0).
                sorted().findFirst().get();
        System.out.println(min);
    }

}
