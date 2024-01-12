package OOPs.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
        h.skinColor();
        h.changeColor();
        System.out.println("--------------------------------------------------");
        Mustang m = new Mustang();
        m.walk();
        m.eat();
        m.skinColor();
        m.changeColor();
        System.out.println("--------------------------------------------------");
        Dinosaur d = new Dinosaur();
        d.walk();
        d.eat();
        d.skinColor();
        d.changeColor();
    }
}
abstract class Animals{
    String color = "Brown";
    Animals(){
        System.out.println("Animals constructor called");
    }
    void eat(){
        System.out.println("Eats anything");
    }
    void skinColor(){
        System.out.println("Skin color: " +color);
    }
    abstract void walk();
}
class Horse extends Animals{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
        System.out.println("Horse skin color : "+ color);
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
    void walk(){
        System.out.println("Mustang walks on 4 legs");
    }
    void changeColor(){
        color = "Beige";
        System.out.println("Mustang skin color : "+ color);
    }
}
class Dinosaur extends Animals{
    Dinosaur(){
        System.out.println("Dinosaur constructor called");
    }
    void walk(){
        System.out.println("Dinosaur walks on 2 legs");
    }
    void changeColor(){
        color = "Green";
        System.out.println("Dinosaur skin color : "+ color);
    }
}

