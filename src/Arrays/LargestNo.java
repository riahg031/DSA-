package Arrays;

public class LargestNo {
    public static void main(String[] args){
        int[] arr = {90, 56,9, 12, 6, 100, -4};
        System.out.println(findLargest(arr));
    }
    public static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }
}
