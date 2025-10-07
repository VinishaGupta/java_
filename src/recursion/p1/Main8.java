package recursion.p1;

public class Main8 {
    public static void main(String[] args) {
        System.out.println(fun1(-1234));
        System.out.println(fun2(1234));
    }

    public static int fun1(int n){
        int sum=0;

//        if (n < 0) {
//            n = Math.abs(n);
//        }

        while(n>0){
            int mod=n%10;
            sum=sum+mod;
            n=n/10;
        }
        return sum;
    }

    public static int fun2(int n){

//        if (n < 0) {
//            n = Math.abs(n);
//        }

        if(n==0){
            return 0;
        }

        return (n%10) + fun2(n/10);
    }


}
