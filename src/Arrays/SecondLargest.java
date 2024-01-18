package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {11, -2,1 ,6, -1, 3};
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));
    }
//    Method 1 : two loops to find largest and second largest
//    Method 2: Run one lop, assign the first no to largest and traverse the array by swapping new largest to largest and element in largest to second largest and many such cases
    public static int secondLargest(int[] arr){
        int largest = arr[0];
        int secondLarge = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest) {
                secondLarge = largest;
                largest = arr[i];
            }
            else if(arr[i] <= largest && arr[i] > secondLarge)
                secondLarge = arr[i];
        }
        return secondLarge;
    }

    //Find second smallest
    public static int secondSmallest(int[] arr){
        int smallest = arr[0];
        int secondSmall = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < smallest){
                secondSmall = smallest;
                smallest = arr[i];
            }
            else if(arr[i] >= smallest && secondSmall > arr[i])
                secondSmall = arr[i];
        }
        return secondSmall;
    }
}
