import java.util.*;
 class bubblesortlearning {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

       int[] result=  bubblesort(n, Arr);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
        }
    }

    static int[] bubblesort(int n, int Arr[]) {
        int temp;
        for (int k = 0; k < n - 1; k++) {
            // (n-k-1) is for ignoring comparisons of elements which have already been compared in earlier iterations

            for (int i = 0; i < n - k - 1; i++) {
                if (Arr[i] > Arr[i + 1]) {
                    // here swapping of positions is being done.
                    temp = Arr[i];
                    Arr[i] = Arr[i + 1];
                    Arr[i + 1] = temp;
                }
            }
        }
        return Arr;
    }
}