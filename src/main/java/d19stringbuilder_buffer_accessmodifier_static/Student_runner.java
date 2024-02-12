package d19stringbuilder_buffer_accessmodifier_static;

public class Student_runner {
    public static void main(String[] args) {

//        student class tan bir instamce olusturalim
        Student ali=new Student();
        System.out.println(ali.stdname);
        System.out.println(ali.email);
        //        prodected ayni pacjkage oldugu icim ulasilir

//        prodected farkli package olsa child lar gorur
        System.out.println(ali.address);
//        System.out.println(ali.tcKimlik); - HATA ulasilmaz private
    }

}
