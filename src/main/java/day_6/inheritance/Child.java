package day_6.inheritance;

public class Child extends Parent{
    public static void main(String[] args) {
        System.out.println(Parent.isim);
        Parent.method1();

        Parent p=new Parent();
        System.out.println(p.yas);

        Child c=new Child();
        System.out.println(c.yas);
//        child parentin variable in kullnabilir

        Parent parent=new Child();

//        araba diye bir class olusturun yeni class olusturdum ismi opel sonra
//        araba extend opel sonra corsa olusturdum ve sonra corsa opel in child i oldu

//        araba-> opel ->corsa
//       Opel opel=new opel()
//        Araba opel=new Opel()

    }

}
