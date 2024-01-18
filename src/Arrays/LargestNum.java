package Arrays;

public class LargestNum {
    public static void main(String[] args){
        int[] arr = {11, -2,1 ,6, -1, 3};
        System.out.println(findLargest(arr));
    }
    public static int findLargest(int[] arr){
        int largest = arr[0];
        for(int i=1; i<arr.length; i++)
            if(arr[i] > largest)
                largest = arr[i];
        return largest;
    }
}
