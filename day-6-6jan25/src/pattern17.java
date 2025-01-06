import java.util.*;
public class pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int row=1;row<=2*n-1;row++){
            //spaces
            if(row<=n)
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            if(row>n)
                for(int col=1;col<=row-n;col++){
                    System.out.print(" ");
                }
            //nums
            if(row<=n){
                for(int col=row;col>=1;col--){
                    System.out.print(col);
                }
                for(int col=2;col<=row;col++){
                    System.out.print(col);
                }
            }
            else{
                for(int col=2*n-row;col>=1;col--){
                    System.out.print(col);
                }
                for(int col=2;col<=2*n-row;col++){
                    System.out.print(col);
                }
            }



            System.out.println();
        }


    }
}