package BankProject;

public class Bank {
    private String userName,surname;
    private int hesapMiktari=0;

    public Bank(String userName, String surname) {
        this.userName = userName;
        this.surname = surname;

    }

    // her kullanicinin baslanici hesap miktari sifir olacak
    // deposit methodu olustur bu methodla girdigin deger hesap miktarina eklenecek
    // withdraw methodu olustur bu methodda girdigin deger hesap miktarindan dusecek
    // hesap ozeti method olustur bu method da olan hesap miktarini gosterecek

    public void deposit(int miktar){
        this.hesapMiktari=this.hesapMiktari+miktar;
    }
    public void withdraw(int miktar){
        if (hesapMiktari>=miktar){
        this.hesapMiktari=this.hesapMiktari-miktar;
        }else {
            System.out.println("bakiyeniz yetersizdir");
        }
    }
    public int hesapOzeti(){
        return this.hesapMiktari;
    }
}
