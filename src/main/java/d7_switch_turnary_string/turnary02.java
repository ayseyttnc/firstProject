package d7_switch_turnary_string;

public class turnary02 {
    public static void main(String[] args) {
//    3 basamkli olup olmadigini yazan kodu yazini
        int a = -123;
//        absolute value , mutlak deger aldik
        a = Math.abs(a);
        System.out.println("a = " + a);

        String result = (a > 99 && a < 1000) ? "uc basamklidir" : " uc basamkli degildir";
        System.out.println(result);
    }
}
