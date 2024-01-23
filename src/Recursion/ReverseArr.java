package Recursion;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args){
        int[] arr = {1, 2,3, 4, 5, 6, 7};
        reverse(arr, 0, arr.length);
    }

    //Reverse array
    public static void reverse(int[] arr, int l, int n){
        if(l> n/2){
            System.out.println(Arrays.toString(arr));
            return;
        }
        //swap
        int temp = arr[l];
        arr[l] = arr[n-l-1];
        arr[n-l-1] = temp;

        reverse(arr, l+1, n);
    }
}
