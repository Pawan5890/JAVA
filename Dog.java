class Dog {
  String breed;
  int age;
  String color;

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setColor(String color) {
    this.color = color;
  }
  
  public void printDetails() {
    System.out.println("Dog details:");
    System.out.println("Breed: " + this.breed);
    System.out.println("Age: " + this.age);
    System.out.println("Color: " + this.color);
  }

  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.setBreed("Labrador");
    d1.setAge(3);
    d1.setColor("Black");

    d1.printDetails();
  }
}