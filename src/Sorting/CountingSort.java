package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 1, 5, 1, 3, 2 ,4, 3, 1, 0};
        System.out.println(Arrays.toString(countingSort(nums)));
    }
    public static int[] countingSort(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
            largest = Math.max(largest, nums[i]);

        int[] count = new int[largest+1];
        for(int i=0; i<nums.length; i++)
            count[nums[i]]++;

        //sort
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0) {
                nums[j] = i;
                count[i]--;
                j++;
            }
        }
        return nums;
    }
}
