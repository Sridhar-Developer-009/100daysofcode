 class Ntotal {
    public static void main(String[] args) {
        int n=5;
        fun(n);

    }

    static void fun(int n) {
        //base case
        if (n == 0) {
            return;
        }
        //recursive case
        System.out.println(n);
        fun(n - 1);
    }
}