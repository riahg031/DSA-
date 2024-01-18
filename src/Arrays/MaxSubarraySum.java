package Arrays;
// O(n^3)
public class MaxSubarraySum {
    public static void main(String[] args){
        int[] arr= {11, -2,1 ,6, -1, 3};
        System.out.println(maxSubarraySum(arr));
    }
    public static int maxSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            int si = i;
            for (int j = i; j < arr.length; j++) {
                int ei = j;
                int curr = 0; // keeps current subarray sum
                for (int k = si; k <= ei; k++) {
                    curr += arr[k];
                }
                if (maxSum < curr)
                    maxSum = curr;
            }
        }
        return maxSum;
    }
}
