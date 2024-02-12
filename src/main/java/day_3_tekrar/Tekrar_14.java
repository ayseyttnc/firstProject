package day_3_tekrar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tekrar_14 {
static int price;

static{
            System.out.println("satatic block 2");
    LocalDate currentdate=LocalDate.now();
    if (currentdate.getDayOfMonth()==2){
        price=1000;
        System.out.println(price);

    }else {
        price=2000;
        System.out.println("price = " + price);
    }
    
    }
}
