package omer_paket;

import org.testng.annotations.Test;

public class HesaplamaRunne extends AHesaplama{



    @Test
    public void test1(){
        print("omer");
        System.out.println("_____________________");
        print(3);

    }

    void print(String str){
        System.out.println("String is called");
        System.out.println(str);
    }

    void print(int num){
        System.out.println("int is called");
        System.out.println(num);

    }


    @Override
    void seneSonuHesaplamaABSTRATCT() {

    }


}
