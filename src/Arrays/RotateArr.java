package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//Left rotate array by k places
//Solution :
//  no of rotations, k= k% arr.length
public class RotateArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4, 5, 6, 7};
        int k = 5;
        System.out.println(rotate(arr, k));
    }
    //O(n+k)
    public static String rotate(int[] arr, int k){
        k %= arr.length;
        int n = arr.length;
        int[] temp = new int[k];
        for(int i=0; i<temp.length; i++)
            temp[i] = arr[i];
        for(int i=k; i<arr.length; i++)
            arr[i-k] = arr[i];
        for(int i=n-k; i<n; i++)
            arr[i] = temp[i-(n-k)];
//            arr[n-k+i] = temp[i];
        return Arrays.toString(arr);
    }

}
