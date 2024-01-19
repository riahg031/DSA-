package Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println(missing(arr, n));
        System.out.println(missing2(arr, n));
        System.out.println(missing3(arr, n));
    }
    public static int missing(int[] arr, int n){
        int sum=0, arrSum =0;
        sum = (int) n*(n+1)/2;
        for(int i=0; i<arr.length; i++)
            arrSum += arr[i];
        return sum-arrSum;
    }
    public static int missing2(int[] arr, int n){
        //Using XOR
        int xor= 0, arrXor=0;
        for(int i=1; i<=n; i++)
            xor ^= i;
        for(int i=0; i<arr.length; i++)
            arrXor ^= arr[i];
        return xor ^ arrXor;
    }
    public static int missing3(int[] arr, int n){
        int xor1 =0, xor2 =0;
        for(int i=0; i<n-1; i++){
            xor2 ^= arr[i];
            xor1 ^= i+1;
        }
        xor1 ^= n;
        return xor1 ^ xor2;
    }
}
