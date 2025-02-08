// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char[] array=a.toCharArray();
        char start;
        char end;
        for(char index=0;index<array.length;index++){
            start=array[index];
            end=array[array.length-1-index];
            if(start!=end){
                System.out.print(a+" :not a palindrome");
                return;
            }
           else if(index==array.length/2 && start==end){
                System.out.print(a+" :"+"palindrome");
                return;
            }

        }

    }
}