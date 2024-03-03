package BankProject;

import org.testng.annotations.Test;

public class BankRunner {
    public static void main(String[] args) {
        Bank omer =new Bank("omer","ali");
        omer.deposit(50);
        System.out.println("omer.hesapOzeti() = " + omer.hesapOzeti());
        omer.withdraw(50);
        System.out.println(omer.hesapOzeti());
    }



    @Test
    public void nnn(){

    }
}
