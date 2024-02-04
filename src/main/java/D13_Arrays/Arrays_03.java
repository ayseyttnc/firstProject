package D13_Arrays;

import java.util.Arrays;

public class Arrays_03 {
    public static void main(String[] args) {
        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
//           [12, 3, -3, 5, 23] ==> 3, -3

//        arrayleri kisa yolla nasil yazabiliriz
        int[] num={12,3,-3,5,23};
        System.out.println(Arrays.toString(num));

        for (int w:num) {
            if (w<5){
                System.out.print(w+", ");

            }

        }
        System.out.println("..................");
//binarySearch() methodu var olan elemanlar icin size o elemanin index'ini verir
//binarySearch() methodunu sort() kullanmadan kullanmayiniz
//binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
// "-" ==> isaretinin anlami eleman yok demekti
   /*
Yani, metot şu şekilde çalışır:
    Diziyi ikiye bölün.
    Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
    Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
    Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
    Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar tekrar edilir.
 */


//Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
//           [12, 3, -3, 5, 23] ==> 3, -3

        System.out.println("..................");
        int[]arr={2,1,7,6};

        Arrays.sort(arr);
        for (int w:arr){
            if (w<5){
                System.out.println(w);

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,7));
        System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.binarySearch(arr,65));

        String[] str = {"A", "C", "B", "D"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); //[A, B, C, D]
        System.out.println(Arrays.binarySearch(str,"a"));
        System.out.println(Arrays.binarySearch(str,"C"));
        System.out.println(Arrays.binarySearch(str,"E"));
        System.out.println(Arrays.binarySearch(str,"G"));

        System.out.println("'''''''''''");
        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
//String s = "Java is easy. Learn Java earn money.";
        String s="java is easy .learn java earn money.";
       String[] words= s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
//7 olmasi gerekiryordu


    }
}
