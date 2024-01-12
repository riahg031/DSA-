package Strings;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String str1, String str2){
        //HashMap<, int> = new HashMap<>();
//        char[] ch = str1.toCharArray();
//        StringBuilder sb = new StringBuilder(str2);
//
//        for(char c : ch){
//            int index = sb.indexOf(c);
//            if(index != -1)
//                sb.deleteCharAt(index);
//            else
//                return false;
//        }
//        return sb.length()==0;
        return true;
    }
    public static void main(String[] args) {
        String s1 = "TOSS";
        String s2 = "SHOT";
        System.out.println(isAnagram(s1, s2));
    }
}
