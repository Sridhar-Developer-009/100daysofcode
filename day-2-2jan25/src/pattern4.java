/*

question
4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5



*/

import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print(col+1+" ");
            }
            System.out.println();
        }
    }

}
