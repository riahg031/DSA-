package Hashing;

import java.util.Arrays;

public class HashArray {
    public static void main(String[] args){
//        int[] arr =  new int[100000009];    // int 10^8 maximum size allowed for int array
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
        int[] hash = new int[13];   //0-12
        for(int i=0; i<arr.length; i++)
            hash[arr[i]]++;
        //Fetching
        System.out.println(Arrays.toString(hash));
    }

    //Character hashing
    public static void getCharCount(String str){
        //Prestoring
        int[] hash = new int[26];
        for(int i=0; i<str.length(); i++)
            hash[str.charAt(i) - 'a']++;
        //Fetching
        System.out.println(Arrays.toString(hash));
    }

    // For all kinds  of characters
    public static void getCharCount2(String str){
        //Prestoring
        int[] hash = new int[256];
        for(int i=0; i<str.length(); i++)
            hash[str.charAt(i)]++;
        //Fetching
        System.out.println(Arrays.toString(hash));
//        for(int i=0; i<str.length(); i++)
//            System.out.print(hash[str.charAt(i)] +" ");
    }
}
