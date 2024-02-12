package omerCalisma;

import org.testng.annotations.Test;

public class DenemeRegister {
    @Test
    public void test1(){
        Register omer=new Register("omer","ali",36);
        Register ayse=new Register("ayse","boz",30,500);
        ayse.setSurname("iyi");
        System.out.println("ayse.getSurname() = " + ayse.getSurname());
        ayse.accountDetail();
//        omer.deposit(500);
//        omer.deposit(250);
//        System.out.println("omer.checkTotal() = " + omer.checkTotal());
//        omer.withdraw(300);
//        System.out.println("omer.checkTotal() = " + omer.checkTotal());
//        omer.withdraw(500);
//         omer.checkTotal();


    }
}
