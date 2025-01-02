/*question

2.  *
    * *
    * * *
    * * * *
    * * * * *
I've added some spaces in order to look prettier
*/
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
