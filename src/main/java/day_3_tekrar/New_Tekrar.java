package day_3_tekrar;

public class New_Tekrar {
    public static void main(String[] args) {
        String str="1a 2B-";
        String result=str.replaceAll("\\S","*");
        System.out.println("result = " + result);

        String str1="1a 49Bg-";
        String result1=str1.replaceAll("[a-z]"," ");
        System.out.println("result1 = " + result1);

        System.out.println(Long.MAX_VALUE);


        System.out.println(2+4!=5);
    }
}
