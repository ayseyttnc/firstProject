package omerCalisma;

public class Register {

    private String name;
    private String surname;
    private int age;
    private int paraniz;

    public Register(String name, String surname, int age) {
        this.name = name.toUpperCase();
        this.surname = surname.toUpperCase();
        this.age = age;
        this.paraniz = 0;

    }

    public Register(String name, String surname, int age, int paraniz) {
        this.name = name.toUpperCase();
        this.surname = surname.toUpperCase();
        this.age = age;
        this.paraniz = paraniz;
    }

    public void deposit(int miktar) {
        this.paraniz += miktar;
    }

    public int checkTotal() {
        return this.paraniz;
    }


    public void withdraw(int miktar) {
        if (this.paraniz > miktar) {
            this.paraniz -= miktar;
        } else {
            System.out.println("uzgunuz isleminizi gerceklestiremiyoruz");
        }
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }
    public String getSurname(){
        return this.surname;

    }
    public void accountDetail(){
        System.out.println("sayin "+this.name+ " "+this.surname+ "\nhesap miktariniz:"+this.paraniz);
    }

}