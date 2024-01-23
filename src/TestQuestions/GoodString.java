package TestQuestions;

public class GoodString {
    public static void main(String[] args) {
        int n=5;
        System.out.println(isGood(n));
    }
    public static int isGood(int n){
        int fact=1;
        for(int i=2; i<=n; i++)
            fact *= i;
        return fact;
    }
}

