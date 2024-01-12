package BasicMathStriver;

import java.util.Scanner;

public class GcdOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(gcd2(a, b));
    }
    // Method 1 : run a loop from 1 to min(a,b). If ans = max(i) which divides both a and b,. i=loop variable
    public static int gcd(int a, int b){
        int gcd =1;
        for(int i=2; i<= Math.min(a,b); i++){
            if( a%i ==0 && b%i ==0)
                gcd = i;
        }
        return gcd;
    }

//    Method 2 : using Euclidean's theorem
//    gcd(a,b) = gcd(a%b, b)
//    a>b until a or b==0
    public static int gcd2(int a ,int b){
        if(b==0)
            return a;
        return gcd2(b,a%b);
    }
}
