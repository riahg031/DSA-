package Miscellaneous;

import java.util.HashMap;
import java.util.Scanner;

public class GeneratePhoneNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        String s = "five eight double two double two three nine zero three";
        generateNumber(s);
    }
    public static void generateNumber(String s){
        String[] arr = s.split(" ");
        String ans = "";
        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        int i=0;
        while(i< arr.length){
            if(arr[i].equals("double")) {
                ans += map.get(arr[i + 1]) + map.get(arr[i + 1]);
                i++;
            }
            else if(arr[i].equals("triple")) {
                ans += map.get(arr[i + 1]) + map.get(arr[i + 1]);
                i++;
            }
            else
                ans += map.get(arr[i]);
            i++;
        }
        System.out.println(ans);
    }
}
