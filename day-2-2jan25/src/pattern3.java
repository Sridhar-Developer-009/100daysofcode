/*
questions
3.  * * * * *
    * * * *
    * * *
    * *
    *


*/
import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        pattern(n);

    }

    static void pattern(int n){
        for(int row=0;row<n;row++){
            for(int col=row;col<n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
