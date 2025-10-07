package recursion.p1;

public class Main2 {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        System.out.println(n);
        if(n<5){
            print(n+1);
        }
    }
}
