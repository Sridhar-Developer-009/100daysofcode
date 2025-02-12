import java.util.*;
class pattern1 {

    static void downtriangle(int row,int col){
        //base condition;
        if(row==0){
            return;
        }
        //recursive condition
        if(col<row){
            System.out.print("* ");
            downtriangle(row,col+1);
        }
        else {
            System.out.println();
            downtriangle(row - 1, 0);
        }

    }
        public static void main(String args[]) {
        downtriangle(4,0);
         }

}
