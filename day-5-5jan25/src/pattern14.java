/*
question from 14

*/

import java.util.*;
public class pattern14 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    pattern(n);
    }
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <row;spaces++){System.out.print(" ");}
            for(int stars=1;stars<=((2*n)-(2*row)+1);stars++){
                if(stars==1 || row==1 ||stars==((2*n)-(2*row)+1)){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}