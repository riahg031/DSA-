package Arrays;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {90, 56,9, 12, 6, 0, -4};
        int key = -4;
        System.out.println(linearSearch(arr, key));
    }
    public static int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++)
            if(arr[i] == key)
                return i;
        return -1;
    }
}
