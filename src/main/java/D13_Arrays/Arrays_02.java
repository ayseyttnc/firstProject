package D13_Arrays;

import java.util.Arrays;

public class Arrays_02 {
    public static void main(String[] args) {

//sort() methodu sayilari kucukten buyuge siralar (ascending order)
//String data tiplerini alfabetik siralar (alphabetical order)
//ascending order + alphabetical order = natural order
//sort() methodu Array elemanlarini natural order'a gore siralar


///Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
//      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int[] ages=new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        System.out.println(Arrays.toString(ages));
//        nautral order -dogal siralama
//        1.yol
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        System.out.println(ages[0] + ages[ages.length-1]);
//2.yol math.max ve math.min kullanacagiz
       int min=ages[0];
       int max=ages[0];

       for (int w:ages){
           min= Math.min(min,w);
max= Math.max(max,w);
       }
        System.out.println(min);
        System.out.println(max);
        System.out.println(min+max);


        int[] ages1=new int[5];
        ages1[0]=20;
        ages1[1]=24;
        ages1[2]=11;
        ages1[3]=13;
        ages1[4]=2;
        System.out.println(Arrays.toString(ages1));

Arrays.sort(ages1);
        System.out.println(ages1[0]+ ages1[ages1.length-1]);

    }
}