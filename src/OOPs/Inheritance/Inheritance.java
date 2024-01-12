package OOPs.Inheritance;
//Same code for single  level inheritance
public class Inheritance {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.eat();
        fish.breathe();
        fish.swim();
        System.out.println(fish.color);
        fish.color = "blue";
        System.out.println(fish.color);
    }

}
class Animal{
    String color;
    public void eat(){
        System.out.println("Eats");
    }
    public void breathe(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{
    int fins;
    public void swim(){
        System.out.println("Swims");
    }
}