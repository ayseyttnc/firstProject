package day_3_tekrar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tekrar_09 {
    public static void main(String[] args) {
//        ArrayList<String> r = new ArrayList<>();
//        r.add("manissa");

//        r.add("nigde");
//        r.add("tokat");
//        r.add("van");

//        System.out.println(r);
//        for (int i = 0; i < r.size(); i++) {
//            if (r.get(i).contains("a")) ;
//            r.remove(i);
//            i--;}
//        }

//        System.out.println(r);

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(32);
        nums.add(5);
        nums.add(21);

        nums.sort(null);
        System.out.println(nums);
        int minfark = nums.get(1) - nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            minfark = Math.min(minfark, nums.get(i) - nums.get(i - 1));

        }
        System.out.println(minfark);


        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) - nums.get(i - 1) == minfark) {
                System.out.println(nums.get(i) + "ve" + nums.get(i - 1));
            }


    }

        List<Integer> mylist = Arrays.asList(1,2,3,4,5);
        System.out.println(mylist);

        mylist.set(0,5);
        System.out.println(mylist.size());


    }









}
