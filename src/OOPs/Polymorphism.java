package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        //Compile time polymorphism
        Calulator c = new Calulator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2, 3));
        System.out.println(c.sum((float)1.5,(float)2.5));

        //Run time polymorphism
        Numbers nums = new Numbers();
        nums.display();
        c.display();
    }
}
//Compile time polymorphism
class Calulator{
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public float sum(float a, float b){
        return a+b;
    }
    public void display(){
        System.out.println("Calculator class");
    }
}
class Numbers extends Calulator{
    public void display(){
        System.out.println("Numbers class");
    }
}
