package recursion.p1;

//product odf digits

public class Main9 {
    public static void main(String[] args) {

        int n=1234;
        System.out.println(fun1(n));
        System.out.println(fun2(n));
    }

    public static int fun1(int n){

        int product=1;

        while (n>0){
            int mod=n%10;
            product*=mod;
            n/=10;
        }
        return product;
    }

    public static int fun2(int n){

        if(n==0){
            return 1;
        }

        return n%10 * fun2(n/10);
    }
}
