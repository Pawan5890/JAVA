class Animal{
    String name;
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    public void display(){
        System.out.println("my name is : "+name);
    }
}
class Main{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "tommy";
        d1.display();
        d1.eat();
    }
}