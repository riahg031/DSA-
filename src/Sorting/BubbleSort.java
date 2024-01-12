package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        String s = "Hello";
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i) >= 'A' || s.charAt(i)<='Z') {
                //System.out.println(Character.toLowerCase(s.charAt(i)));
                char x = Character.toLowerCase(s.charAt(i));
                System.out.println(x);
                s.replace(s.charAt(i), x);
            }
        System.out.println(s);
    }
}
