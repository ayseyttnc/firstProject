package day_3_tekrar;

public class UserInfo {
    private String name;
    private int age;
    private boolean isFemale;

    public UserInfo(String name, int age, boolean isFemale) {
        this.name = name.toUpperCase();
        this.age = age;
        this.isFemale = isFemale;
    }

    public String getName(){
        return name.toUpperCase();
    }

    public int dob(){
        return 2024-this.age;   }

    public void emeklilik(){
        if (this.age>30 && this.isFemale){
            System.out.println("sayin " + this.name+" emekli oldunuz");
        }else {
            System.out.println("olene kadar calis");
        }
    }
}
