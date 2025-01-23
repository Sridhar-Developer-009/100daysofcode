public class onetoN {
    public static void main(String[] args) {
        int n=5;
        int a=1;
        fun(n,a);
    }
    static void fun(int n,int a){
        if(a>n){
            return;
        }
        System.out.println(a);
        a++;
        fun(n,a);

    }
}
