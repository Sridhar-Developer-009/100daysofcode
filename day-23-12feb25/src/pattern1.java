import java.util.*;
class pattern1 {
/*
    static void downtriangle(int row,int col){
        //base condition;
        if(row==0){
            return;
        }
        //recursive condition
        if(col<row){
            System.out.print("* ");
            downtriangle(row,col+1);
        }
        else {
            System.out.println();
            downtriangle(row - 1, 0);
        }

    }*/

    //My version on normal triangle
  /*  static void triangle(int row,int col){
        //base condition;
        if(col>=4){
            return;
        }
        //recursive condition
        if(col<=row){
            System.out.print("* ");
            triangle(row,col+1);
        }
        else {
            System.out.println();
            triangle(row + 1, 0);
        }

    }*/

    //kunal sir's version
    /*static void triangle(int row,int col){
        //base condition;
        if(row==0){
            return;
        }
        //recursive condition
        if(col<row){
            triangle(row,col+1);
            System.out.print("* ");
        }
        else {
            triangle(row -1, 0);
            System.out.println();
        }

    }*/

    //kunal sir's selection sort using recursion
   /* static void selection(int arr[],int row ,int col,int max){
        if(row==0){
            return;
        }
        if(col<row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
        }
    }*/

    //kunal sir's bubble
    static void bubble(int arr[] ,int r,int c){
        if(r==0){
            return;
        }
        if(c<r) {
            if (arr[c] > arr[c + 1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);
        }
        else bubble(arr,r-1,0);

    }
        public static void main(String args[]) {
       /* downtriangle(4,0);*/
            int[] arr={4,3,2,1};
            /*selection(arr,0,0);*/
            bubble(arr,arr.length-1,0);
            System.out.println(Arrays.toString(arr));
        /*triangle(4,0);*/
         }

}
