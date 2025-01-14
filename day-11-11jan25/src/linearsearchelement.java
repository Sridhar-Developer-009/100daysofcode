//this program is to find element  using linear search
import java.util.*;
public class linearsearchelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
        boolean index=linearsearch(target,n,arr);
        System.out.print(index);

    }
    static boolean linearsearch(int target,int n,int[] arr){
        //for empty array
        if(arr.length==0){return false;}

        //if element exists
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        //no target found return -1;
        return false;
    }

}