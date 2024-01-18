package Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 13};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        int flag=0;  //Ascending =0, descending=1
        if(arr[0] >= arr[arr.length-1])   //For descending
            flag=1;

        for(int i=1; i<arr.length; i++){
            //Descending
            if(flag==1){
                if(arr[i-1] < arr[i])
                    return false;
            }
            //Ascending
            else{
                if(arr[i-1] > arr[i])
                    return false;
            }
        }
        return true;
    }
}
