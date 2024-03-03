package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda05 {
    public static void main(String[] args) {
        List<Integer> nums1=new ArrayList<>(Arrays.asList(2,4,3,5,11,13));
        tekrarsizCiftKare(nums1);


    }//main disi
    //1) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
// "çarpımını" hesaplayan bir method oluşturun
    public static void tekrarsizCiftKare(List<Integer> nums1) {
        int carpim = nums1.stream().
                distinct().
                filter(t -> t % 2 ==0).
                map(t -> t * t).
                reduce(1 , (t,u)-> t * u);
        System.out.println(carpim);
    }


}
