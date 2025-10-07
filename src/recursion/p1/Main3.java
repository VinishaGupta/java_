package recursion.p1;

public class Main3 {
    public static void main(String[] args) {

        int n=1;
        fun(n);
    }

    public static void fun(int n){
        if(n>5){
            return;
        }

        System.out.println(n);
        fun(n+1);

    }
}
