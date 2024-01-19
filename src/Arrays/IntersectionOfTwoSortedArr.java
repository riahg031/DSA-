package Arrays;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1 ={1,1,2,3,4,5, 7, 9};
        int[] arr2 = {2,3,4,4,5, 6};
        System.out.println(findIntersection(arr1, arr2));
    }
    public static ArrayList<Integer> findIntersection(int[] a1, int[] a2){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<a1.length && j<a2.length) {
            if (a1[i] < a2[j])
                i++;
            else if (a1[i] > a2[j])
                j++;
            else {
                list.add(a1[i]);
                i++;
                j++;
            }
        }
        return list;
    }
}
