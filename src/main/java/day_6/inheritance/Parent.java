package day_6.inheritance;

public class Parent {
//    POJO CLASS
            /*
            - Variable/Field
            - Constructor
            - Method (Opsiyonel)
            - Getter & Setter
            - toString (Opsiyonel)
         */
        /*
            - isim ve soyisim static değişkenleri oluşturalım.
            - method1 ve method2 static method'ları oluşturalım.
            - yas isimli bir instance variable oluşturalım.
            - method3 ve method4 isimli instance method'lar oluşturalım.
            - Oluşturduğumuz değişken ve method'ları, Child class'tan inheritance yaparak çağıralım.
        */
//    parant.isim
//    protected static String isim="Ali";
////    parent.soyisim
//    protected  static String soyisim="Can";
//
////      - method1 ve method2 static method'ları oluşturalım.
//    protected static void method1(){
//        System.out.println("parent class static method 2");
//
////        protected static  void method2;(){
////            System.out.println("parent class method 2");
//
//        protected static void method2(){
//            System.out.println("Parent class static method2");
//        }
//
//
//
//        // - yas isimli bir instance variable oluşturalım.
//        int yas = 30;
//
//
//
//        // - method3 ve method4 isimli instance method'lar oluşturalım.
//        protected void method3(){
//            System.out.println("Parent class instance method3");
//        }
//
//        protected void method4(){
//            System.out.println("Parent class instance method4");
//        }
//
//
//
//
//    }
            /*
            1 - Variable/Field
            2 - Constructor
            3 - Method (Opsiyonel)
            4 - Getter & Setter
            5 - toString (Opsiyonel)
         */
        /*
            - isim ve soyisim static değişkenleri oluşturalım.
            - method1 ve method2 static method'ları oluşturalım.
            - yas isimli bir instance variable oluşturalım.
            - method3 ve method4 isimli instance method'lar oluşturalım.
            - Oluşturduğumuz değişken ve method'ları, Child class'tan inheritance yaparak çağıralım.
        */

    // - isim ve soyisim static değişkenleri oluşturalım.
    protected static String isim = "Ali"; // Parent.isim

    protected static String soyisim = "Can"; // Parent.soyisim

public Parent(){

}

    // - method1 ve method2 static method'ları oluşturalım.
    protected static void method1(){
        System.out.println("Parent class static method1");
    }

    protected static void method2(){
        System.out.println("Parent class static method2");
    }



    // - yas isimli bir instance variable oluşturalım.
    protected int yas = 30;



    // - method3 ve method4 isimli instance method'lar oluşturalım.
    protected void method3(){
        System.out.println("Parent class instance method3");
    }

    protected void method4(){
        System.out.println("Parent class instance method4");
    }

//constructor in ismi class ile ayni olmak zorunda methodlar kucuk harfle constractorlar buyuk harfle
//




}

