/*5.
question
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */
import  java.util.*;
public class pattern5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);


    }
    static void pattern(int n) {
        for (int row= 1; row <=2*n; row++) {
       if(row<=n){
           for(int col=1;col<=row;col++){
               System.out.print("* ");
           }
       }
       else{
           for(int col=1;col<=(2*n)-row;col++){
               System.out.print("* ");
           }
       }
            System.out.println();
        }
    }
}