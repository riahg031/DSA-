package BitManipulation;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = sc.nextInt();
//        int j = sc.nextInt();
        int high = sc.nextInt();
        int low = sc.nextInt();
//        int val = sc.nextInt();
//        System.out.println(getIthBit(n, i));
//        System.out.println(setIthBit(n, i));
//        System.out.println(clearIthBit(n, i));
//        System.out.println(updateIthBit(n, i, val));
//        System.out.println(clearIBits(n, i));
        System.out.println(clearBitsInRange(n, high, low));
    }
    public static int getIthBit(int n, int i){  //return bit value at ith position (note 0-indexed positions considered)
        int bitmask =1<<i;  //0000100 for 1<<2
        if((n & bitmask) ==0)
            return 0;
        else
            return 1;
    }
    public static int setIthBit(int n, int i){  //set ith bit to 1
        int bitmask = 1<<i;
        return (n | bitmask);
    }
    public static int clearIthBit(int n, int i){    //set  ith bit to 0
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }
    public static int updateIthBit(int n, int i, int val){  //update ith bit value to specified val
        //Method 1
//        if(val ==0)
//            return clearIthBit(n, i);
//        else
//            return setIthBit(n, i);
        //Method 2
        n = clearIthBit(n, i);
        int bitmask = val<<i;
        return (n | bitmask);
    }
    public static int clearIBits(int n, int i){     //clear i bits from right to zero
        int bitmask = (~0)<<i;
        return (n & bitmask);
    }
    public static int clearBitsInRange(int n, int high, int low){
        int bitmask = ((~0)<<high+1) | (1<<low)-1;  //1000 + 011
        return (n & bitmask);
    }
}
