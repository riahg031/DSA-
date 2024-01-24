package Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountHashmap {
    public static void main(String[] args){
        int[] arr = {1, 5, 2, 2, 1, 5, 4, 12};  //given max element can be 12
        getCount(arr);

        String str = "Hello , World";
//        getCharCount(str.toLowerCase());  //accepts only alphabetic string input(no ' ', ',' or any non-alphabet character
        getCharCount2(str); //accepts all kinds of string values as in ASCII
    }
    //Return count for each element in arr
    //Integer hashing
    public static void getCount(int[] arr){
        //Prestoring
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(!map.containsKey(arr[i]))
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            else
                map.put(arr[i], map.get(arr[i])+1);
        }

        //Fetching
//        for(Map.Entry<Integer, Integer> e : map.entrySet())
//            System.out.println(e.getKey()+ " "+ e.getValue());
        System.out.println(map);
    }

    //Character hashing
    public static void getCharCount2(String str){
        //Prestoring
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i< str.length(); i++){
//            map.put(str.charAt(i), map.get(str.charAt(i))+1);
            if(!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
            else
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
        }
        //Fetching
        for(Map.Entry<Character, Integer> e: map.entrySet())
            System.out.println(e.getKey()+ " "+ e.getValue());
//       System.out.println(map);
    }
}
