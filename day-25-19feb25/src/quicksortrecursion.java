import java.util.Arrays;

public class quicksortrecursion{
    static void quicksort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        quicksort(arr, low, e);
        quicksort(arr, s, high);

    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

}