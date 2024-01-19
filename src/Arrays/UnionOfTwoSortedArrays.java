package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 ={1,1,2,3,4,5, 7, 9};
        int[] arr2 = {2,3,4,4,5, 6};
        System.out.println(mergeArrays(arr1, arr2));
        System.out.println(mergeArrays2(arr1, arr2));
        System.out.println(mergeArrays3(arr1, arr2));
    }
    public static ArrayList<Integer> mergeArrays(int[] a1, int[] a2){
        HashMap<Integer, Integer> map =new HashMap<>();
        ArrayList<Integer> union = new ArrayList<>();
        for(int i=0; i<a1.length; i++)
            map.put(a1[i], map.getOrDefault(map.get(a1[i]), 0)+1);
        for(int i=0; i<a2.length; i++)
            map.put(a2[i], map.getOrDefault(map.get(a2[i]), 0)+1);
        for(int e : map.keySet())
            union.add(e);
        return union;
    }
    public static HashSet<Integer> mergeArrays2(int[] a1, int[] a2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<a1.length; i++)
            set.add(a1[i]);
        for(int i=0; i<a2.length; i++)
            set.add(a2[i]);
        return set;
    }
    public static ArrayList<Integer> mergeArrays3(int[] a1, int[] a2){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<a1.length && j<a2.length){
             if(a1[i] <= a2[j]) {
                 if(!list.contains(a1[i]))
                     list.add(a1[i]);
                 i++;
             }
             else {
                 if(!list.contains(a2[j]))
                     list.add(a2[j]);
                 j++;
             }
        }
        while(i<a1.length){
            if(!list.contains(a1[i]))
                list.add(a1[i]);
            i++;
        }
        while(j<a2.length){
            if(!list.contains(a2[j]))
                list.add(a2[j]);
            j++;
        }
        return list;
    }
}
