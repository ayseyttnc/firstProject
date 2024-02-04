package day1;

public class Co1_Variable {
    public static void main(String[] args) {
//        bir yas variable olustur veya yazdir
        byte age=18;
        System.out.println("age :  " + age);
        System.out.println("age = " + age);
        int sayi= 2343;
        System.out.println("sayi= " +sayi);
//        bir benim yasim olusturma
        byte myage=age;
        System.out.println(myage);
//        bir isim variabla
        String isim="ali";
        System.out.println("isim="+ isim);
//        bir benim isimvariable olusturma mevcut isim degiskeninden kendisine atayalim
        String benimismim= isim;
        System.out.println("benim ismim :" + benimismim);

//isim objesini degistirmek icin
        isim="mehmet";
        System.out.println("isim :" + isim);
        System.out.println("benim ismim :" + benimismim);

    }
//    sayi degiskeni olusturma






}
