/*
12th question from pattern file

*/


import  java.util.*;
public class linesofcodeshort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean up=true;
        int count=0;
        pattern(n,up,count);


    }
    static void pattern(int n,boolean up,int count) {

        int a;
        int b;
        for(int row=0;row<n;row++){
            if(up==true){
                a=row;
                b=n-row-1;
            }
            else{
                 b=row;
                 a=n-row-1;
            }
            for(int space=0;space<a;space++) System.out.print(" ");
            for(int star=0;star<=b;star++){System.out.print("* ");}
            System.out.println();
        }
        up=false;
        count++;
        if(count>1) return ;
        pattern(n,up,count);
    }


}


