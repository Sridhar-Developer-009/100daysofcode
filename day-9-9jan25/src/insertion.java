import  java.util.*;
class insertion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insert(n,arr);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
    }
    static void insert(int n,int arr[]){
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j);
                }
                else break;
            }
        }

    }
    static void swap(int arr[] , int current ){
    int temp=arr[current];
    arr[current]=arr[current-1];
    arr[current-1]=temp;

    }
}