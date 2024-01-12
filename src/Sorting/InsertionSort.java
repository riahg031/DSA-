package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {-5, -1, 0, 13, 2 ,24};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }
    public static int[] insertionSort(int[] nums){
        for(int i=1; i<nums.length; i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev>=0 && nums[prev] >curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            //insertion of curr to its correct position
            nums[prev+1] = curr;
        }
        return nums;
    }
}
