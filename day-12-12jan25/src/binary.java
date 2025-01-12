public class binary {
    public static void main(String[] args){
        int arr[]={3,4,5,6,7,8,9,10};
        int target=8;
        int ans=binarysearchh(arr,target);
        System.out.print(ans);

    }
    static int binarysearchh(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid])end=mid-1;
            else return mid;
        }
        return -1;
    }
}