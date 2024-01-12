package BasicMathStriver;
import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrongNo(n));
    }
    public static boolean isArmstrongNo(int n){
        int temp=n, sum=0;
        while(n>0){
            int r= n%10;
            sum += r*r*r;
            n /= 10;
        }
        return temp==sum;
    }
}
