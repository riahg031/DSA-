package Arrays;

import java.util.HashMap;

public class LongestSumSubarray {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,1,1,3,3};
        int sum = 3;
        System.out.println(longestSubarraySum(arr, sum));
        System.out.println(longestSubarraySum2(arr, sum));
    }
    // O(n^2) : Using two loops
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

    // O(n* logn) : Using hashing
    public static int longestSubarraySum2(int[] arr,int k){
        //Prefix sum map
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int length=0;

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            sum += arr[i];
//
//            //Sum equals to k
//            if(sum == k)
//                length = Math.max(length, i+1);
//
//            //Add element to hashmap
//            if(!prefixMap.containsKey(sum))
//                prefixMap.put(sum, i);
//
//            //Check if remainder(sum-k) is present is hashmap => subarray with sum=k like between ( prefixMap.getValue(sum-k) - i +1)
//            int rem = sum-k;
//            if(prefixMap.containsKey(rem)){
//                int len = i - prefixMap.get(rem);
//                length = Math.max(length, len);
//            }

            // if the sum = k, update the maxLen:
            if (sum == k)
                length = Math.max(length, i + 1);


            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (prefixMap.containsKey(rem)) {
                int len = i - prefixMap.get(rem);
                length = Math.max(length, len);
            }

            //Finally, update the map checking the conditions:
            if (!prefixMap.containsKey(sum))
                prefixMap.put(sum, i);
        }
        return length;
    }
}
