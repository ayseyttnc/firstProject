package d9String_loops;

public class newString_manipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
// tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

//        1, yol hard code tavsiye edilmez
        String  a="abc@gmail.com";
        System.out.println(a.substring(4,9));

//        2.yol dinamic
        String company=a.split("@")[1].split("\\.")[0];
        System.out.println("company = " + company);

//indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
////Bu method olmayan karakterler icin -1 verir

       int startingindex= a.indexOf("@");
       int endingindex=a.indexOf(".");
        System.out.println("endingindex = " + endingindex);

        String companyName=a.substring(startingindex, endingindex);
        System.out.println("companyName = " + companyName);

    }
}
