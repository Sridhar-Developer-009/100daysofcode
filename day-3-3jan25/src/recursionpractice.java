import java.util.Scanner;

public class recursionpractice {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=fibo(n);
    System.out.println(ans);
     }
static int fibo(int n) {
// base condition
    if (n < 2) {
        return n;
    }
    return fibo( n-1) + fibo ( n-2);
}
}

/*
this wont work for large numbers due to more number of computations.
 */