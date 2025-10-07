package random;

// fibonacci

public class Main {
    public static void main(String[] args) {

        int n=8;
        System.out.println((fib1(n)));
        System.out.println(fib2(n));
        fib3(n);
    }

    public static int fib1(int n){
        int a=0;
        int b=1;

        for (int i = 0; i < n; i++) {
            int t=a+b;
            a=b;
            b=t;
        }

        return a;
    }

    public static int fib2(int n){
        if (n<=1){
            return n;
        }

        return fib2(n-1)+fib2(n-2);
    }

    public static void fib3(int n){
        int a=0;
        int b=1;

        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            int t=a+b;
            a=b;
            b=t;

        }
    }
}
