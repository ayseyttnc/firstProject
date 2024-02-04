package D15ArrayList_Metodcreation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylist05 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.
//           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
//           [12, 23, 10, 19] ==> 12 ve 10

//        iki turlusort  kullanabilir
//        1.Arraylist icinde
//        2.collections(Arraylist icinde yardinmci class ) icinde olan sort
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(9);
//        list lerde dogal siralama da null yazilmasi gerekiyor
//        Collections.sort(nums);
        nums.sort(null);
        System.out.println(nums);
    }
}
