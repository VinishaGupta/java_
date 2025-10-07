package Training.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=in.nextInt();
        int[] arr=new int[size];
        int sum=0;


        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
            sum+=arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: "+sum);
        int avg=sum/ arr.length;
        System.out.println("Avg: "+avg);





    }
}
