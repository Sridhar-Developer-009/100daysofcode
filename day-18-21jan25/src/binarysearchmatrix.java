import java.util.Arrays;

public class binarysearchmatrix {
    public static void main(String[] args) {
        int[][] mat = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        int target = 20;
        System.out.println(Arrays.toString(matrix(mat, target)));

    }

    static int[] matrix(int mat[][],int target){
    int r=0;
    int c=mat.length-1;
            while(c>=0 && r<mat.length){
                if(mat[r][c]==target){
                    return new int[]{r,c};
                }
                if(mat[r][c]<target){
                    r++;
                }
                else{
                    c--;
                }
            }
            return new int[]{-1,-1};
    }
}