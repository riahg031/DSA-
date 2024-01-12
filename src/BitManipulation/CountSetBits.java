package BitManipulation;

import java.util.Scanner;

//Return total no of '1' bits in the binary form of a no
public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        long int n = 1011110101;
        System.out.println(countSetBits(n));
    }
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n & 1) != 0)
                count++;
            n >>=1;
        }
        return count;
    }
}
