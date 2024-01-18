package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {90, 56,9, 12, 6, 0, -4};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr){
        int si=0, ei = arr.length-1;
        while(si <= ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
        return arr;
    }
}
