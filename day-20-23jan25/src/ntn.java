public class ntn {
    public static void main(String[] args) {
        int n=5;
        int a=n;
        fun(a,n);
    }
    static void fun(int n,int a){
        if(n>0){
              System.out.println(n);
              fun(n-1, a);

          }
        else {
            if(a>0) {
                fun(n, a - 1);
                System.out.println(a);
            }
        }
    }
}
