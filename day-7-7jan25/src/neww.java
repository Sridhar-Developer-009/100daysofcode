
//practiceee
public class neww {
    public static void insertionSort(int array[]) {
        int n = array.length;
        int temp;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            for(int i=0;i<j;i++){
                if(array[i]>array[j]){
                    array[j]=array[i];
                    temp=array[i];

                }
                array[i]=key;
            }
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}