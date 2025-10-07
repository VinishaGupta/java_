package random;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int n=8;
        int[] memo=new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println(fib(n,memo));
    }

    public static int fib(int n,int[] memo){
        if (n<=1){
            return n;
        }

        if (memo[n]!=-1){
            return memo[n];
        }

        memo[n]=fib(n-1,memo)+fib(n-2,memo);
        return memo[n];
    }
}
