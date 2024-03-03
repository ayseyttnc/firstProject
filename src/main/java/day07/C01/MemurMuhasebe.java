package day07.C01;

public class MemurMuhasebe implements GenelMuhasebe{//ugulamayi gelistirmyei kolaylastirir.standars eder uygulamayi
    @Override
    public double ekmesaiHesapla(int calismaSaati) {

        if (calismaSaati>120){
            double ekMesai=(calismaSaati-120)*15;
            System.out.println("aylik ek maesai ucreti" + ekMesai);
            return ekMesai;
        }else {

        return 0;
        }
    }

    @Override
    public double vergiHesapla(double brutMaas, int calismaYili) {
        double vergi;
        if (calismaYili>=10){
            vergi=brutMaas*35/100;
        }else {
            vergi=brutMaas*25/100;
        }
        System.out.println(vergi);
        return vergi;
    }

    @Override
    public double netMaas(double brutMaas, int calismaSaati, int calismaYili) {
        return brutMaas+ekmesaiHesapla(calismaSaati)-vergiHesapla(brutMaas,calismaYili);
    }
//    çalışan memur ise;
//        1-Çalışanın aylık çalışma saatine göre 120 saat üstü her saat için brüt maaşı 15 dolar artır
//        2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %35;
//    daha az ise maaşından %25 vergi kesintisi yapılıyor
//




}
