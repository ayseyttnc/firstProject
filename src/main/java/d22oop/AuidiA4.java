package d22oop;

public class AuidiA4 implements Motor,Clima,Fren {
    /*
a) interface'leri parent yapmak icin 'implements' keyword'u child icinde kullanilir

b) extends kullanilmaz cunku bu iki class arasinda kullanilir

c) AudiA4 Class'i, Motor interface'i icindeki tum methodlari override etmek zorundadir.

d) AudiA4 Class'i, Motor interface'i icindeki tum methodlari override etmek zorunda
oldugundan method'larin bas kismina 'override' yazmak gerekmez bu yuzden yazmayiz.

e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
*/

//  motor interface inden override edilenler

    public void eco() {
        System.out.println("audi a4 ekonomik motor kullanir");
    }
 public void turbo() {
        System.out.println("audi a4 ekonomik motor kullanir");
    }
 public void gas() {
        System.out.println("audi a4 ekonomik motor kullanir");
    }

//    klima interface override edilener


    public void analog() {
        System.out.println("audi digital klima  kullanir");
    }
    public void digital() {
        System.out.println("audidigital klima kullanir kullanir");
    }
    //Fren interface'inden override edilenler
    public void abs(){
        System.out.println("Audi A4 abs fren sistemi kullanir");
    }
  public void esp(){
        System.out.println("Audi A4 esp fren sistemi kullanir");
    }
//    odev :audis5 class i olusturup ,interface lere child yapip ,geekli overridelari yapiniz


}