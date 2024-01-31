package Arrays;

import java.util.HashMap;

public class LongestSumSubarray {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,1,0, 0, 1,3,3};
//        int[] arr  = {2, 0, -1, 0, 0, 3};
        int sum = 3;
        //Brute force(For all)
        System.out.println(longestSubarraySum(arr, sum));
        //Better approach(For all)
        System.out.println(longestSubarraySum2(arr, sum));
        //Optimal approach (for +ves and 0)
        System.out.println(longestSubarraySum3(arr, sum));
    }
    // O(n^2) : Using two loops
    //SC: O(1)
    public  static int longestSubarraySum(int[] arr, int k){
        int length=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum == k)
                    length = Math.max(length, j-i+1);
            }
        }
        return length;
    }

    // O(n* logn) : Using hashing (+ve, -ve, 0)
    // SC: O(n);
    public static int longestSubarraySum2(int[] arr,int k){
        //Prefix sum map
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int length=0;
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];

            //Sum equals to k
            if(sum == k)
                length = Math.max(length, i+1);

            //Check if remainder(sum-k) is present is hashmap => subarray with sum=k like between ( prefixMap.getValue(sum-k) - i +1)
            //Check if subarray exists in between array elements
            int rem = sum-k;
            if(prefixMap.containsKey(rem)){
                int len = i - prefixMap.get(rem);
                length = Math.max(length, len);
            }

            //Add sum to hashmap if it doesn't exists
            if(!prefixMap.containsKey(sum))
                prefixMap.put(sum, i);
        }
        return length;
    }

    //O(2N): Two opinters approach
    //SC: O(1)
    public static int longestSubarraySum3(int[] arr, int k){
        int length=0, sum=arr[0];
        int left=0, right=0;

        while(right < arr.length){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }

            if(sum == k)
                length = Math.max(length, right-left+1);

            right++;
            if(right < arr.length)
                sum += arr[right];
        }
        return length;
    }
}