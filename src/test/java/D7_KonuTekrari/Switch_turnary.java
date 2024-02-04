package D7_KonuTekrari;

public class Switch_turnary {
    public static void main(String[] args) {
        int a = -123;
        a= Math.abs(a);
        System.out.println("a: " + a);

        String result= (a>99 || a<1000) ? ("uc basamaklidir"):("uc basamakli degildir");
        System.out.println(result);
    }
}
