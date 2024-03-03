package codingbat.WarmUp1;

import org.testng.annotations.Test;

public class NotString {

    @Test
    public void test1() {


        String str = "x";

        if (str.length() >= 3) {

            if (str.substring(0, 3).equals("not ")) {

            } else {

                str = "not " + str;
            }
        }
        System.out.println(str);
    }
}
