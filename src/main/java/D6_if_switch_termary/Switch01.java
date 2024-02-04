package D6_if_switch_termary;

public class Switch01 {


    public static void main(String[] args) {
//        /switch ifadesi, farklı koşullara dayalı olarak farklı eylemler gerçekleştirmek için kullanılır.
//if -else if’in yaptigini yapar. Okumasi ve yazmasi daha kolaydir.
//genel kullanimda, 3'ten fazla durum varsa switch kullaniriz.(best practise)
   /*Ornek 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
Sunday==>1  . . .  Saturday==>7

1.Yol : if - else if*/

        String dayname = "WEdnesday";
        String friday = "friday";
        dayname.equalsIgnoreCase(friday);


        if (dayname.equalsIgnoreCase("sunday")) {
            System.out.println(1);
        } else if (dayname.equalsIgnoreCase("monday")) {
            System.out.println(2);
        } else if (dayname.equalsIgnoreCase("tuesday")) {
            System.out.println(3);
        } else if (dayname.equalsIgnoreCase("wednesday")) {
            System.out.println(4);
        } else if (dayname.equalsIgnoreCase("tuersdy")) {
            System.out.println(5);
        } else if (dayname.equalsIgnoreCase("fridy")) {
            System.out.println(6);
        } else if (dayname.equalsIgnoreCase("saturday")) {
            System.out.println(7);
        } else {
            System.out.println("lutfen gecerli gun giriniz");
        }
        switch (dayname.toLowerCase()) {
            case "sunday":

                System.out.println(1);
                break;
            case "monday":

                System.out.println(2);
                break;
            case "tuesday":

                System.out.println(3);
                break;
            case "wednesday":

                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":

                System.out.println(6);
                break;
            case "saturday":

                System.out.println(7);
                break;
            default:

                System.out.println("gecerli bir gun adi giriniz");

        }
    }

}
