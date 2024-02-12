package D16_ders;

import java.util.ArrayList;
import java.util.List;

public class Arraylist01 {
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
        nums.add(19);
//        list lerde dogal siralama da null yazilmasi gerekiyor
//        Collections.sort(nums);
        nums.sort(null);
        System.out.println(nums);
        int minfark=nums.get(1)-nums.get(0);
//1 den baslattik ki 1, indexten o. indexi cikarabilelim
        for (int i = 1; i <nums.size() ; i++) {
            minfark=Math.min(minfark,nums.get(i)-nums.get(i-1));
        }
        System.out.println(minfark);

        System.out.println(";;;;;;;;;");

//        en kuduk farki min farki hangi sayilardn elde ettigimizi bulalim


        for (int i = 1; i < nums.size(); i++) {
//            /min farki hangi cikarma isleminde buldugumzu arastiracacgi ve o cikarm islemindeki sayilari konsola yazdiracagiz

          if (nums.get(i)- nums.get(i-1)== minfark){
              System.out.println(nums.get(i)+ "ve"+ nums.get(i-1));
          }


        }





    }
}
