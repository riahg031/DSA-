package OOPs.Abstraction.Interfacees;
//Implementing multiple inheritance using interfaces
public class TestMultipleInheri {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.teeth();
        b.food();
    }
}
interface Herbivore{
    void food();
}
interface Carnivore{
    void teeth();
}
class Bear implements Herbivore, Carnivore{
    public void food(){
        System.out.println("Flesh");
    }
    public void teeth(){
        System.out.println("Sharp food");
    }
}
