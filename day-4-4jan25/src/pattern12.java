/*
12th question from pattern file

*/


import  java.util.*;
public class pattern12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);


    }
    static void pattern(int n) {
        for(int row=0;row<n;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }
            for(int star=0;star<=n-row-1;star++){
                System.out.print("* ");
            }
            System.out.println();

        }
        patterndown(n);
    }

    static void patterndown(int n) {
        for(int row=0;row<n;row++){
            for(int space=0;space<n-row-1;space++){
                System.out.print(" ");
            }
            for(int star=0;star<=row;star++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

