package D8KOnu_Tekrari;

public class String_Manipulastion {
    public static void main(String[] args) {
//        String s="java is easy";
//        String sub1=s.substring(0,4);
//        System.out.println("sub1 = " + sub1);
//
//        String sub2=s.substring(4,7);
//        System.out.println("sub2 = " + sub2.length());
//        System.out.println("sub2 = " + sub2);
//
//        String sub3=s.substring(8,11);
//        System.out.println("sub3 = " + sub3);
//


        String s="omer ali at ak 567 ";
        String sub1=s.substring(0,s.length()-1);
        System.out.println(sub1);
        System.out.println(s.length()-1);

        boolean isexixt=s.contains("o");
        System.out.println("isexixt = " + isexixt);

        boolean isStart=s.startsWith("m");
        System.out.println("isStart = " + isStart);

        boolean isend=s.endsWith("omer ali");
        System.out.println("isend = " + isend);

        String sub3=s.replace("omer" , "ayse");
        System.out.println("sub3 = " + sub3);

        String sub4=s.replace("a","e");
        System.out.println("sub4 = " + sub4);

        String sub5=s.replaceAll("[a-z]"," ");
        System.out.println("sub5 = " + sub5);

        String sub6=s.replaceAll("[^0-9]", " ");
        System.out.println("sub6 = " + sub6);




    }
    }



