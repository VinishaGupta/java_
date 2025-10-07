package recursion.p1;

public class Main1 {
    public static void main(String[] args) {

    }
    public static void hello1(){
        System.out.println("hello world");
        hello2();
    }

    public static void hello2(){
        System.out.println("hello world");
        hello3();
    }

    public static void hello3(){
        System.out.println("hello world");
    }
}
