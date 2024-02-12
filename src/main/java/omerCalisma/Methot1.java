package omerCalisma;

import org.testng.annotations.Test;

public class Methot1 {
    @Test
    public void test1() {

        String str = "omer";
        String str1 = "ali";
        //girdi String
        //cikti String in length i

        String substring = str.substring(1);
        int i = substring.length() * 3;
        int i1 = i / 2;
        System.out.println(i1);


        int int1 = sampleMethot(str1);
        int int0 = sampleMethot(str);

        /**
         * Dont
         * Repeat
         * Yourself
         */

    }

     int sampleMethot(String string) {
        String substring = string.substring(1);
        int i = substring.length() * 3;
        int i1 = i / 2;

        return i1;
    }

    private int carpim(int number1, int number2) {
        return number1 * number2;
    }


}
