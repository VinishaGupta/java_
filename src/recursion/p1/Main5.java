package recursion.p1;

public class Main5 {
    public static void main(String[] args) {

        fun(5);
    }

    public static void fun(int n){
        if(n<1){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
