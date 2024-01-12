package BasicMathStriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(printDivisors(n));
        System.out.println(printDivisors2(n));
    }
//    Method 1
    public static List<Integer> printDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i ==0)
                list.add(i);
        }
        return list;
    }

//    Optimal approach
    public static List<Integer> printDivisors2(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i*i <=n; i++){
            if(n%i ==0 ) {      // it implies {n/i %i ==0} will also be true
                list.add(i);
                if( i != n/i)
                    list.add(n/i);
            }
        }
        return list;
    }
}
