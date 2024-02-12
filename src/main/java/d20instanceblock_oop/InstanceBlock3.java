package d20instanceblock_oop;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

//(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public  String fuelType;

//    instance block=bu classta her object olusturuldugunda otomatik olarak burasi calsir
{
//    her otomobil varsayilan siyah renkle baslar rebnkli uretilir
    color ="siyah";
    fuelType="benzin";

}
public InstanceBlock3(){
    System.out.println("araba rengi" +color);
    System.out.println("araba yakit turu"+ fuelType);
}
//    //instance block - Bu class'tan her object olusturuldugunda calisir
//6:03
////instance block - Bu class'tan her object olusturuldugunda calisir
//{
//    color = "Siyah";
//    fuelType = "Benzin";}

    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
    }
