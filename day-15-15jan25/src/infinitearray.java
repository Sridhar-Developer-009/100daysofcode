public class infinitearray {
    public static void main(String[] args){
        int arr[]={3,4,5,6,7,8,9,10};
        int target=8;
        int ansfound=ans(arr,target);
        System.out.print(arr[ansfound]+" at "+"index : "+ansfound);

    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;

        //condition for the target to lie in range
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearchh(arr,target,start,end);
    }
    static int binarysearchh(int arr[],int target,int start,int end){

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