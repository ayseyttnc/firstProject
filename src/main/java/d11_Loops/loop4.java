package d11_Loops;

public class loop4 {
    public static void main(String[] args) {
        /*
ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
            Week: 1
                Day: 1
                Day: 2
                Day: 3
                .....
            Week: 2
                Day: 1
                Day: 2
                Day: 3
//                ....    */
//        bir ayda 4 hafta var icin
//outer loop , inner loop
//nested for

        for (int week = 1; week < 3; week++) {
//            System.out.println("week = " + week);
            for (int day = 1; day < 8; day++) {
//                System.out.println("day = " + day);
            }
//            System.out.println("............");
        }

//* Ornek 2:
//        Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

//                X X X X X
//                X X X X X
//                X X X X X    */
//bos sout isaretciyi(pointer) bir alta almak icin kulanilirn
//        Scanner scan = new Scanner(System.in);
//        System.out.println("satir sayilarini giriniz");
//        int satir = scan.nextInt();
//        System.out.println("sutun sayialarini giriniz");
//        int sutun = scan.nextInt();
//int satir=3;
//int sutun=5;
//        for (int i = 1; i <= satir; i++) {
//            for (int j = 1; j <= sutun; j++) {
////                System.out.print("X ");
//
//
//            }
////            System.out.println();
//        }
//        //Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        /*

         *
         * *
         * * *
         * * * *

         */

        for (int i = 1; i < 6; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
//            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        }

        for (int j = 4; j > 0; j--) {

            for (int i = 4; i <5; i++) {
                System.out.println(i);

            }
        }


    }
}

