package BasicMathStriver;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 265456;
        System.out.println(reverseNo(n));
    }
    public static int reverseNo(int n){
        int rev=0;
        while(n>0){
            int r = n%10;
            rev = rev*10 + r;
            n /=10;
        }
        return rev;
    }
}
