import java.util.Scanner;

class firstcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  the size of the array
      int n = sc.nextInt();
        int nums[] = new int[n];

        //  the array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Finding the count of numbers with even digits
        int result = findNumbers(nums);
        System.out.println(result);

        sc.close(); // Closing the scanner to avoid resource leaks
    }

    static int findNumbers(int[] nums) {
        int totalcount = 0;

        // Counting digits in each number
        for (int num : nums) {
            int noofdigits = 0;
            while (num != 0) {
                noofdigits++;
                num = num / 10;
            }
            if (noofdigits % 2 == 0) {
                totalcount++;
            }
        }

        return totalcount;
    }
}
