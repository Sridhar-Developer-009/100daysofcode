/*
8th question from pattern file

 */


import  java.util.*;
public class pattern8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);


    }
    static void pattern(int n) {
        for(int row=0;row<n;row++){
            for(int space=1;space<=n-row-1;space++){
                System.out.print("  ");
            }
            for(int star=1;star<=((2*row)+1);star++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}


