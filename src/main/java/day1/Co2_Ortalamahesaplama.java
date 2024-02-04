package day1;

public class Co2_Ortalamahesaplama {
    public static void main(String[] args) {
double nun1 = 20.5;
double nun2 = 24.4;
double nun3 = 10.2;
double nun4 = 550;
double nun5 =95;
//yukaridaki say
// ilari ortalamasini bulan bir kad yazma
//        tum sayilari yazip 5 e bolme
//        1.yol
        double toplam = nun1+nun2+nun3+nun4+nun5;
        System.out.println("ortalama : " + toplam/5);

//        2.yol
        double ortalama = toplam/5;
        System.out.println("ortalama =" + ortalama);

//        3.yol
        System.out.println((nun1+nun2+nun3+nun4+nun5)/5);

    }
}
