package d17passbyvalue_constructors_datetime;

import day_3_tekrar.UserInfo;

import java.util.Scanner;

public class CarRunner {

  static   Car c1 = new Car("honda",2035,"x5",true);

    public static void main(String[] args) {

        UserInfo person1 = new UserInfo("omer", 23, true);
        UserInfo person2= new UserInfo("ayse",50,true);
        System.out.println("person1.getName() = " + person1.getName());
        System.out.println("person1.dob() = " + person1.dob());
        person1.emeklilik();

        person2.emeklilik();
//        int age= 23;
//        boolean isFemale= true;
//
//        if(age>30 && isFemale){
//            System.out.println("emekli oldunuz");
//        }else {
//            System.out.println("olene kadar calis");
//        }




    }}
//
//        String name="omer";
//        System.out.println(c1.brand);
//        System.out.println(c1.model);
//        System.out.println(c1.year);
//        System.out.println(c1.hybrid);
//
//        c1.hareket();
//        c1.dur();
//
////        car class indan object uretelim
//
////        String s = new String();
////        s.substring(0, 1);
//    }
////    non static dir olusturualan obje uzerinden cagiriliyor
//
////        Math.min() bu static metod direk class ismiyle cagirirliyor
////       default constrauctor Car()
//
////
//
//    }
///*6-
//Constructor nedir?
//Classtan object olusturmamizi saglayan bolumdur.
//Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
//Bu constructor'lara "default constructor" denir.
//default constructor ===> Car () */
////Ama car class'i bize hep ayni degerleri gonderir. Bu class'i kullanip farkli degerler olusturabiliriz.
////Kendiniz constructor'inizi olusturdugunuz zaman Java default constructor'i siler
//
//
//    //Constructor (costume -parametreli contuctorlar da denir)nasil olusturulur?
//
////Access Modifier + Class ismi + () + {}
////---------
///*Method ile Constructor arasindaki fark nedir? Interview Sorusu
//1)Methodlarda return type olur, constructor'larda olmaz
//2)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
//3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir
//4)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar
//
//Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip object'ler olusturabiliriz*/
////SOR
////    Car c1 = new Car("BMW","3.20",2024,false); // default constructor (costum constractor
////public Car(String brand, String model, int year, boolean hybrid) {
//
////    this.brand = brand;
////    this.model = model;
////    this.year = year;
////    this.hybrid = hybrid;
////    Car c1 = new Car("BMW","3.20",2024,false); // default constructor
//
//
////    Car c2=new Car("audi","a5",2018,false);
////sout (c2.brand);
////
////sout (c1);
////sout(c2);
//
////Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.
//
//    //--------------------
////    Car c2 = new Car("Audi", "A5", 2018,false);
////System.out.println(c2.brand); //Audi
////
////System.out.println(c1); //@7a81197d
////System.out.println(c2); //@5ca881b5
//
////Java'da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.
//
//
//
