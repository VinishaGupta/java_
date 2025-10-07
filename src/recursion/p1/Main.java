package recursion.p1;

public class Main {
    public static void main(String[] args) {
        hello();
//        this only prints once but what if we want to print multiple times. we can call
//        function again and again but it is not efficient
    }

    public static void hello(){
        System.out.println("hello world");
    }
}
