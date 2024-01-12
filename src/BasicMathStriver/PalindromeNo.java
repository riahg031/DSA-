package BasicMathStriver;

import java.util.HashMap;
import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 123321;
        System.out.println(isPalindromeNo(n));
    }
    public static boolean isPalindromeNo(int n){
        int temp =n;
        int rev=0;
        while(temp>0){
            int r= temp%10;
            rev = rev*10 + r;
            temp /= 10;
        }
        return n==rev;
    }
}
