package Day_04_practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_Ortak_isimler {
    public static void main(String[] args) {
        /*

        Iki array'de ortak olan isimleri bir yerde toplayiniz.

        1. Array: { Jace, John, Mark, Jack, Emma}
        2. Array: { Anna, Brad, Johnny, Mark, Emma }

        Mark, Emma

 */
      String[] arr={" Jace", "John", "Mark", "Jack", "Emma"};
      String[] arr1={ "Anna", "Brad", "Johnny"," Mark", "Emma" };

        Set<String> set=new HashSet<>();
        Set<String> resultset=new HashSet<>();
        for(String s:arr){
            set.add(s);
        }for(String s: arr1){
            if (set.contains(s)){
                resultset.add(s);
            }
arr=arr1;
        }
        System.out.println("ortak isimler");
        for (String s:resultset){
            System.out.println(s);
        }
    }
}
