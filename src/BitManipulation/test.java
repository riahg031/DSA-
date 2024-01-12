package BitManipulation;

public class test {
    public static void main(String[] args) {
        int[] arr = {5, -4, 1, -3, 1};
        System.out.println(calculateWork(arr));
    }
    public static int calculateWork(int[] arr){
        int n =arr.length;
        int i =0;
        int work = 0;
        while(i < n){
            if(arr[i] < 0){
                int extra = -arr[i];
                int j =0;
                while(j < n){
                    int needed = arr[j];
                    if(needed >= extra){
                        work += (extra*(Math.abs(j-i)));
                        needed = arr[j] = needed - extra;
                        arr[i] = 0;
                        extra = 0;
                    }
                    else if(needed < extra){
                        work += (arr[j]*(Math.abs(j-i)));
                        arr[i] = needed - extra;
                        extra = -arr[i];
                        needed = arr[j] = 0;
                    }
                    if(extra == 0)
                        break;
                    else if(arr[j] == 0)
                        j++;
                }
            }
            i++;
        }
        return work;
    }

}

