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
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

    }
    static void swap(int[] arr,int i,int correct){
        int temp=arr[correct];
        arr[correct]=arr[i];
        arr[i]=temp;

    }
}
