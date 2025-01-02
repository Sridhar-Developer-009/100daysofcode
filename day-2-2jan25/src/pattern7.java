/*
7th question from pattern file

 */


import  java.util.*;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);


    }
    static void pattern(int n) {
        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print("  ");
            }
            for(int star=1;star<=n-row+1;star++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}