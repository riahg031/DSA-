package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 3, 2};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }
    public static int[] selectionSort(int[] nums){
        for(int i=0; i<nums.length; i++){
            int smallest = i;
            for(int j = i+1; j<nums.length; j++){
                if(nums[j]<nums[smallest])
                    smallest = j;
            }
            //swap
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
