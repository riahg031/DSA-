package Arrays;

public class PrintSubarrays {
    public static void main(String[] args){
        int[] arr ={90, 56,9, 12, 6, 0, -4};
        printSubarrays(arr);
    }
    public static void printSubarrays(int[] arr){
        int total = 0;
        for(int i=0; i<arr.length; i++){
            int si=i;
            for(int j=i; j<arr.length; j++){
                int ei=j;
                for(int k = si; k<=ei; k++) {
                    System.out.print(arr[k] + " ");
                    total++;
                }
                System.out.println();
            }
        }
        System.out.println("Total: "+ total);
    }
}
