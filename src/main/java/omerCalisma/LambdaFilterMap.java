package omerCalisma;

import org.testng.annotations.Test;

import java.util.List;

public class LambdaFilterMap {
    @Test
    public void test1(){
        List<Integer>list=List.of(2,3,4,5,6);

        list.stream()
                .map(LambdaFilterMap::square)
               // .filter()
                .forEach(System.out::println);


    }


    public static int square(int number){
        if(number%2==0){
            return number * number;
        }else {
            return number;
        }

    }



}
