package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10,5,10,15,10,5,1);
        System.out.println(findFreq(list));
    }
    public static HashMap<Integer, Integer> findFreq(ArrayList<Integer> list){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);
//            if(map.containsKey(list.get(i)))
//                map.put(list.get(i), map.get(list.get(i))+1);
//            else
//                map.put(list.get(i), 1);
        }
        return map;
    }
    //Max frequency
    public static HashMap<Integer, Integer> maxFreq(ArrayList<Integer> list){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<list.size(); i++)
            map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);

        return map;
    }
    //Min frequency
    public static HashMap<Integer, Integer> minFreq(ArrayList<Integer> list){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<list.size(); i++)
            map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);

        return map;
    }
}
