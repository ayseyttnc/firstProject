package day07.C01;

public interface GenelMuhasebe {//interface de public ve abstract yazmaya gerek yok
    double ekmesaiHesapla(int calismaSaati);

    double vergiHesapla(double brutMaas,int calismaYili);

    double netMaas(double brutMaas ,int calismaSaati ,int calismaYili);




}
