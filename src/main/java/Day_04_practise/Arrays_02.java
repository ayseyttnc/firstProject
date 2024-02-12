package Day_04_practise;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_02 {
    public static void main(String[] args) {
/*

        - 3 elemanlı bir int array oluşturunuz
        - Array'in elemanlarını, sırası ile kullanıcıdan alınız
        - Array'deki elemanların ortalamasını bulunuz, yazdırınız
        - Bulunan ortalamadan daha büyük değere sahip olan elemanları yazdırınız

// */
//        ilk gorev
        int [] arr=new int[3];
// 2.gorev
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("sayi giriniz");
            arr[i]=scanner.nextInt();
        }

//        3. asma

        double toplam=0;
        for (int s: arr){
            toplam+=s;
        }
//        double ortalama =double toplam/arr.lenght eger toplamin onun ebata int yazdiksakboyle kullanacagiz
        double ortalama=toplam/arr.length;
        System.out.println("ortalama:" +ortalama);

//        4.asma

        for (int sayi :arr){
            if (sayi>ortalama){
                System.out.println(sayi);
            }
        }
    }
}
