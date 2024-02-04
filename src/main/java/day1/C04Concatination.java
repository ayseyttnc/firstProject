package day1;

public class
C04Concatination {
    public static void main(String[] args) {
        String str1= "java";
        String str2="guzel";
        int sayi1=5;
        int sayi2=3;
//        java5
        System.out.println(str1+sayi1);
//        java8guzel
        System.out.println(str1+(sayi1+sayi2)+str2);
//        2guzel15
        System.out.println((sayi1-sayi2)+str2+(sayi1*sayi2));

//       java22 1.yol
        System.out.println(str1+(sayi1*sayi1-sayi2));
//        2.yol
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
    }
}
