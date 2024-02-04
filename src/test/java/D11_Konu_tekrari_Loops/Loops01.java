package D11_Konu_tekrari_Loops;

public class Loops01 {
    public static void main(String[] args) {
String s="Tramvay";
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i)=='a'){
                break;
            }
else {
        System.out.print(s.charAt(i));}
        }
        String s2="Pwd12?Ab";
        for (int i = 0; i <s2.length() ; i++) {
            char ch=s2.charAt(i);

           if (s2.charAt(i)>= 'a'&& s2.charAt(i)<='z'){
           }
           else {
               System.out.print(ch);
           }

        }



    }

}
