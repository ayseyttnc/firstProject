//package Day7;
//
////Encapsulation nedir:data hiding
//
///*
//bir class oluşturalım.
//private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
//parametreli ve parametresiz constructor oluşturun
//toString metodunu oluşturun
//*/
//
//public class C01_Encapsulation {
//
//    private String isim;
//
//    private String soyisim;
//
//    private int yas;
//
//    //parametreli const
//    public C01_Encapsulation(String isim, String soyisim, int yas) {
//        this.isim = isim;
//        this.soyisim = soyisim;
//        if (yas>=0){
//            this.yas=yas;
//        }else {
//            System.out.println("Yaş değeri negatif olamaz!!!");
//        }
//    }
//
//    //parametresiz constructor
//    public C01_Encapsulation() {    }
//
//    //getter
//
//
//    public String getIsim() {
//        return isim.charAt(0)+"*";
//    }
//
//    public String getSoyisim() {
//        return soyisim;
//    }
//
//    public int getYas() {
//        return yas;
//    }
//
//    //setter
//
//    public void setIsim(String isim) {
//        this.isim = isim;
//    }
//
//    public void setSoyisim(String soyisim) {
//        this.soyisim = soyisim;
//    }
//
//    public void setYas(int yas) {
//        if (yas>=0){
//            this.yas=yas;
//        }else {
//            System.out.println("Yaş değeri negatif olamaz!!!");
//        }
//    }
//
//    //toString
//    @Override
//    public String toString() {
//        return "{" +
//                "isim='" + this.isim + '\'' +
//                ", soyisim='" + soyisim + '\'' +
//                ", yas=" + yas +
//                '}';
//    }
//
//    //POJO class: Plain Old Java Object
//    //1-private access modifier : fieldlar
//    //2-paramli/paramsiz constructor
//    //3-getter-setter
//    //4-toString
//
//}