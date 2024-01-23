package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n, 1); //Parameterised
        System.out.println(fact2(n));
    }

    //Parameterised recursion
    // TC: O(n), SC: O(n) as functions are awaited hence take stack space
    public static void fact(int n, int fact){
        if(n < 1) {
            System.out.println(fact);
            return;
        }
        fact(n-1, fact * n);
    }

    //Functional recursion
    // TC: O(n), SC: O(n) as functions are awaited hence take stack space
    public static int fact2(int n){
        if(n ==1)
            return 1;
        return n* fact2(n-1);
    }
}
