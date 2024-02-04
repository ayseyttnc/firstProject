package D9_Konu_Tekrari;

public class New_String_Manipulation2 {
    public static void main(String[] args) {
        String s = "yusuf";
        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.println("y");
        }
        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.println("u");
        }
        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.println("s");
        }
        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.println("u");
        }
        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.println("f");
        }
        System.out.println();


        String cardnum = "1234 6789 1234 6789";
        String first = cardnum.substring(0, 15).replaceAll("[0-9]", "*");
        System.out.println("first = " + first);

        String last=cardnum.substring(15);
        System.out.println("last = " + last);

        String result=first+last;
        System.out.println("result = " + result);

String result2=first.concat(last);
        System.out.println("result2 = " + result2);

String pwd="a";
//        boolean first =pwd.isEmpty();

//        System.out.println("first = " + first);


        System.out.println(".......................");


        String str1=new String("merhaba");
        String str2=new String("merhaba");
        String str3=str1;
        System.out.println(str1==str2);
        System.out.println(str1.equals((str2)));

        System.out.println(str1==str2);

        System.out.println("..........");
//odev
        for (int i=4 ; i<20 ;i+=2){
            System.out.println("i = " + i);

        }
    }

}




