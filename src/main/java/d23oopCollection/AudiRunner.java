package d23oopCollection;

public class AudiRunner {
    public static void main(String[] args) {
//        Motor m=new Motor (); HATA interfclerden object olusturamazsiniz

        AuidiA4 a4 = new AuidiA4();
        a4.turbo();
        a4.analog();
        a4.esp();
//        a4.run();
        ((Motor)a4).run();
//        motor interface inden gelen run methodunu calistirdik

//    motor.fiyat=500; final ispati yeni deger atayamazsiniz

        System.out.println(Motor.fiyat1);
        System.out.println(Clima.fiyat1);
        System.out.println(Fren.fiyat1);
        Motor.hiz();
        a4.guc();
    }
}
