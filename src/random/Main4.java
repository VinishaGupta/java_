package random;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
//        switchCase();
        varargs(1,3,5,3,5,7,2);


    }

    public static void switchCase(){
        int n=2;

        switch(n){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("default");
        }
    }

    public static void varargs(int... nums){
        System.out.println(Arrays.toString(nums));

        for(int n : nums){
            System.out.print(n);
        }
    }
}
