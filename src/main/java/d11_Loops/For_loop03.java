package d11_Loops;

public class For_loop03 {
    public static void main(String[] args) {
        //Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunnuz.
//            28.587 ==> 5+8+7=
//        \\ nokta bizim bildigimiz nokta
//        unboxing
        double num=  28.587;
        String snum=String.valueOf(num);
       String decimalpart= snum.split("[\\.]")[1];

       int intdecimalpart= Integer.valueOf(decimalpart);

int sum=0;
for(int i = intdecimalpart; i>0 ; i= i/10){

    sum=sum+i%10;
    System.out.print("sum = " + sum);


}



    }
}
