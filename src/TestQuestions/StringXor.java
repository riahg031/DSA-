package TestQuestions;

import java.util.Arrays;

public class StringXor {
    public static void main(String[] args) {
        String x ="11000";
        System.out.println(findY(4, 3, x));
    }
    public static String findY(int bits, int maxSet, String x){
       StringBuilder sb = new StringBuilder();
        for (int i =0 ; i < x.length(); i++) {
            if (maxSet > 0 && x.charAt(i) == '0') {
                sb.append( '1');
                maxSet--;
            }
            else
                sb.append('0');
        }
        return sb.toString();
    }
}


//     * Complete the 'findYValue' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER bits
//     *  2. INTEGER maxSet
//     *  3. STRING x
