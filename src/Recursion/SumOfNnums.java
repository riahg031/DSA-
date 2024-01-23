package Recursion;

import java.util.Scanner;

public class SumOfNnums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n, 0);  //Parameterised recursion
        System.out.println(sum2(n));    //Functional recursion
    }

    //Parameterised recursion
    public static void sum(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1, sum+i);
    }

    //Functional recursion
    public static int sum2(int n){
        if(n==1)
            return 1;
        return n+ sum2(n-1);
    }
}
