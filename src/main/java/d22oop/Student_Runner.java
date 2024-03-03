package d22oop;

public class Student_Runner {
    public static void main(String[] args) {
         Student s=new Student();
//         s.yaptiginda sadece public olan name gozukuyor
// Get
        System.out.println(s.getAge());
        System.out.println("s.isSuccessful() = " + s.isSuccessful());


//  Set
        s.setAge(25);
        System.out.println(s.getAge());

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());

//set ile verieri degistirebiliyor
        //Set ile verileri degistirebiliyoruz, constructor'larla da degistirebiliyoruz.Farki nedir?
//set ==> mevcut bir nesnenin verilerini degistirmek icin kullanilir
//constructor ==> Yeni nesnelerin baslangic durumunu belirlemek icin kullanilir.

//Arastirma Odevi: encapsulation'da private ile gizlenen bir veri baska package'dan set method ile
//degistirilebilir mi?

//        get ve set methodlarina sahip classlar sikca java beans olarak adlandirilir

    }

}
