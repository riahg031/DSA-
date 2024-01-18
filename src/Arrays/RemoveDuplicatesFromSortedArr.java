package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//Replace duplicates in-place from sorted array
//Return index
public class RemoveDuplicatesFromSortedArr {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3};
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates2(arr));
//        System.out.println(Arrays.toString(removeDuplicates2(arr)));
    }
    //Using set
    public static int removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++)
            set.add(arr[i]);
//        Iterator it = set.iterator();
//        int i=0;
//
//        while(it.hasNext())
//            arr[i++] = it.next();
        return set.size();
    }
    //Binary search
    public static int removeDuplicates2(int[] arr){
        int i=0;
        for(int j=1; j< arr.length; j++){
            if(arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
