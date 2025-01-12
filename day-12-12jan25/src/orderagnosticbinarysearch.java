public class orderagnosticbinarysearch {
    public static void main(String[] args){
        int arr[]={10,9,8,7,5,4,3,2,1   };
        int target=8;
        int ans=binarysearchh(arr,target);
        System.out.print(ans);

    }
    static int binarysearchh(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        //find whether array is sorted in asceding or descending
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) end = mid - 1;
            }
            else {
                if (target > arr[mid]) {
                     end= mid - 1;
                } else if (target < arr[mid]) start= mid+1;
            }
        }
        return -1;
    }
}