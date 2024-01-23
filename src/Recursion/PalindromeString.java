package Recursion;

public class PalindromeString {
    public static void main(String[] args){
        String s = "MadamPP";
        s =  s.toLowerCase();
        System.out.println(isPalindrome(s, 0));
    }

    //TC: O(n/2) SC: O(n/2)
    public static boolean isPalindrome(String s, int i){
        int n = s.length();
        if(i>= n/2)
            return true;
        if(s.charAt(i) != s.charAt(n-1-i))
            return false;
        return isPalindrome(s, i+1);
    }
}
