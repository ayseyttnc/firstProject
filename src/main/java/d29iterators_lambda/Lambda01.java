package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        /*
Lambda ifadeleri, Java 8 ile birlikte tanıtılan ve fonksiyonel(methodsal) programlamayı
kolaylaştırmak için kullanılan bir özelliktir.

Lambda ifadelerinin genel avantajları:
1- Daha az kod yazma: Lambdalar, daha az ve daha okunabilir kod yazmanızı sağlar.
2- Fonksiyonel programlama: Java'nın fonksiyonel programlama özelliklerini kullanmanıza yardımcı olur.
3- İsimsizdir: Lambda ifadeleri, bir isme sahip değildir.(method ismi yoktur)
4- Tek bir ifade içerebilir: Lambda ifadeleri, bir veya daha fazla işlem gerçekleştiren tek
bir ifade içerebilir.
5- Bir veya daha fazla parametre alabilir*/


        //stream API



        /*1) Lambda Functional Programming'dir, digeri "Structured Programming" dir
Structured Programming: Yapısal programlama, programların belirli yapılar veya kontrol yapıları
(örneğin döngüler, şartlı ifadeler) kullanılarak yazılmasını teşvik eden bir programlamadir.
2) Functional programming, Collection'lar ve Array'ler ile yaygin olarak kullanilir.(Map'lerde direkt kullanilmaz
entrySet ile Set'e cevrilirse kullanilabilir)*/


        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));
        ciftleriYazdir(nums);
//1) Bir list’teki elemanlari ayni satirda aralarina bosluk koyarak
// yazdiran method’u olusturunuz.(Structured == Yapisal)

        printElement(nums);


    }// main disi

    public static void printElement(List<Integer> nums) {

        for (Integer w : nums) {
            System.out.print(w + " ");


        }

    }


    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
//   yazdiran method'u olusturunuz.(Functional)

//stream() metodu, koleksiyonları bir akışa (stream) dönüştürerek üzerinde işlem yapmayı sağlar.
//Akışın (stream) adı, verinin bir kaynaktan hedefe doğru “akmasını” ifade eder.


    public static void printElement2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.println(t + "")); //t degisken adidir akistan gelir.t-> akistan gelen her t degeri icin
        //12 9 131 14 9 10 4 12 15 stream akisa hazirliyor


    }

    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
// yazdiran method'u olusturunuz.(Structured)
    public static void ciftleriYazdir(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.println(w +
                        "");

            }

        }
    }

//4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
//   yazdiran method'u olusturunuz.(Functional)

    //Stream API’si ile birlikte sıkça kullanılan bazı metodlar şunlardır:
//1) filter(): Koşulu karşılayan elemanları filtreler.

    public static void ciftleriYazdir2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));


    }


}



