package yeniYonetim;

public class MudurYardimcisi extends Mudur{
    String name="mudur yardimcisi";


    public void nameYazdir(){
        String name ="omer";
        System.out.println( super.name+" : "+ this.name + " ; " + name);
    }
}
