package D8KOnu_Tekrari;

import org.junit.jupiter.api.Test;

public class Omer1 {
    @Test
    public void test1() {
        String money2 = "$4.54";
        String money3 = "$4.5";
        money3 = money3.replace("$", "");
        money2 = money2.replace("$", "");

        double total = Double.parseDouble(money3.replace("$", "")) + Double.parseDouble(money2);
        double total2 = convert(money2) + convert(money3);
        System.out.println("total = " + total);

    }

    double convert(String money) {
        return Double.parseDouble(money.replace("$", ""));
    }

}
