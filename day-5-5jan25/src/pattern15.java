/*
question 15 from patternfile

*/

import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n) {
        for(int row=1;row<=2*n-1;row++){
            if(row<=n) {
                for (int stars = 1; stars<=n+row-1;stars++){
                    if(stars==n-row+1 || stars==n+row-1){System.out.print("*");}
                    else System.out.print(" ");
                }
            }
            else {
                for (int stars = 1; stars<=3*n-row-1;stars++){
                    if(stars==row-n+1 || stars==3*n-row-1){System.out.print("*");}
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}