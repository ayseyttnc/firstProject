package d21oop;

public class Dog extends Mammal {
    public void  bark(){
        System.out.println("kopekler havlar");

    }

    @Override
    public void eat() {
        System.out.println("dogs eat...");
    }
    @Override
    public Animal create(){
//        parentin(animal) data tipi child in data type ini (dog)kapsar
        return new Dog();
    }
    @Override
    public int add(int a,int b) {
        return a + b;
//        buradaki int i long ve short yapamasiniz
    }
        @Override
           public Integer carpma (Integer a,Integer b){

       Integer sonuc=super.carpma(a,b);
        return sonuc+10;
    }



}
