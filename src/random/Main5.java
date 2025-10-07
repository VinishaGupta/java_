package random;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        int[][] arr=new int[3][3];

        Scanner in=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextInt();
            }

        }

        System.out.println(Arrays.deepToString(arr));

        for(int[] i: arr){
            System.out.println(Arrays.toString(i));
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        for(int[] n:arr){
            for(int i:n){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
