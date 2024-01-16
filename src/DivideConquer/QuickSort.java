package DivideConquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={5, 48, -2, 6, 1, 0, 9};
        quickSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] +" ");
    }
    //select pivot as last element,
    //partition the array across pivot with smaller elements ahead of it and larger ones behind and place pivot to its right positon and return index
    //call quick sort method for left part
    //call quick sort method for right part
    public static void quickSort(int[] arr, int si, int ei){
        if(si >= ei)
            return;
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1);   //left
        quickSort(arr, pidx+1, ei); //right
    }

    //make place elements smaller to itahead and larger to it behind the pivot and bring the pivot to its right index. Return the pivot's right index.
    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i= si-1;
        for(int j=si; j< ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp =pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}
