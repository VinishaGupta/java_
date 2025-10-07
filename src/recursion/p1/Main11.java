package recursion.p1;

public class Main11 {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(fun1(n));
        System.out.println(fun2(n,0));
        System.out.println(fun3(n));
//        fun4(n); this will print again and again if we added print() in method itself
        fun4(n);
        System.out.println(sum1);

    }

    public static int fun1(int n){

        int a=0;

        while(n>0){
            int mod=n%10;
            a=a*10+mod;
            n=n/10;
        }

        return a;
    }

    public static int fun2(int n,int a){
        if(n==0){
            return  a;
        }

//        this is wrong
//        if(n%10==n){
//            return n;
//        }

        return fun2(n/10,(a*10)+n%10);
    }

    static int sum=0;

    public static int fun3(int n){

        if(n==0){
            return sum;
        }
        sum=sum*10+n%10;
        return fun3(n/10);
    }

    static int sum1=0;

    public static void fun4(int n){

        if(n==0){
            return;
        }
        sum1=sum1*10+n%10;
        fun4(n/10);
    }
}
