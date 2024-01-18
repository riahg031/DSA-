package Arrays;
// Prerequisite :  sorted array
public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {0, 6,9, 12, 16, 20, 24};
        int target= 12;
        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int[] arr, int key){
        int si = 0;
        int ei = arr.length-1;
        while(si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] == key)
                return mid;
            if(key > arr[mid])
                si = mid+1;
            else
                ei = mid-1;
        }
        return -1;
    }
}
