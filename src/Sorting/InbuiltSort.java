package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        int[] nums = {5, 1, 3, 2 ,4};
        //Arrays.sort(nums);
        //Arrays.sort(nums, 0, 3);
        //System.out.println(Arrays.toString(nums));
        Integer[] nums2 = {5, 1, 3, 2 ,4};
        //Arrays.sort(nums2, Collections.reverseOrder());
        Arrays.sort(nums2, 0, 3, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums2));
    }
    //Collections.reverseOrder()  has a comparator in its internal implementation.
//    public static int compare(int a, int b){
//        /*
//            if a>b , return +ve value
//            if a<b , return -ve value
//            if a==b , return 0
//         */
//        return a-b;
//    }
}
