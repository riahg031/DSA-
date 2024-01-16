package Recursion.Striver;

import java.util.Scanner;

//Recursion basic
public class Printo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1(n);
        print2(1, n);
        print3(n, n);
        print4(n, n);
        print5(1, n);
    }
//    Que 1: Print n times
    public static void print1(int n){
        if(n<1) {
            System.out.println();
            return;
        }
        System.out.print("Hello" + n +" ");
        print1(n-1);
    }

//    Que 2: print nos  from 1 to n
    public static void print2(int i, int n){
        if(i>n) {
            System.out.println();
            return;
        }
        System.out.print(i +" ");
        print2(i+1, n);
    }
//    Que 3: print n to 1
    public static void print3(int i, int n){
        if(i <1)
            return;
        System.out.print(i +" ");
        print3(i-1, n);
    }
//    Que 4: print 1 to n using backtracking
    public static void print4(int i, int n){
        if(i<1) {
            System.out.println();
            return;
        }
        print4(i-1, n);
        System.out.print(i+ " ");
    }
//    Que 5: Print n to 1 using backtracking
    public static void print5(int i, int n){
        if(i > n){
            System.out.println();
            return;
        }
        print5(i+1, n);
        System.out.print(i +" ");
    }
}
