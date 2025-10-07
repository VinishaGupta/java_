package Training.Array;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        for (int i = 0, j=a.length-1; i < j; i++,j--) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("reversed: "+ Arrays.toString(a));

    }
}
