package D14_Array_Arraylist;

import java.util.Arrays;

public class M_D01 {
    public static void main(String[] args) {

        //Cok boyutlu dizi (MultiDimensional Array) temel olarak Array'in içine Array koymak anlamına gelir.
// En yaygın örneği iki boyutlu dizilerdir, ki bunlar genellikle matris olarak düşünülebilir.
// İki boyutlu bir dizi, satır ve sütunlardan oluşur, tıpkı bir Excel tablosu gibi.

//MultiDimensional Array nasil olusturulur?

int[][] a= new int[3][2];
//nasil elemanen eklenir

        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=81;
        a[1][1]=45;
        a[2][0]=123;
        a[2][1]=5;
//coklu arraylar bu sekilde yazdirilmaz
//        System.out.println(Arrays.toString(a)); deepToString() kullancaz
        System.out.println(Arrays.deepToString(a));

        //MultiDimensional Array’den spesifik bir eleman nasil yazdirilir?

        System.out.println(a[1][1]);

///MultiDimensional Array icindeki bir Array nasil yazdirilir?
        System.out.println(Arrays.toString(a[2]));

        //Kisa yoldan MultiDimensional Array nasil olusturulur?


            String[][] students = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Burhan"}};
            System.out.println(Arrays.deepToString(students));
            //[[Ali, Kemal], [Cemal], [Ayhan, Beyhan, Seyhan], [Ceyhan, Burhan]]

///Ornek 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

int toplam=0;
for (String[] w: students){
        toplam=toplam+w.length;

}
            System.out.println(toplam);


///Ornek 2: Yukaridaki students Array'inde icinde "m" olan isimleri console'a yazdiriniz

            for (String[] w: students){
                    for (String k:w){
                            if (k.contains("m")){
                                    System.out.println(k);
                            }
                    }

            }





    }
}
