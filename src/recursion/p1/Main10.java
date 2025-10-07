package recursion.p1;

public class Main10 {
    public static void main(String[] args) {
        int n=5;
        fun1(n);
        fun2(n);
    }

    public static void fun1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun1(n--);
    }

    public static void fun2(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun2(--n);
    }
}
