package OOPs.Inheritance;

public class MultiLevel {
    public static void main(String[] args) {
        WildAnimal tiger = new WildAnimal();
        tiger.legCount = 4;
        System.out.println(tiger.legCount);
        tiger.walk();
        tiger.live();
        tiger.eat();
        tiger.breathe();
        tiger.name = "Tiger";
        System.out.println(tiger.name);
    }
}
class Mammal{
    String name;
    public void eat(){
        System.out.println("Eats");
    }
    public void breathe(){
        System.out.println("Breathes");
    }
}
class Animals extends Mammal{
    public void walk(){
        System.out.println("Walks");
    }
}
class WildAnimal extends Animals{
    int legCount;
    public void live(){
        System.out.println("Lives in forest");
    }
}
