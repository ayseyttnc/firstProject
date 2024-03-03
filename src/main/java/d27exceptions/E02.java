package d27exceptions;

public class E02 {
    public static void main(String[] args) {
        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
        String s = "1234a";
        convertStringToInt(s);


    } //main disi
    public static void convertStringToInt(String s){
        try{
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1); //1'i donusturup donusturmedigini anlamak icin yazdik. 1235


        }catch (NumberFormatException e){
            System.out.println("donusum icin rakam disi karakter kullanmayiniz :" + e.getMessage());

        }
        //filewriter, printwriter hatalar loclanabiliri ve izleme imkani oluyor -exception lari disariya alabilirsiniz.

      }
}
