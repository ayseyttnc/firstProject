package day07.C01;

public class IsciMuhasebe implements GenelMuhasebe {
    @Override
    public double ekmesaiHesapla(int calismaSaati) {

        if (calismaSaati > 160) {
double ekMesai=(calismaSaati-160)*10;
            System.out.println("aylik ekmasai ucreti :"+ ekMesai);
            return ekMesai;
        } else {

            return 0;
        }

    }

    @Override
    public double vergiHesapla(double brutMaas, int calismaYili) {
        double vergi;
        if (calismaYili>=10){
            vergi=brutMaas*30/100;
        }else {
            vergi=brutMaas*20/100;

        }
        System.out.println("vergi miktari :" + vergi);

        return 0;
    }

    @Override
    public double netMaas(double brutMaas, int calismaSaati, int calismaYili) {
        return brutMaas+ekmesaiHesapla(calismaSaati)-vergiHesapla(brutMaas,calismaYili);




    }
//    çalışan işçi ise;
//        1-Çalışanın aylık çalışma saatine göre 160 saat üstü her saat için brüt maaşı 10 dolar artır
//        2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %30;
//    daha az ise maaşından %20 vergi kesintisi yapılıyor






}
