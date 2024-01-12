package BasicMathStriver;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 45322;
        System.out.println(countDigits(n));
        System.out.println(countDigits2(n));
        System.out.println(countDigits3(n));
    }
    public static int countDigits(int n){
        int count =0;
        while(n>0) {
            n /= 10;
            count++;
        }
        return count;
    }

    //        Method 2: return Math.log10(n)+1; -> but in java log doesn't take int value. Hence not possible.
    public static int countDigits2(int num){
        int digits = (int) Math.floor( Math.log10(num) +1);
        return digits;
    }

    //        Method 3 : convert number to string and return its length
    public static int countDigits3(int num){
        String s = Integer.toString(num);
        return s.length();
    }
}
