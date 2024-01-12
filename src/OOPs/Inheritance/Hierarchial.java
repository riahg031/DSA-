package OOPs.Inheritance;

public class Hierarchial {
    public static void main(String[] args) {
        C1 c1 = new C1();
        C2 c2 = new C2();
        C3 c3 = new C3();
        c1.dislay1();
        c2.dislay2();
        c2.dislay1();
        c3.dislay3();
        c3.dislay1();
    }
}
class C1{
    public void dislay1(){
        System.out.println("C1");
    }
}
class C2 extends C1{
    public void dislay2(){
        System.out.println("C2");
    }
}
class C3 extends C1{
    public void dislay3(){
        System.out.println("C3");
    }
}
