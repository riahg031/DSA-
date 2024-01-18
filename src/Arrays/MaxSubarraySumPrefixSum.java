package Arrays;
//O(n^2)
public class MaxSubarraySumPrefixSum {
    public static void main(String[] args){
        int[]  arr = {11, -2,1 ,6, -1, 3};
        System.out.println(maxSubarraySum(arr));
    }
    public static int maxSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        int[] prefix = new int[arr.length];

        //Calculating prefix array values
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++)
            prefix[i] = prefix[i-1] + arr[i];

        for(int i=0; i<arr.length; i++){
            int si=i;
            for(int j=i; j<arr.length; j++){
                int ei=j;
                sum = si==0 ? prefix[si] : prefix[ei]- prefix[si-1];
                if(maxSum < sum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }
}
