package BitManipulation;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bitmask = 1;
        if((n & bitmask) ==0)
            System.out.println("Even no");
        else
            System.out.println("Odd no");
    }
}
