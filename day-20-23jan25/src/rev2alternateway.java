public class rev2alternateway {
    public static void main(String[] args) {
        int n=2432;
        //int result =rev2(n);
        boolean result=palin(n);
        System.out.println(result);
    }
    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return  helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n){
        return n;
        }
        return (n%10)*(int)(Math.pow(10,(digits-1)))+helper(n/10,digits-1);
    }

    static boolean palin(int n){
        return n==rev2(n);
    }
}
