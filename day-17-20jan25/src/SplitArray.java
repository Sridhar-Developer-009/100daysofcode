
// https://leetcode.com/problems/split-array-largest-sum/
 class SplitArray {
    public static void main(String[] args) {
         int[] nums={7,2,5,8,10};
         int m=2;
         int result=splitArray(nums,m);
        System.out.println(result);
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item of the array
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int i=0;i<nums.length;i++) {
                if (sum + nums[i] < mid) {
                    sum += nums[i];
                }
                else if(sum + nums[i] > mid){
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = nums[i];
                    pieces++;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end; // here start == end
    }
}
