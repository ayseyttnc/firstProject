package d9String_loops;

public class newString_manipulation03 {
    public static void main(String[] args) {
        /*Ornek 1: B girilmeden gecilmemeli, en az bir karakter icermelidir.
2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
3- Başında ve sonir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

1- Parola hicbir seyunda boşluk olmamalıdır.*/

//Not: isEmpty() metodu sadece hicligi kontrol eder (true verir).
//isBlank() metodu ise hem hicligi hemde space’i kontrol eder(true verir)

//        1. isempty boslugu kontrol etmez sadece hicligi kontrol eder
        String pwd="a";
       boolean first =pwd.isEmpty();
        System.out.println(first);







//         2.isblank space side konr=trol hicligide kontrol eder hiclikte true
boolean second=pwd.isBlank();
        System.out.println(second);

//        3. basindaki ve sonundaki bosluklari alinca ilk haline esitse orjinal bosluk yoktur
//        son hali ilk haliyle ayni ise true degilse false trim kullaniriz
        boolean trird=pwd.trim().equals(pwd);
        System.out.println("trird = " + trird);

        if (first){
            System.out.println("parola hic birey yazmadan gecilemez");
        }
        if (second){
            System.out.println("parol bos birkilmamali bosluk harici karakter olamlidir");
        }

    }
}
