package BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n){
        return ((n & (n-1)) == 0);
    }
}
