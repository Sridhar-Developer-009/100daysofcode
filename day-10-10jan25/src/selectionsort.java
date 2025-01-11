import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selection(n,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");  ;
        }
    }
    static void selection(int n,int[] arr){
        for(int i=0;i<n;i++) {
            int last = arr.length - i - 1;
            int maxindex = getMaxIndex(arr, 0, last);
            swap(arr, maxindex, last);
        }


    }
    static void swap(int[] arr,int maxindex,int last){
        int temp=arr[last];
        arr[last]=arr[maxindex];
        arr[maxindex]=temp;

    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
