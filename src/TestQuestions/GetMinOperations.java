package TestQuestions;

public class GetMinOperations {
    public static void main(String[] args) {
        int[] target = {2,2,3};
        int[] source = {1,2,2};
        System.out.println(getMinOperations(source, target));
    }
    public static int getMinOperations(int[] source, int[] target){
        int operations=0, diff=0;
        for(int i=0; i<source.length; i++){
            int currDiff = target[i] - source[i];
            if(currDiff < 0)
                return -1;  //Impossible to attain target
            else if(currDiff > 0){
                if(diff < currDiff)
                    diff = currDiff;
                operations += diff;
            }
        }
        if(diff >0)
            return operations;
        else
            return -1; //Arrays are always equal
    }
}