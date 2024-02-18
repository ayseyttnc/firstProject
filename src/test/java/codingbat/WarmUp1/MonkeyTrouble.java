package codingbat.WarmUp1;

import org.junit.jupiter.api.Test;

public class MonkeyTrouble {
    @Test
    void test1() {
    }

    /**
     *
     We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


     monkeyTrouble(true, true) → true
     monkeyTrouble(false, false) → true
     monkeyTrouble(true, false) → false
     */

    
    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        boolean flag;


        if ((aSmile && bSmile)|| (!aSmile&&!bSmile)){
            flag=true;
        }else{
            flag=false;
        }



        return flag;

    }

}
