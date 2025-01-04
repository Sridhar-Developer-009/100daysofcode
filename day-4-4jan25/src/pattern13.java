import java.util.*;
class pattern13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        pattern(n);
    }

    static void pattern(int n){

        for(int row=1;row<=n;row++){

            for(int spaces=1;spaces<=n-row;spaces++) {System.out.print(" ");}
            for(int stars=1;stars<=2*row-1;stars++){if(stars==1 ||stars==2*row-1||row==n) System.out.print("*");
                                                    else System.out.print(" ");}
            System.out.println();
        }
    }
}