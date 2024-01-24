package Recursion;

import java.util.Scanner;
// 0 1 1 2 3 5 8 13 21 34
// No of recursive calls < 2^n
//EG: if n=3, no of recursion calls=9

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    //Calculate fibonacci
    public static int fact(int n){
        if(n<=1)
            return n;
        return fact(n-1) + fact(n-2);
    }
}
