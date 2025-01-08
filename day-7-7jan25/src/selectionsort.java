public class selectionsort {
    // Function to perform selection sort on an array
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted portion of the array
            int maxIndex = i;
            // Search for the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted portion
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};
        System.out.println("Before Selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Sort the array using the selection sort
        selectionSort(arr);
        // Print the sorted array
        System.out.println("After Selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}