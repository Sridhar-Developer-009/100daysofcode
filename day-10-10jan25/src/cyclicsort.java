import java.util.*;
public class cyclicsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        cyclicsortt(n,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");  ;
        }

    }
    static void cyclicsortt(int n,int[] arr){

        for(int i=0;i<n;i++){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }

        }

    }
    static void swap(int[] arr,int i,int correct){
        int temp=arr[correct];
        arr[correct]=arr[i];
        arr[i]=temp;
    }
}
