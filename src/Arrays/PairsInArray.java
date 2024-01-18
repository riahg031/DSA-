package Arrays;

//Print all the total no of pairs possible in the given array
public class PairsInArray {
    public static void main(String[] args){
        int[]  arr = {90, 56,9, 12, 6, 0, -4};
        printPairs(arr);
    }
    public static void printPairs(int[] arr){
        int totalPairs = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + ","+ arr[j]+ ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+ totalPairs);
    }
}
