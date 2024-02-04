package d11_Loops;

public class While_Loop01 {
    public static void main(String[] args) {
//        for(baslangic degeri; loop calisma kurli ;arttirma\azaltma)
//        baslangiz degeri
//      while (loop_calisma kurali){
//            calisma kurali
//                    arttirma /azaltma
//        netlik varsa for ,netlik yoksa while
//        /Ornek 1: 3'den 6'ya kadar tamsayilari console’a yazdiriniz (3 ve 6 dahil)
//      1.yol
        for (int i = 3; i < 7; i++) {
//            System.out.println(i);
        }

//            System.out.println("...............");

//      2.yol
        int i = 3;
        while (i < 7) {
            System.out.print(i);
            i++;
        }


    }
}
