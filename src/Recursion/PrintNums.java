package Recursion;

//Recursion : When a function calls itself until a speified condition is met
public class PrintNums {
    public static void main(String[] args) {
        int n = 5, i=1;
        print(i, n);
        print2(i, n);
        print3(n, n);   //backtrack
        print4(n, n);
    }
    //Print numbers from 1 to n
    public static void print(int i, int n){
        if(i> n)
            return;
        System.out.print(i +" ");
        print(i+1, n);
    }

    //Print Hello n timmes
    public static void print2(int i, int n){
        if(i>n)
            return;
        System.out.print("Hello" +" ");
        print2(i+1, n);
    }

    //Print n to 1 (backtrack)
    public static void print3(int i, int n){
        if(i<1)
            return;
        System.out.print(i +" ");
        print3(i-1, n);
    }

    //Print 1 to n (backtrack)
    public static void print4(int i, int n){
        if(i<1)
            return;
        print4(i-1, n);
        System.out.print(i +" ");
    }
}
