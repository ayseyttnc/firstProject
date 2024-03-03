package d27exceptions;

public class E06 {
    public static void main(String[] args) {


//    /5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur
String s="java";
karakterSayisi(s);
String t="";
karakterSayisi(t);

String u=null;
karakterSayisi(u);
    }
    public static void karakterSayisi(String s){
        try {
            int a=s.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.err.println("null degeri ile lenght methodunu kullanmayiniz  " );

        }

    }
}
