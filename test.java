class Animal{
    void eat(){
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal{
    void bark (){
        System.out.println("Dog barks...");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Baby dog weeps...");
    }
}
public class test{
    public static void main(String[] args) {
        BabyDog d1 = new BabyDog();
        d1.eat();
        d1.bark();
        d1.weep();
    }
}