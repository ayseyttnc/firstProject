package Day3_yeni;

public class C03_nested_for_loops {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        int sayi=5;
        for (int i=0; i<sayi; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();


//            for (int i=sayi-1 ; i>0 ;i--){
                for (int j=0 ; j<i ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


