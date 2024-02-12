package day_3_tekrar;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Home_Runner {
    static Home h1 = new Home(4, 50, 15, true);

    public static void main(String[] args) {
        double expectedResult = 200;
        double actualResult = h1.calculatePayment();
        Assert.assertEquals(actualResult, expectedResult, "isleminiz yanlis oldu");

        Home h2 = new Home(2, 54, 14, false);

        double expectedH2= 50;
        double actualH2= h2.calculatePayment();
        Assert.assertTrue(actualH2==expectedH2);


    }
    @Test
    public void test1(){
        Home uS001=new Home(2,45,11,true,0,true);
        double expectedResult=300;
        double actualResult = uS001.calculatePayment();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public  void test2(){
Home uS002= new Home(2,45,11,false,0,false);
double expectedResult=50;
double actualresult=uS002.calculatePayment();
Assert.assertEquals(actualresult,expectedResult);
    }

}