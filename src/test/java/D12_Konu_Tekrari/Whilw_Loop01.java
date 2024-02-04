package D12_Konu_Tekrari;

public class Whilw_Loop01 {
    public static void main(String[] args) {
        //        /Ornek 1: 3'den 6'ya kadar tamsayilari console’a yazdiriniz (3 ve 6 dahil)

        for (int i = 3; i <7 ; i++) {
            System.out.println(i);
        }
        int j=3;
        while (j<7){
            System.out.println(j);
            j++;
        }
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

        ///Odev: //Ornek 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz(12 dahil)

int k=23;
while (k>11){
    if (k%2==0){
        System.out.println(k);
    }

    k--;
}
        System.out.println("k cift sayidir");

    }
}
