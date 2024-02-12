package day_3_tekrar;

public class Home {
    int odaSayi = 4;
    double mk = 45.00;
    int evnum = 14;
    boolean isDogalgaz = true;
    int cocuksayi = 3;
    boolean escalismasi = true;
    double payment;


    public Home(int odaSayi, double mk, int evnum, boolean isDogalgaz, int cocuksayi, boolean escalismasi) {
        this.odaSayi = odaSayi;
        this.mk = mk;
        this.evnum = evnum;
        this.isDogalgaz = isDogalgaz;
        this.cocuksayi = cocuksayi;
        this.escalismasi = escalismasi;
        payment = 0;
    }

    public Home(int odaSayi, double mk, int evnum, boolean isDogalgaz) {
        this.odaSayi = odaSayi;
        this.mk = mk;
        this.evnum = evnum;
        this.isDogalgaz = isDogalgaz;
        payment = 0;


    }

    public double calculatePayment() {

        if (this.isDogalgaz) {
            this.payment += 100;
        }
        payment = payment - (this.cocuksayi * 50);
        if (this.escalismasi) {
            this.payment += 100;

        } else {
            this.payment -= 50;
        }
        this.payment = this.payment + (odaSayi * 50);

        return this.payment;


    }


}


