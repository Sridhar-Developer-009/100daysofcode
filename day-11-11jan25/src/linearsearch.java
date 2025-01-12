//this program is to find index of the target element using linear search
import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
        int index=linearsearch(target,n,arr);
        System.out.print(index);

    }
    static int linearsearch(int target,int n,int[] arr){
        //for empty array
        if(arr.length==0){return -1;}

        //if element exists
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){return i;}
        }

        //no target found return -1;
        return -1;
    }

}