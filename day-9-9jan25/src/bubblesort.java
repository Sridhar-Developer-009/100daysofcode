import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble(n,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");  ;
        }

    }
    static void bubble(int n,int[] arr){
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
