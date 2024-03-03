package day07.C01;

public class PersnalMaas {
        /*
    Bir sirketin muhasebe departmanı çalışanların maaşını hesaplıyor
    Muhasebe departmanı maaş için şu kriterlere bakıyor:

    çalışan işçi ise;
        1-Çalışanın aylık çalışma saatine göre 160 saat üstü her saat için brüt maaşı 10 dolar artır
        2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %30;
        daha az ise maaşından %20 vergi kesintisi yapılıyor

    çalışan memur ise;
        1-Çalışanın aylık çalışma saatine göre 120 saat üstü her saat için brüt maaşı 15 dolar artır
        2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %35;
          daha az ise maaşından %25 vergi kesintisi yapılıyor

    Her çalışanın maaşı hesaplanırken bu 2 kritere dikkat edilmek zorundadır
    Bu kriterlere göre interface kullanarak çalışanların net maaşını hesaplayan kodu yazınız

işci: 1700, 180, 12-->ekMesai:(180-160)*10=200
                   -->vergi mik.=1700.30/100=510
                   -->netMaaş=1700+200-510=1410


     */
        public static void main(String[] args) {
            IsciMuhasebe muhasebe1=new IsciMuhasebe();
            muhasebe1.ekmesaiHesapla(180);
            muhasebe1.vergiHesapla(1700,12);
            System.out.println("net maas " +muhasebe1.netMaas(1700,180,12));


//      memur:2000,150,8
MemurMuhasebe muhasebe2=new MemurMuhasebe();
muhasebe2.ekmesaiHesapla(150);
muhasebe2.vergiHesapla(2000,8);
            System.out.println("net maas "+ muhasebe2.netMaas(2000,150,8));
       GenelMuhasebe muhasebe=new IsciMuhasebe();
       muhasebe.ekmesaiHesapla(170);
        }




}
