package d27exceptions;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?


        int a = 12;
        int b = 3;
        String s = "My java";
        getCharFromString(s, a, b);
    }//main disi

    public static void getCharFromString(String s, int a, int b) {

        try {

            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        } catch (ArithmeticException e) {
            System.out.println("sifira bolma yapilamaz : " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("olmayan index kullanmayiniz : " + e.getCause());
            //getcause hatanin sebebini class da yukuluyse verir yoksa null verir
        }
    }

//2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir

    public static void getCharFromString2(String s, int a, int b) {
        {

            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

            try {

                int idx1 = a / b;
                char ch2 = s.charAt(idx);
                System.out.println(ch);

            } catch (Exception e) {
                System.out.println("bir istisna olustu :" + e.getClass());
                //getClass()ile exception 'in cesidini ogrenebiliriz
//
            }
        }
    }
}












