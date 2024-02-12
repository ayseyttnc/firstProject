package d17passbyvalue_constructors_datetime;

public class Car {
//    oop -object  1.aktif 2.pasif ,object
    /*  1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle main methoduna ihtiyaç duymazsınız.
    2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken,
main methodu oluşturmanız gerekebilir.
    3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method'lu class olur.
Adina da "runner" eklenir.*/

//1-variable'lar olusturalim (pasif ozellikler)

    String brand="honda";
    String model="accord";
    int year=2023;
    boolean hybrid=true;

    public Car(String brand,int year
            , String model, boolean isHybrid) {
    }


//    2.methodlar olusturlim(aktif ozellikler)

    public  void hareket(){
        System.out.println(brand +"hizli hareket eder");
    }

    public void dur(){
        System.out.println(brand +"guvenli bir sekilde durur");
    }


    //toString methodu
//sag tik generate . tostirng -istedigin degiskeni sec ok de


    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
//    constructor olusturmanin kisa yolu

    //Constructor olusturmanin kisa yolu
    //sag tik >> Generate >> Constructor >> mac'te command, win'de control ile sec >> ok
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';

    }
//
  //  public Car getC3() {
//        return c3;
//    }

}
