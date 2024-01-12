package DSAsheet.Arrays;

import java.util.Scanner;

//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
//Maximum and minimum of an array using minimum number of comparisons
public class MaxMiNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 85, 18, 44, 1, -3, 0};
        linearSearch(arr);
    }
    public static void linearSearch(int[] arr){
        int min= arr[0], max= arr[0];
        if(arr.length ==1) {
            System.out.println(max + "\n" + min);
            return;
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println(max+ "\n" + min);
    }
}
