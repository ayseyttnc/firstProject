package d19stringbuilder_buffer_accessmodifier_static;

import java.security.PrivateKey;

public class Student {
//   access modifier-erisim belirleyici

    /*
    1)public
    2)protected
    3)default
    4)private

    public > protected > default > private

    public      ==>  public olanlar her class'dan kullanilabilir
    protected   ==> protected olanlar baska package'lardan kullanilamaz, ancak baska package'larda child classlar icinden kullanilabilir
    default     ==> default olanlar baska package'lardan kullanilamazlar
    private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

    Soru: "protected ile default" arasindaki farki söyleyiniz?
    Cevap: protected olanlar baska package'lardan kullanilamaz ancak baska package'larda
    child classlar icinden kullanilabilir. default olanlar baska package'lardan kullanilamazlar
 */


    public String stdname="Ali Can";
    protected  String address="Istanbul";

    String email ="alican@gamil.com";

    private String tcKimlik="12345";

    @Override
    public String toString() {
        return "Student{" +
                "stdname='" + stdname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

