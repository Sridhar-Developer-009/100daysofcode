public class sumofdigits {
    public static void main(String[] args) {
        int n=342;
        int result=sum1(n);
        System.out.println(result);
    }
    static int sum(int n){
        if(n==0){

            return 0;
        }
        return n%10+sum(n/10);
    }

//newprb
//to print a reverse num

    static void sum1(int n){
         int s=0;
    if(n==0){

        return ;
    }
    int rem=n%10;
    s=s*10+rem;
    sum1(n/10);
}
}

