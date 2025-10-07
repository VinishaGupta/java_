package recursion.p1;

public class Main14 {
    public static void main(String[] args) {

        int n=1040300;
        System.out.println(fun1(n));
        System.out.println(fun2(n,0));
        System.out.println(fun3(n));
        System.out.println(fun4(n));
    }

    public static int fun1(int n){
        int count=0;

        while (n>0){
            int mod=n%10;
            if(mod==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static int fun2(int n,int c){

        if(n==0){
            return c;
        }

        int mod=n%10;

        if(mod==0){
            return fun2(n/10,++c);
        }
        else{
            return fun2(n/10,c);
        }
    }

    public static int count=0;

    public static int fun3(int n){

        if(n==0){
            return count;
        }

        int mod=n%10;

        if(mod==0){
            count++;
        }

        return fun3(n/10);
    }

    public static int fun4(int n){
        return helper(n,0);
    }

    public static int helper(int n,int c){
        if(n==0){
            return c;
        }

        int mod=n%10;

        if(mod==0){
            return helper(n/10,++c);
        }
        else {
            return helper(n/10,c);
        }
    }
}
